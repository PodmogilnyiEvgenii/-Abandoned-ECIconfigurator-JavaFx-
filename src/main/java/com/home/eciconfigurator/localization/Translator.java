package com.home.eciconfigurator.localization;

import com.home.eciconfigurator.view.ViewController;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class Translator {
    private static Localization localization = new Eng();
    private static final Eng eng = new Eng();
    private static final Ru ru = new Ru();

    public static String getLanguage() {
        return localization.getClass().getSimpleName();
    }

    public static void setRussian() {
        localization = ru;
    }

    public static void setEnglish() {
        localization = eng;
    }

    public static void translate(ViewController viewController) {
        Scene scene = viewController.mainBox.getScene();

        for (String nameComponent : localization.getButtonsSet()) {
            try {
                Button component = (Button) scene.lookup(nameComponent);

                if (component != null) {
                    component.setText(localization.getButtonTranslate(nameComponent));
                }
            } catch (ClassCastException e) {
                log.error("Translate component {} fail: {}", nameComponent, e.getMessage());
            }
        }

        for (String nameComponent : localization.getTabPanesSet()) {
            try {
                TabPane component = (TabPane) scene.lookup(nameComponent);

                if (component != null) {
                    for (Tab tab : component.getTabs()) {
                        tab.setText(localization.getTabTranslate(nameComponent, tab.getId()));
                    }
                }

            } catch (ClassCastException e) {
                log.error("Translate component {} fail: {}", nameComponent, e.getMessage());
            }
        }

        viewController.setMessageMap(localization.getMessageMap());
    }

    public static String getTranslateDescription(String name) {
        return localization.getDescriptionTranslate(name);
    }
}
