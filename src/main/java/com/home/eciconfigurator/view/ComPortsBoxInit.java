package com.home.eciconfigurator.view;

import com.home.eciconfigurator.usb.ComPort;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ChoiceBox;

public class ComPortsBoxInit {
    public static void action(ChoiceBox<String> comPortsBox, ComPort comPort) {
        ObservableList<String> comPortList = FXCollections.observableArrayList(comPort.getComPorts());
        comPortsBox.setItems(comPortList);
        comPortsBox.setValue(comPortList.get(0));
    }
}
