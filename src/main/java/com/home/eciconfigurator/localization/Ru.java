package com.home.eciconfigurator.localization;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ru implements Localization {
    private final static Map<String, String> buttonsMap = new HashMap<>();
    private final static Map<String, Map<String, String>> tabPanesMap = new HashMap<>();
    private final static Map<String, String> messageMap = new HashMap<>();
    private final static Map<String, String> descriptionMap = new HashMap<>();

    static {
        buttonsMap.put("#scanButton", "Сканировать");
        buttonsMap.put("#openButton", "Открыть");
        buttonsMap.put("#closeButton", "Закрыть");
        buttonsMap.put("#readButton", "Прочитать");
        buttonsMap.put("#writeButton", "Записать");
        buttonsMap.put("#saveButton", "Сохранить");
        buttonsMap.put("#loadButton", "Загрузить");
        buttonsMap.put("#localChangeButton", "Русский");
    }

    static {
        Map<String, String> tabPane1 = new HashMap<>();
        tabPane1.put("deviceTab", "Устройство");
        tabPane1.put("options1Tab", "Параметры1");
        tabPane1.put("options2Tab", "Параметры2");
        tabPane1.put("text1Tab", "Текст1");
        tabPane1.put("text2Tab", "Текст2");
        tabPane1.put("text3Tab", "Текст3");
        tabPane1.put("text4Tab", "Текст4");
        tabPane1.put("qrcodeTab", "QR-код");

        tabPanesMap.put("#tabPane", tabPane1);
    }

    static {
        messageMap.put("greetingsMsg", "Выберите COM-порт и нажмите открыть");
        messageMap.put("paramRequestSendMsg", "Параметры запрошены. Ожидается ответ...");
        messageMap.put("paramWriteMsg", "Параметры записаны. Ожидается ответ...");
        messageMap.put("responseReceivedMsg", "Ответ получен");
        messageMap.put("setupDoneMsg", "Параметры установлены");
        messageMap.put("comPortOpenMsg", "COM-порт открыт");
        messageMap.put("comPortFailMsg", "Ошибка открытия COM-порта");
        messageMap.put("comPortCloseMsg", "COM-порт закрыт");
    }

    static {
        descriptionMap.put("deviceType", "Тип устройства");
        descriptionMap.put("id", "Серийный номер");
        descriptionMap.put("name", "Имя устройства");
        descriptionMap.put("firmwareVer", "Версия прошивки");
        descriptionMap.put("mbAddress", "Modbus адрес");
        descriptionMap.put("mbSpeed", "Modbus скорость");
        descriptionMap.put("wifiLogin", "Логин WI-Fi точки доступа");
        descriptionMap.put("wifiPassword", "Пароль WI-FI точки доступа");

        descriptionMap.put("mb_1", "Видимость элементов");
        descriptionMap.put("mb_2", "Отображение текста");
        descriptionMap.put("mb_3", "Цвет баланса");
        descriptionMap.put("mb_4", "Цвет символа предупреждения");
        descriptionMap.put("mb_5", "Цвет линии разделителя");
        descriptionMap.put("mb_6", "Цвет нестандарт. экрана");
        descriptionMap.put("mb_7", "Цвет строки 1");
        descriptionMap.put("mb_8", "Цвет строки 2");
        descriptionMap.put("mb_9", "Цвет строки 3");
        descriptionMap.put("mb_10", "Цвет строки 4");

        descriptionMap.put("mb_11", "Размер шрифта текста");
        descriptionMap.put("mb_12", "Тип символа предупреждения");
        descriptionMap.put("mb_13", "Тип линии разделителя");
        descriptionMap.put("mb_14", "Тип нестандартного экрана");
        descriptionMap.put("mb_15", "Тип анимации смены баланса");
        descriptionMap.put("mb_16", "Тип анимации режима ожидания");
        descriptionMap.put("mb_17", "Время повтора анимации ожидания");
        descriptionMap.put("mb_18", "Тип отображения баланса");

        descriptionMap.put("mb_50", "Яркость");
        descriptionMap.put("mb_51", "Порядок RGB каналов");

        descriptionMap.put("mb_100", "Значение баланса");

        descriptionMap.put("mb_101", "Текст. Строка 1");
        descriptionMap.put("mb_102", "Текст. Строка 1");
        descriptionMap.put("mb_103", "Текст. Строка 1");
        descriptionMap.put("mb_104", "Текст. Строка 1");
        descriptionMap.put("mb_105", "Текст. Строка 1");
        descriptionMap.put("mb_106", "Текст. Строка 1");
        descriptionMap.put("mb_107", "Текст. Строка 1");
        descriptionMap.put("mb_108", "Текст. Строка 1");
        descriptionMap.put("mb_109", "Текст. Строка 1");
        descriptionMap.put("mb_110", "Текст. Строка 1");

        descriptionMap.put("mb_111", "Текст. Строка 2");
        descriptionMap.put("mb_112", "Текст. Строка 2");
        descriptionMap.put("mb_113", "Текст. Строка 2");
        descriptionMap.put("mb_114", "Текст. Строка 2");
        descriptionMap.put("mb_115", "Текст. Строка 2");
        descriptionMap.put("mb_116", "Текст. Строка 2");
        descriptionMap.put("mb_117", "Текст. Строка 2");
        descriptionMap.put("mb_118", "Текст. Строка 2");
        descriptionMap.put("mb_119", "Текст. Строка 2");
        descriptionMap.put("mb_120", "Текст. Строка 2");

        descriptionMap.put("mb_121", "Текст. Строка 3");
        descriptionMap.put("mb_122", "Текст. Строка 3");
        descriptionMap.put("mb_123", "Текст. Строка 3");
        descriptionMap.put("mb_124", "Текст. Строка 3");
        descriptionMap.put("mb_125", "Текст. Строка 3");
        descriptionMap.put("mb_126", "Текст. Строка 3");
        descriptionMap.put("mb_127", "Текст. Строка 3");
        descriptionMap.put("mb_128", "Текст. Строка 3");
        descriptionMap.put("mb_129", "Текст. Строка 3");
        descriptionMap.put("mb_130", "Текст. Строка 3");

        descriptionMap.put("mb_131", "Текст. Строка 4");
        descriptionMap.put("mb_132", "Текст. Строка 4");
        descriptionMap.put("mb_133", "Текст. Строка 4");
        descriptionMap.put("mb_134", "Текст. Строка 4");
        descriptionMap.put("mb_135", "Текст. Строка 4");
        descriptionMap.put("mb_136", "Текст. Строка 4");
        descriptionMap.put("mb_137", "Текст. Строка 4");
        descriptionMap.put("mb_138", "Текст. Строка 4");
        descriptionMap.put("mb_139", "Текст. Строка 4");
        descriptionMap.put("mb_140", "Текст. Строка 4");

        descriptionMap.put("mb_202", "Год (4 цифры)");
        descriptionMap.put("mb_203", "Месяц + день (4 цифры)");
        descriptionMap.put("mb_204", "Время (4 цифры)");
        descriptionMap.put("mb_205", "Целая часть оплаты (рубли 0-65635)");
        descriptionMap.put("mb_206", "Дробная часть оплаты (копейки 0-99)");
        descriptionMap.put("mb_207", "Номер фиск. накопителя (1-4 цифры)");
        descriptionMap.put("mb_208", "Номер фиск. накопителя (5-8 цифры)");
        descriptionMap.put("mb_209", "Номер фиск. накопителя (9-12 цифры)");
        descriptionMap.put("mb_210", "Номер фиск. накопителя (13-16 цифры)");
        descriptionMap.put("mb_211", "Номер фиск. документа (1-2 цифры)");
        descriptionMap.put("mb_212", "Номер фиск. документа (3-6 цифры)");
        descriptionMap.put("mb_213", "Номер фиск. документа (7-10 цифры)");
        descriptionMap.put("mb_214", "Фискальный признак (1-2 цифры)");
        descriptionMap.put("mb_215", "Фискальный признак (3-6 цифры)");
        descriptionMap.put("mb_216", "Фискальный признак (7-10 цифры)");
        descriptionMap.put("mb_217", "Признак расчета");
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
