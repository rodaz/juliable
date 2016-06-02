package ru.diit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.diit.controllers.MainController;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("view/preview.fxml"));
        Parent rootPreview = fxmlLoader.load();
        primaryStage.setTitle("DIIT");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(rootPreview, 400, 257));
        MainController mainController = fxmlLoader.getController();
        mainController.setStageMain(primaryStage);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
