package com.home.eciconfigurator.view;

import com.home.eciconfigurator.dto.Device;
import com.home.eciconfigurator.dto.TableRow;
import javafx.scene.control.TableView;

import java.util.ArrayList;
import java.util.HashMap;

public class Text1TableUpdate {
    public static void action(TableView<TableRow> table, Device device) {
        TableRow columns = new TableRow("Registers", "Value", "Description");

        ArrayList<String> parameters = new ArrayList<>();
        parameters.add("mb_100");
        parameters.add("mb_101");
        parameters.add("mb_102");
        parameters.add("mb_103");
        parameters.add("mb_104");
        parameters.add("mb_105");
        parameters.add("mb_106");
        parameters.add("mb_107");
        parameters.add("mb_108");
        parameters.add("mb_109");
        parameters.add("mb_110");

        TableUpdate.update(table, device, columns, parameters);
    }
}
