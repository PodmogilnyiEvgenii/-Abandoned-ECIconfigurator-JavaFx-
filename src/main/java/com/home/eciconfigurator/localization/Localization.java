package com.home.eciconfigurator.localization;

import java.util.Map;
import java.util.Set;

public interface Localization {
    Set<String> getButtonsSet();
    String getButtonTranslate(String buttonName);

    Set<String> getTabPanesSet();
    String getTabTranslate(String tabPaneName,String tabName);

    Map<String,String> getMessageMap();

    String getDescriptionTranslate(String name);
}
