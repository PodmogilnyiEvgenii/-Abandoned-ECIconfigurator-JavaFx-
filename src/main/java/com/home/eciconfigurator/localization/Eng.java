package com.home.eciconfigurator.localization;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Eng implements Localization {
    private final static Map<String, String> buttonsMap = new HashMap<>();
    private final static Map<String, Map<String, String>> tabPanesMap = new HashMap<>();
    private final static Map<String, String> messageMap = new HashMap<>();
    private final static Map<String, String> descriptionMap = new HashMap<>();

    static {
        buttonsMap.put("#scanButton", "Scan");
        buttonsMap.put("#openButton", "Open");
        buttonsMap.put("#closeButton", "Close");
        buttonsMap.put("#readButton", "Read");
        buttonsMap.put("#writeButton", "Write");
        buttonsMap.put("#saveButton", "Save cfg");
        buttonsMap.put("#loadButton", "Load cfg");
        buttonsMap.put("#localChangeButton", "English");
    }

    static {
        Map<String, String> tabPane1 = new HashMap<>();
        tabPane1.put("deviceTab", "Device");
        tabPane1.put("options1Tab", "Options1");
        tabPane1.put("options2Tab", "Options2");
        tabPane1.put("text1Tab", "Text1");
        tabPane1.put("text2Tab", "Text2");
        tabPane1.put("text3Tab", "Text3");
        tabPane1.put("text4Tab", "Text4");
        tabPane1.put("qrcodeTab", "QR-code");

        tabPanesMap.put("#tabPane", tabPane1);
    }

    static {
        messageMap.put("greetingsMsg", "Select a COM-port and press open");
        messageMap.put("paramRequestSendMsg", "Parameter request sent. Response expected...");
        messageMap.put("paramWriteMsg", "The parameters are written. Response expected...");
        messageMap.put("responseReceivedMsg", "Response received");
        messageMap.put("setupDoneMsg", "Setup done");
        messageMap.put("comPortOpenMsg", "COM-port opened");
        messageMap.put("comPortFailMsg", "COM-port open fail");
        messageMap.put("comPortCloseMsg", "COM-port closed");
    }

    static {
        descriptionMap.put("deviceType", "Device type");
        descriptionMap.put("id", "Serial number");
        descriptionMap.put("name", "Device name");
        descriptionMap.put("firmwareVer", "Firmware version");
        descriptionMap.put("mbAddress", "Modbus address");
        descriptionMap.put("mbSpeed", "Modbus speed");
        descriptionMap.put("wifiLogin", "Login WI-Fi access point");
        descriptionMap.put("wifiPassword", "Password WI-FI access point");

        descriptionMap.put("mb_1", "Element visibility");
        descriptionMap.put("mb_2", "Text visibility");
        descriptionMap.put("mb_3", "Balance color");
        descriptionMap.put("mb_4", "Exception symbol color");
        descriptionMap.put("mb_5", "Separator line color");
        descriptionMap.put("mb_6", "Custom screen color");
        descriptionMap.put("mb_7", "Row color 1");
        descriptionMap.put("mb_8", "Row color 2");
        descriptionMap.put("mb_9", "Row color 3");
        descriptionMap.put("mb_10", "Row color 4");

        descriptionMap.put("mb_11", "Text font size");
        descriptionMap.put("mb_12", "Warning character type");
        descriptionMap.put("mb_13", "Separator line type");
        descriptionMap.put("mb_14", "Custom screen type");
        descriptionMap.put("mb_15", "Balance change animation type");
        descriptionMap.put("mb_16", "Idle mode animation type");
        descriptionMap.put("mb_17", "Wait animation repeat time");
        descriptionMap.put("mb_18", "Balance display type");

        descriptionMap.put("mb_50", "Brightness");
        descriptionMap.put("mb_51", "RGB channel order");

        descriptionMap.put("mb_100", "Balance");

        descriptionMap.put("mb_101", "Text. Line 1");
        descriptionMap.put("mb_102", "Text. Line 1");
        descriptionMap.put("mb_103", "Text. Line 1");
        descriptionMap.put("mb_104", "Text. Line 1");
        descriptionMap.put("mb_105", "Text. Line 1");
        descriptionMap.put("mb_106", "Text. Line 1");
        descriptionMap.put("mb_107", "Text. Line 1");
        descriptionMap.put("mb_108", "Text. Line 1");
        descriptionMap.put("mb_109", "Text. Line 1");
        descriptionMap.put("mb_110", "Text. Line 1");

        descriptionMap.put("mb_111", "Text. Line 2");
        descriptionMap.put("mb_112", "Text. Line 2");
        descriptionMap.put("mb_113", "Text. Line 2");
        descriptionMap.put("mb_114", "Text. Line 2");
        descriptionMap.put("mb_115", "Text. Line 2");
        descriptionMap.put("mb_116", "Text. Line 2");
        descriptionMap.put("mb_117", "Text. Line 2");
        descriptionMap.put("mb_118", "Text. Line 2");
        descriptionMap.put("mb_119", "Text. Line 2");
        descriptionMap.put("mb_120", "Text. Line 2");

        descriptionMap.put("mb_121", "Text. Line 3");
        descriptionMap.put("mb_122", "Text. Line 3");
        descriptionMap.put("mb_123", "Text. Line 3");
        descriptionMap.put("mb_124", "Text. Line 3");
        descriptionMap.put("mb_125", "Text. Line 3");
        descriptionMap.put("mb_126", "Text. Line 3");
        descriptionMap.put("mb_127", "Text. Line 3");
        descriptionMap.put("mb_128", "Text. Line 3");
        descriptionMap.put("mb_129", "Text. Line 3");
        descriptionMap.put("mb_130", "Text. Line 3");

        descriptionMap.put("mb_131", "Text. Line 4");
        descriptionMap.put("mb_132", "Text. Line 4");
        descriptionMap.put("mb_133", "Text. Line 4");
        descriptionMap.put("mb_134", "Text. Line 4");
        descriptionMap.put("mb_135", "Text. Line 4");
        descriptionMap.put("mb_136", "Text. Line 4");
        descriptionMap.put("mb_137", "Text. Line 4");
        descriptionMap.put("mb_138", "Text. Line 4");
        descriptionMap.put("mb_139", "Text. Line 4");
        descriptionMap.put("mb_140", "Text. Line 4");

        descriptionMap.put("mb_202", "Year (4 digits)");
        descriptionMap.put("mb_203", "Month + day (4 digits)");
        descriptionMap.put("mb_204", "Time (4 digits)");
        descriptionMap.put("mb_205", "Integer part of the payment (rubles 0-65635)");
        descriptionMap.put("mb_206", "Fractional part of the payment (penny 0-99)");
        descriptionMap.put("mb_207", "Fiscal drive number (1-4 digits)");
        descriptionMap.put("mb_208", "Fiscal drive number (5-8 digits)");
        descriptionMap.put("mb_209", "Fiscal drive number (9-12 digits)");
        descriptionMap.put("mb_210", "Fiscal drive number (13-16 digits)");
        descriptionMap.put("mb_211", "Fiscal document number (1-2 digits)");
        descriptionMap.put("mb_212", "Fiscal document number (3-6 digits)");
        descriptionMap.put("mb_213", "Fiscal document number (7-10 digits)");
        descriptionMap.put("mb_214", "Fiscal sign (1-2 digits)");
        descriptionMap.put("mb_215", "Fiscal sign (3-6 digits)");
        descriptionMap.put("mb_216", "Fiscal sign (7-10 digits)");
        descriptionMap.put("mb_217", "Settlement attribute");
    }


    @Override
    public Set<String> getButtonsSet() {
        return buttonsMap.keySet();
    }

    @Override
    public String getButtonTranslate(String buttonName) {
        return buttonsMap.get(buttonName);
    }

    @Override
    public Set<String> getTabPanesSet() {
        return tabPanesMap.keySet();
    }

    @Override
    public String getTabTranslate(String tabPaneName, String tabName) {
        return tabPanesMap.get(tabPaneName).get(tabName);
    }

    @Override
    public Map<String, String> getMessageMap() {
        return messageMap;
    }

    @Override
    public String getDescriptionTranslate(String name) {
        return descriptionMap.get(name);
    }
}
