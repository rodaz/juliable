package ru.diit.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import ru.diit.Main;

/**
 * Created by oit on 18.05.2016.
 */
public class TestSControl {
    @FXML
    private TextField fldAns1;
    @FXML
    private TextField fld1Ans4;
    @FXML
    private TextField fld2Ans4;
    @FXML
    private TextField fld3Ans4;
    @FXML
    private TextField fld4Ans4;
    @FXML
    private TextField fld5Ans4;
    @FXML
    private TextField fld6Ans4;
    @FXML
    private TextField fld7Ans4;
    @FXML
    private TextField fld8Ans4;
    @FXML
    private TextField fld1Ans5;
    @FXML
    private TextField fld2Ans5;
    @FXML
    private TextField fld3Ans5;
    @FXML
    private TextField fld4Ans5;
    @FXML
    private TextField fld5Ans5;
    @FXML
    private TextField fld6Ans5;
    @FXML
    private TextField fld7Ans5;
    @FXML
    private TextField fld8Ans5;
    @FXML
    private TextField fld1Ans7;
    @FXML
    private TextField fld2Ans7;
    @FXML
    private TextField fld1Ans8;
    @FXML
    private TextField fld2Ans8;
    @FXML
    private TextField fld3Ans8;
    @FXML
    private TextField fld4Ans8;
    @FXML
    private TextField fld1Ans9;
    @FXML
    private TextField fld2Ans9;
    @FXML
    private TextField fld3Ans9;
    @FXML
    private TextField fld4Ans9;

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
    @FXML
    private RadioButton rb1True6;
    @FXML
    private RadioButton rb2True6;
    @FXML
    private RadioButton rb3True6;
    @FXML
    private RadioButton rb1True10;
    @FXML
    private RadioButton rb2True10;
    @FXML
    private RadioButton rb3True10;

    @FXML
    private Label lblFinish;

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
            if (fldAns1.getText().equals("комбинационная схема")) {
                cnt++;
            }
            testStage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("view/tests/s/2.fxml"))));
        } catch (Exception e){e.printStackTrace();}
    }

    public void goTo3(){
        try {
            if (rb1True2.isSelected() && rb2True2.isSelected()){
                cnt++;
            }
            testStage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("view/tests/s/3.fxml"))));
        } catch (Exception e){e.printStackTrace();}
    }

    public void goTo4(){
        try {
            if (rb1True3.isSelected() && (rb2True3.isSelected() && rb3True3.isSelected())){
                cnt++;
            }
            testStage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("view/tests/s/4.fxml"))));
        } catch (Exception e){e.printStackTrace();}
        System.out.println(cnt);
    }

    public void goTo5(){
        String str = fld1Ans4.getText()+fld2Ans4.getText()+fld3Ans4.getText()+fld4Ans4.getText()+
                fld5Ans4.getText()+fld6Ans4.getText()+fld7Ans4.getText()+fld8Ans4.getText();
        if (str.equals("01001111")){
            cnt++;
        }
        try {
            testStage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("view/tests/s/5.fxml"))));
        } catch (Exception e){e.printStackTrace();}
    }

    public void goTo6(){
        String str = fld1Ans5.getText()+fld2Ans5.getText()+fld3Ans5.getText()+fld4Ans5.getText()+
                fld5Ans5.getText()+fld6Ans5.getText()+fld7Ans5.getText()+fld8Ans5.getText();
        if (str.equals("11011100")){
            cnt++;
        }
        try {

            testStage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("view/tests/s/6.fxml"))));
        } catch (Exception e){e.printStackTrace();}
    }

    public void goTo7(){
        if (rb2True6.isSelected()){
            cnt++;
        }
        try {

            testStage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("view/tests/s/7.fxml"))));
        } catch (Exception e){e.printStackTrace();}
    }

    public void goTo8(){
        if (fld1Ans7.getText().equals("R") && fld2Ans7.getText().equals("S")){
            cnt++;
        }
        try {

            testStage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("view/tests/s/8.fxml"))));
        } catch (Exception e){e.printStackTrace();}
    }

    public void goTo9(){
        String str = fld1Ans8.getText()+fld2Ans8.getText()+fld3Ans8.getText()+fld4Ans8.getText();
        if (str.equals("SRQQ")){
            cnt++;
        }
        try {

            testStage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("view/tests/s/9.fxml"))));
        } catch (Exception e){e.printStackTrace();}
    }

    public void goTo10(){
        if (fld1Ans9.getText().equals("Хранение")&&fld2Ans9.getText().equals("Сброс")&&
                fld3Ans9.getText().equals("Установка")&&fld4Ans9.getText().equals("")){
            cnt++;
        }
        try {
            testStage.setScene(new Scene(FXMLLoader.load(Main.class.getResource("view/tests/s/10.fxml"))));
        } catch (Exception e){e.printStackTrace();}
    }

    public void goToFinish(){
        if (rb3True10.isSelected()){
            cnt++;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Тестирование окончено. Количество правильных ответов: "+
                cnt+"/10", ButtonType.OK);
        alert.setTitle("Результаты");
        alert.setHeaderText(null);
        alert.show();
        testStage.close();

    }

    public void goToClose(){
        testStage.close();
    }

}
