package com.home.eciconfigurator.view;

import com.home.eciconfigurator.dto.Device;
import com.home.eciconfigurator.dto.TableRow;
import javafx.scene.control.TableView;

import java.util.ArrayList;
import java.util.HashMap;

public class QrCodeTableUpdate {
    public static void action(TableView<TableRow> table, Device device) {
        TableRow columns = new TableRow("Registers", "Value", "Description");

        ArrayList<String> parameters = new ArrayList<>();
        parameters.add("mb_202");
        parameters.add("mb_203");
        parameters.add("mb_204");
        parameters.add("mb_205");
        parameters.add("mb_206");
        parameters.add("mb_207");
        parameters.add("mb_208");
        parameters.add("mb_209");
        parameters.add("mb_210");
        parameters.add("mb_211");
        parameters.add("mb_212");
        parameters.add("mb_213");
        parameters.add("mb_214");
        parameters.add("mb_215");
        parameters.add("mb_216");
        parameters.add("mb_217");

        TableUpdate.update(table, device, columns, parameters);
    }
}
