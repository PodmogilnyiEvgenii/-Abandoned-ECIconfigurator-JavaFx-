package com.home.eciconfigurator.usb;

import com.home.eciconfigurator.json.JsonUtils;
import com.home.eciconfigurator.view.ViewController;
import jssc.SerialPort;
import jssc.SerialPortException;
import jssc.SerialPortList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
public class ComPort {
    private final ViewController viewController;
    private SerialPort serialPort;

    public List<String> getComPorts() {
        return Arrays.stream(SerialPortList.getPortNames()).toList();
    }

    public void sendRequestDeviceData() {
        if (!serialPort.isOpened()) {
            openPort(serialPort.getPortName());
        }

        if (serialPort.isOpened()) {
            try {
                serialPort.writeString(JsonUtils.getRequestString());
                log.debug("Request sent to COM-port: {}", JsonUtils.getRequestString());
            } catch (SerialPortException e) {
                log.error("COM-port write fail: {}", e.getMessage());
            }
        }
    }

    public void writeDeviceData(String jsonString) {
        if (!serialPort.isOpened()) {
            openPort(serialPort.getPortName());
        }

        if (serialPort.isOpened()) {
            try {
                serialPort.writeString(jsonString);
                log.debug("Parameters sent to COM-port: {}", jsonString);
            } catch (SerialPortException e) {
                log.error("COM-port write fail: {}", e.getMessage());
            }
        }
    }

    public Boolean openPort(String comPortName) {
        try {
            //
            serialPort = new SerialPort(comPortName);
            if (!serialPort.isOpened()) serialPort.openPort();
            serialPort.setParams(SerialPort.BAUDRATE_115200, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);
            serialPort.setEventsMask(SerialPort.MASK_RXCHAR);
            serialPort.addEventListener(new ComPortListener(serialPort, viewController), SerialPort.MASK_RXCHAR);
            return true;
        } catch (SerialPortException e) {
            log.error("COM-port open fail: {}", e.getMessage());
        }
        return false;
    }

    public Boolean closePort() {
        try {
            serialPort.closePort();
            return true;
        } catch (SerialPortException e) {
            log.error("COM-port close fail: {}", e.getMessage());
        }
        return false;
    }

}
