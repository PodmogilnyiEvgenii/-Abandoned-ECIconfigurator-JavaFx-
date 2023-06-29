package com.home.eciconfigurator.view;

import com.home.eciconfigurator.dto.Device;
import com.home.eciconfigurator.dto.TableRow;
import com.home.eciconfigurator.localization.Translator;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;

@Slf4j
public class DeviceTableUpdate {
    public static void action(TableView<TableRow> table, Device device) {

        TableRow columns = new TableRow("Parameters", "Value", "Description");

        ArrayList<String> parameters = new ArrayList<>();
        parameters.add("deviceType");
        parameters.add("id");
        parameters.add("name");
        parameters.add("firmwareVer");
        parameters.add("mbAddress");
        parameters.add("mbSpeed");

        TableUpdate.update(table, device, columns, parameters);
    }
}