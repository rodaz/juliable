package ru.diit.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import ru.diit.Main;

import java.io.IOException;

public class MainController {
    private Stage stageEducation;
    private Stage stageMain;
    private Parent rootEducation;

    public void setStageMain(Stage stage){
        this.stageMain = stage;
    }

    public void goToEducation(){
        try {
            rootEducation = FXMLLoader.load(Main.class.getResource("view/education.fxml"));
            stageEducation = new Stage();
            stageEducation.setTitle("Education");
            stageEducation.setResizable(false);
            stageEducation.setScene(new Scene(rootEducation, 700, 829));
            //stageEducation.getScene().getStylesheets().add("ru/diit/view/styles.css");
            stageEducation.show();
            stageMain.close();
        } catch (IOException e) {}
    }
}
