module com.home.eciconfigurator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.fasterxml.jackson.databind;
    requires lombok;
    requires org.slf4j;
    requires com.fasterxml.jackson.annotation;
    requires jssc;

    opens com.home.eciconfigurator to javafx.fxml;
    exports com.home.eciconfigurator;
    exports com.home.eciconfigurator.view;
    opens com.home.eciconfigurator.view to javafx.fxml;
    exports com.home.eciconfigurator.dto;
    opens com.home.eciconfigurator.dto to javafx.fxml;
}