package com.home.eciconfigurator.view;

import com.home.eciconfigurator.dto.Device;
import com.home.eciconfigurator.dto.TableRow;
import javafx.scene.control.TableView;

import java.util.ArrayList;

public class Options1TableUpdate {
    public static void action(TableView<TableRow> table, Device device) {
        TableRow columns = new TableRow("Registers", "Value", "Description");

        ArrayList<String> parameters = new ArrayList<>();
        parameters.add("mb_1");
        parameters.add("mb_2");
        parameters.add("mb_3");
        parameters.add("mb_4");
        parameters.add("mb_5");
        parameters.add("mb_6");
        parameters.add("mb_7");
        parameters.add("mb_8");
        parameters.add("mb_9");
        parameters.add("mb_10");

        TableUpdate.update(table, device, columns, parameters);
    }
}
