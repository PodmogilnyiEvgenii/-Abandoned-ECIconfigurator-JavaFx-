package com.home.eciconfigurator.view;

import com.home.eciconfigurator.dto.Device;
import com.home.eciconfigurator.dto.TableRow;
import javafx.event.EventHandler;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

@Slf4j
@AllArgsConstructor
public class TableOnEditEvent implements EventHandler<TableColumn.CellEditEvent<TableRow, String>> {
    private TableView<TableRow> table;
    private Device device;

    @Override
    public void handle(TableColumn.CellEditEvent<TableRow, String> t) {

        TableRow selectedRow = table.getSelectionModel().getSelectedItem();
        String newValue = t.getNewValue();

        int newValueInt;
        try {
            newValueInt = Integer.parseInt(newValue);
        } catch (NumberFormatException e) {
            log.error("Not int value : {}", e.getMessage());
            newValueInt = -1;
        }

        String name = selectedRow.getName();

        try {
            switch (name) {
                case "name":
                    selectedRow.setValue(newValue);
                    device.setName(newValue);
                    break;

                case "mbAddress":
                    if (newValueInt > 0 && newValueInt < 248) {
                        selectedRow.setValue(newValue);
                        device.setMbAddress(newValue);
                    }
                    break;

                case "mbSpeed":
                    if (newValueInt > -1 && newValueInt < 5) {
                        selectedRow.setValue(newValue);
                        device.setMbSpeed(newValue);
                    }
                    break;

                case "deviceType":
                case "id":
                case "firmwareVer":
                    selectedRow.setValue(t.getOldValue());
                    break;

                default:
                    if (newValueInt > 0) {
                        Field field = device.getClass().getDeclaredField("mb_" + name);
                        field.setAccessible(true);
                        field.set(device, newValue);
                        field.setAccessible(false);
                        selectedRow.setValue(newValue);
                    } else {
                        selectedRow.setValue(t.getOldValue());
                    }
                    break;
            }
        } catch (NoSuchFieldException e) {
            log.error("Wrong table field: {}", e.getMessage());
        } catch (IllegalAccessException e) {
            log.error("IllegalAccessException: {}", e.getMessage());
        }

    }
}
