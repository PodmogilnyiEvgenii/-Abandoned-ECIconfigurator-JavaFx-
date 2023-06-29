package com.home.eciconfigurator;

import com.home.eciconfigurator.localization.Translator;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import org.controlsfx.control.StatusBar;

import java.io.IOException;

public class Application extends javafx.application.Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Application.class.getResource("mainView.fxml"));
        fxmlLoader.getController();
        Scene scene = new Scene(fxmlLoader.load(), 550, 575);
        stage.setTitle("ECI configurator v1.0");
        stage.setScene(scene);
        stage.setResizable(true);

        stage.setMinWidth(550);
        stage.setMinHeight(350);

        TabPane tabPane = (TabPane) scene.lookup("#tabPane");
        tabPane.prefHeightProperty().bind(scene.heightProperty());

        TableView deviceTable = (TableView) scene.lookup("#deviceTable");
        deviceTable.prefHeightProperty().bind((tabPane.heightProperty()));
        deviceTable.prefWidthProperty().bind((tabPane.widthProperty()));

        TableView options1Table = (TableView) scene.lookup("#options1Table");
        options1Table.prefHeightProperty().bind((tabPane.heightProperty()));
        options1Table.prefWidthProperty().bind((tabPane.widthProperty()));

        TableView options2Table = (TableView) scene.lookup("#options2Table");
        options2Table.prefHeightProperty().bind((tabPane.heightProperty()));
        options2Table.prefWidthProperty().bind((tabPane.widthProperty()));

        TableView text1Table = (TableView) scene.lookup("#text1Table");
        text1Table.prefHeightProperty().bind((tabPane.heightProperty()));
        text1Table.prefWidthProperty().bind((tabPane.widthProperty()));

        TableView text2Table = (TableView) scene.lookup("#text2Table");
        text2Table.prefHeightProperty().bind((tabPane.heightProperty()));
        text2Table.prefWidthProperty().bind((tabPane.widthProperty()));

        TableView text3Table = (TableView) scene.lookup("#text3Table");
        text3Table.prefHeightProperty().bind((tabPane.heightProperty()));
        text3Table.prefWidthProperty().bind((tabPane.widthProperty()));

        TableView text4Table = (TableView) scene.lookup("#text4Table");
        text4Table.prefHeightProperty().bind((tabPane.heightProperty()));
        text4Table.prefWidthProperty().bind((tabPane.widthProperty()));

        TableView qrCodeTable = (TableView) scene.lookup("#qrCodeTable");
        qrCodeTable.prefHeightProperty().bind((tabPane.heightProperty()));
        qrCodeTable.prefWidthProperty().bind((tabPane.widthProperty()));


/*
        ChangeListener<Number> stageSizeListener = (observableValue, oldValue, newValue) -> {
            System.out.println(stage.getWidth());
        };
        stage.widthProperty().addListener(stageSizeListener);
        stage.heightProperty().addListener(stageSizeListener);
*/
        stage.show();

        Translator.setRussian();
        Translator.translate(fxmlLoader.getController());
    }

    public static void main(String[] args) {
        launch();
    }
}