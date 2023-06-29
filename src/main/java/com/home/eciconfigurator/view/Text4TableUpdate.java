package com.home.eciconfigurator.view;

import com.home.eciconfigurator.dto.Device;
import com.home.eciconfigurator.dto.TableRow;
import javafx.scene.control.TableView;

import java.util.ArrayList;
import java.util.HashMap;

public class Text4TableUpdate {
    public static void action(TableView<TableRow> table, Device device) {
        TableRow columns = new TableRow("Registers", "Value", "Description");

        ArrayList<String> parameters = new ArrayList<>();
        parameters.add("mb_131");
        parameters.add("mb_132");
        parameters.add("mb_133");
        parameters.add("mb_134");
        parameters.add("mb_135");
        parameters.add("mb_136");
        parameters.add("mb_137");
        parameters.add("mb_138");
        parameters.add("mb_139");
        parameters.add("mb_140");

        TableUpdate.update(table, device, columns, parameters);
    }
}
