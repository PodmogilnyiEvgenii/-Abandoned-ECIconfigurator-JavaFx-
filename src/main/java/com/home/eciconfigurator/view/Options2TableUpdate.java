package com.home.eciconfigurator.view;

import com.home.eciconfigurator.dto.Device;
import com.home.eciconfigurator.dto.TableRow;
import javafx.scene.control.TableView;

import java.util.ArrayList;

public class Options2TableUpdate {
    public static void action(TableView<TableRow> table, Device device) {
        TableRow columns = new TableRow("Registers", "Value", "Description");

        ArrayList<String> parameters = new ArrayList<>();
        parameters.add("mb_11");
        parameters.add("mb_12");
        parameters.add("mb_13");
        parameters.add("mb_14");
        parameters.add("mb_15");
        parameters.add("mb_16");
        parameters.add("mb_17");
        parameters.add("mb_18");

        parameters.add("mb_50");
        parameters.add("mb_51");

        TableUpdate.update(table, device, columns, parameters);
    }
}
