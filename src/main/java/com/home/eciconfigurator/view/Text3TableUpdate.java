package com.home.eciconfigurator.view;

import com.home.eciconfigurator.dto.Device;
import com.home.eciconfigurator.dto.TableRow;
import javafx.scene.control.TableView;

import java.util.ArrayList;
import java.util.HashMap;

public class Text3TableUpdate {
    public static void action(TableView<TableRow> table, Device device) {
        TableRow columns = new TableRow("Registers", "Value", "Description");

        ArrayList<String> parameters = new ArrayList<>();
        parameters.add("mb_121");
        parameters.add("mb_122");
        parameters.add("mb_123");
        parameters.add("mb_124");
        parameters.add("mb_125");
        parameters.add("mb_126");
        parameters.add("mb_127");
        parameters.add("mb_128");
        parameters.add("mb_129");
        parameters.add("mb_130");

        TableUpdate.update(table, device, columns, parameters);
    }
}
