package com.home.eciconfigurator.view;

import com.home.eciconfigurator.dto.Device;
import com.home.eciconfigurator.dto.TableRow;
import com.home.eciconfigurator.json.JsonUtils;
import com.home.eciconfigurator.localization.Eng;
import com.home.eciconfigurator.localization.Localization;
import com.home.eciconfigurator.localization.Translator;
import com.home.eciconfigurator.usb.ComPort;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.controlsfx.control.StatusBar;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Data
public class ViewController {
    public ChoiceBox<String> comPortsBox;
    public Button openButton;
    public Button closeButton;
    public Button readButton;
    public Button writeButton;
    public StatusBar statusBar;
    public TableView<TableRow> deviceTable;
    public TableView<TableRow> options1Table;
    public TableView<TableRow> options2Table;
    public TableView<TableRow> text1Table;
    public TableView<TableRow> text2Table;
    public TableView<TableRow> text3Table;
    public TableView<TableRow> text4Table;
    public TableView<TableRow> qrCodeTable;
    public VBox mainBox;

    private FileChooser fileChooser = new FileChooser();

//    public Button scanButton;
//    public Button saveButton;
//    public Button loadButton;
//    public Button localChangeButton;
//    public HBox highBox;
//    public TabPane tabPane;
//    public HBox lowBox;
//    public Tab deviceTab;
//    public Tab options1Tab;
//    public Tab options2Tab;
//    public Tab text1Tab;
//    public Tab text2Tab;
//    public Tab text3Tab;
//    public Tab text4Tab;
//    public Tab qrcodeTab;

    private Device device = null; //actual device
    private ComPort comPort = new ComPort(this);

    private Map<String, String> messageMap = new HashMap<>();

    @FXML
    private void initialize() {
        openButton.setDisable(false);
        closeButton.setDisable(true);
        readButton.setDisable(true);
        writeButton.setDisable(true);
        statusBar.setDisable(false);
        statusBar.setText("Выберите COM-порт и нажмите открыть");
        ComPortsBoxInit.action(comPortsBox, comPort);

        FileChooser.ExtensionFilter extFilter = new FileChooser.ExtensionFilter("ECI cfg files (*.cfg)", "*.cfg");
        fileChooser.getExtensionFilters().add(extFilter);

    }

    public void viewUpdate(Device newDevice) {
        device = newDevice;
        DeviceTableUpdate.action(deviceTable, device);
        Options1TableUpdate.action(options1Table, device);
        Options2TableUpdate.action(options2Table, device);
        Text1TableUpdate.action(text1Table, device);
        Text2TableUpdate.action(text2Table, device);
        Text3TableUpdate.action(text3Table, device);
        Text4TableUpdate.action(text4Table, device);
        QrCodeTableUpdate.action(qrCodeTable, device);
    }

    public void scanButtonEvent() {
        ComPortsBoxInit.action(comPortsBox, comPort);
    }

    public void readButtonEvent() {
        comPort.sendRequestDeviceData();
        statusBar.setText(messageMap.get("paramRequestSendMsg"));
    }

    public void writeButtonEvent() {
        String jsonString = JsonUtils.getJsonFromDevice(device);
        comPort.writeDeviceData(jsonString);
        statusBar.setText(messageMap.get("paramWriteMsg"));
    }

    public void responseReceived() {
        statusBar.setText(messageMap.get("responseReceivedMsg"));
    }

    public void setupResponseReceived() {
        statusBar.setText(messageMap.get("setupDoneMsg"));
    }

    public void openPortButtonEvent() {
        if (comPort.openPort(comPortsBox.getValue())) {
            statusBar.setText(messageMap.get("comPortOpenMsg"));
            statusBar.setDisable(true);
            openButton.setDisable(true);
            closeButton.setDisable(false);
            readButton.setDisable(false);
            writeButton.setDisable(false);
            readButtonEvent();
        } else {
            statusBar.setText(messageMap.get("comPortFailMsg"));
        }
    }

    public void closePortButtonEvent() {
        comPort.closePort();
        statusBar.setText(messageMap.get("comPortCloseMsg"));
        statusBar.setDisable(false);
        openButton.setDisable(false);
        closeButton.setDisable(true);
        readButton.setDisable(true);
        writeButton.setDisable(true);
    }

    public void saveButtonEvent() {
        File file = fileChooser.showSaveDialog(mainBox.getScene().getWindow());

        if (file != null) {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
                objectOutputStream.writeObject(device);
            } catch (IOException e) {
                log.error("Save cfg fail: {}", e.getMessage());
            }
        }
    }

    public void loadButtonEvent() {
        File file = fileChooser.showOpenDialog(mainBox.getScene().getWindow());

        if (file != null) {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
                Device newDevice = (Device) objectInputStream.readObject();
                if (newDevice != null) viewUpdate(newDevice);

            } catch (ClassNotFoundException | IOException e) {
                log.error("Load cfg fail: {}", e.getMessage());
            }
        }
    }

    public void localChangeButtonEvent() {

        switch (Translator.getLanguage()) {
            case "Eng" -> {
                Translator.setRussian();
                Translator.translate(this);
                if (device != null) {
                    viewUpdate(device);
                }
            }
            case "Ru" -> {
                Translator.setEnglish();
                Translator.translate(this);
                if (device != null) {
                    viewUpdate(device);
                }
            }
        }
    }
}