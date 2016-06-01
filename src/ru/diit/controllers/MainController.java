package ru.diit.controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import ru.diit.Main;

import java.io.IOException;

public class MainController {
    private Stage stageEducation;
    private Stage stageMain;
    private static Stage stagePreTest;
    private Stage stageTestS;
    private Parent rootEducation;
    private Parent rootPreTest;
    private Parent rootTestS;


    public void setStagePreTest(Stage stage){this.stagePreTest = stage;}
    public void setStageMain(Stage stage){
        this.stageMain = stage;
    }

    public void goToEducation(){
        try {
//            rootEducation = FXMLLoader.load(Main.class.getResource("view/education.fxml"));
//            stageEducation = new Stage();
//            stageEducation.setTitle("Education");
//            stageEducation.setResizable(false);
//            stageEducation.setScene(new Scene(rootEducation, 700, 829));
//            //stageEducation.getScene().getStylesheets().add("ru/diit/view/styles.css");
//            stageEducation.show();
//            stageMain.close();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(Main.class.getResource("view/education.fxml"));
            rootEducation = fxmlLoader.load();
            stageEducation = new Stage();
            stageEducation.setTitle("Обучение");
            stageEducation.setResizable(false);
            stageEducation.setScene(new Scene(rootEducation, 700, 829));
            EduControl eduControl = fxmlLoader.getController();
            eduControl.setStageMain(stageEducation);
            stageEducation.show();
            stageMain.close();
        } catch (IOException e) {}
    }

    public void goToTesting(){
        TextInputDialog alert = new TextInputDialog();
        alert.setHeaderText("Введите пароль: ");
        alert.setTitle("Авторизация");
        alert.showAndWait();
        if (alert.getResult().equals("12345")) {
            try {
                rootPreTest = FXMLLoader.load(Main.class.getResource("view/preTesting.fxml"));
                stagePreTest = new Stage();
                stagePreTest.setTitle("Тестирование");
                stagePreTest.setResizable(false);
                stagePreTest.setScene(new Scene(rootPreTest, 300, 200));
                //stageEducation.getScene().getStylesheets().add("ru/diit/view/styles.css");
                stagePreTest.show();
                stageMain.close();
            } catch (IOException e) {
            }
        } else {
            Alert alert1 = new Alert(Alert.AlertType.ERROR, "Неверный пароль", ButtonType.OK);
            alert1.setTitle("Ошибка!");
            alert1.setHeaderText(null);
            alert1.show();
        }
    }

    public void goToTestS(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(Main.class.getResource("view/tests/s/1.fxml"));
            rootTestS = fxmlLoader.load();
            stageTestS = new Stage();
            stageTestS.setTitle("Тестирование по S триггеру");
            stageTestS.setResizable(false);
            stageTestS.setScene(new Scene(rootTestS));
            //stageEducation.getScene().getStylesheets().add("ru/diit/view/styles.css");
            TestSControl testSControl = fxmlLoader.getController();
            testSControl.setTestStage(stageTestS);
            TestSControl.cnt = 0;
            stageTestS.show();
            stagePreTest.close();
        } catch (IOException e) {}
    }
}
