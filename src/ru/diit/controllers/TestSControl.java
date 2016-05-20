package ru.diit.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import ru.diit.Main;

/**
 * Created by oit on 18.05.2016.
 */
public class TestSControl {
    @FXML
    private TextField fldAns1;
    @FXML
    private RadioButton rb1True2;
    @FXML
    private RadioButton rb2True2;
    @FXML
    private RadioButton rb1True3;
    @FXML
    private RadioButton rb2True3;
    @FXML
    private RadioButton rb3True3;

    private static int cnt;


    private  static Stage testStage;
    private Stage spareStage;

    public void setTestStage(Stage stage){
        testStage = stage;
    }

    @FXML
    public void initialize(){

    }

    public void goTo2(){
        try {
            if (fldAns1.getText().equals("")) {
                cnt++;
            }
            testStage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("view/tests/s/2.fxml"))));
        } catch (Exception e){e.printStackTrace();}
    }

    public void goTo3(){
        try {
            if (rb1True2.isArmed() && rb2True2.isArmed()){
                cnt++;
            }
            testStage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("view/tests/s/3.fxml"))));
        } catch (Exception e){e.printStackTrace();}
    }

    public void goTo4(){
        try {
            if (rb1True3.isArmed() && (rb2True3.isArmed() && rb3True3.isArmed())){
                cnt++;
            }
            testStage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("view/tests/s/2.fxml"))));
        } catch (Exception e){e.printStackTrace();}
        System.out.println(cnt);
    }

    public void goTo5(){}

    public void goTo6(){}

    public void goTo7(){}

    public void goTo8(){}

    public void goTo9(){}

    public void goTo10(){}

    public void goToFinish(){}

}
