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

@Slf4j
public class TableUpdate {
    public static void update(TableView<TableRow> table, Device device, TableRow columns, ArrayList<String> parameters) {

        table.getItems().clear();
        ArrayList<TableColumn<TableRow, String>> columnList = new ArrayList<>();

        for (Field field : columns.getClass().getDeclaredFields()) {
            String columnLabel = field.getName().substring(0, 1).toUpperCase() + field.getName().substring(1);
            TableColumn<TableRow, String> column = new TableColumn<>(columnLabel);
            column.setCellValueFactory(new PropertyValueFactory<>(field.getName()));

            if (field.getName().equals("value")) {
                column.setCellFactory(TextFieldTableCell.forTableColumn());
                column.setOnEditCommit(new TableOnEditEvent(table, device));
            }
            columnList.add(column);
        }

        table.getColumns().setAll(columnList);
        table.getColumns().get(0).setMaxWidth(140);
        table.getColumns().get(1).setMaxWidth(140);
        table.getColumns().get(2).setMaxWidth(530-280);

        ArrayList<TableRow> rows = new ArrayList<>();

        for (String name : parameters) {
            try {
                Field deviceField = device.getClass().getDeclaredField(name);
                deviceField.setAccessible(true);
                rows.add(new TableRow(name.replace("mb_", ""), (String) deviceField.get(device), Translator.getTranslateDescription(name)));
                deviceField.setAccessible(false);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                log.error("Get TableRow {} fail: {}", name, e.getMessage());
            }
        }

        for (TableRow row : rows) {
            table.getItems().add(row);
        }

        table.setEditable(true);
        //table.getSortOrder().add(table.getColumns().get(0));
    }
}
