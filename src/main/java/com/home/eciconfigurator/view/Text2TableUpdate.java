package com.home.eciconfigurator.view;

import com.home.eciconfigurator.dto.Device;
import com.home.eciconfigurator.dto.TableRow;
import javafx.scene.control.TableView;

import java.util.ArrayList;
import java.util.HashMap;

public class Text2TableUpdate {
    public static void action(TableView<TableRow> table, Device device) {
        TableRow columns = new TableRow("Registers", "Value", "Description");

        ArrayList<String> parameters = new ArrayList<>();
        parameters.add("mb_111");
        parameters.add("mb_112");
        parameters.add("mb_113");
        parameters.add("mb_114");
        parameters.add("mb_115");
        parameters.add("mb_116");
        parameters.add("mb_117");
        parameters.add("mb_118");
        parameters.add("mb_119");
        parameters.add("mb_120");

        TableUpdate.update(table, device, columns, parameters);
    }
}
