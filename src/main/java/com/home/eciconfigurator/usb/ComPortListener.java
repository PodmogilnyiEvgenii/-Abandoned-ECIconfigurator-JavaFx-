package com.home.eciconfigurator.usb;

import com.home.eciconfigurator.dto.Device;
import com.home.eciconfigurator.json.JsonUtils;
import com.home.eciconfigurator.view.ViewController;
import javafx.application.Platform;
import jssc.SerialPort;
import jssc.SerialPortEvent;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Slf4j
public class ComPortListener implements SerialPortEventListener {
    private final String NEWLINE = System.getProperty("line.separator");
    private final SerialPort serialPort;
    private final ViewController viewController;
    private String buffer = "";

    @Override
    public void serialEvent(SerialPortEvent serialPortEvent) {
        try {
            if (serialPortEvent.isRXCHAR() && serialPortEvent.getEventValue() > 0) {
                String receivedData = serialPort.readString(serialPortEvent.getEventValue());

                buffer = buffer + receivedData;

                if (receivedData.contains(NEWLINE)) {
                    String lastMessage = buffer;
                    buffer = "";
                    log.debug("Received response from COM-port: {}", lastMessage);
                    boolean isValidJson = JsonUtils.isValidJsonString(lastMessage);

                    if (isValidJson) {
                        Device device = JsonUtils.getDeviceFromJson(lastMessage);
                        if (device != null) {
                            Platform.runLater(() -> {
                                viewController.responseReceived();
                                viewController.viewUpdate(device);
                            });
                        }
                    }

                    if (lastMessage.replace(NEWLINE, "").equals("Setup done")) {
                        Platform.runLater(() -> {
                            viewController.setupResponseReceived();
                        });
                    }

                }
            }
        } catch (SerialPortException e) {
            log.debug("Error receiving from COM-port: {}", e.getMessage());

        }
    }
}
