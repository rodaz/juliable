package ru.diit.controllers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import ru.diit.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

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
    private RadioButton rb3True2;
    @FXML
    private RadioButton rb4True2;
    @FXML
    private RadioButton rb1True3;
    @FXML
    private RadioButton rb2True3;
    @FXML
    private RadioButton rb3True3;
    @FXML
    private RadioButton rb4True3;
    @FXML
    private RadioButton rb5True3;
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

    public static int cnt = 0;
    public static int src = 0;

    private Scene scene1;
    private Scene scene2;
    private Scene scene3;
    private Scene scene4;
    private Scene scene5;
    private Scene scene6;
    private Scene scene7;
    private Scene scene8;
    private Scene scene9;
    private Scene scene10;
    private Scene scene11;
    private ArrayList<Scene> scenes = new ArrayList<>();

    private  static Stage testStage;
    private Stage spareStage;
    private Alert alertEr;
    private Alert alertRes;

    public void setTestStage(Stage stage){
        testStage = stage;
    }

    @FXML
    public void initialize(){
        scenes.add(scene1);
        scenes.add(scene2);
        scenes.add(scene3);
        scenes.add(scene4);
        scenes.add(scene5);
        scenes.add(scene6);
        scenes.add(scene7);
        scenes.add(scene8);
        scenes.add(scene9);
        scenes.add(scene10);
        scenes.add(scene11);
        alertEr = new Alert(Alert.AlertType.ERROR, "Ошибка пользовательского ввода", ButtonType.OK);
        alertEr.setTitle("Ошибка");
        alertEr.setHeaderText(null);

    }
    public void backTo1(){
        if (rb1True2.isSelected() && rb2True2.isSelected()){
            cnt--;
        }
        goTo(1);
    }
    public void backTo2(){
        if (rb1True3.isSelected() && (rb2True3.isSelected() && rb3True3.isSelected())){
            cnt--;
        }
        goTo(2);
    }
    public void backTo3(){
        String str = fld1Ans4.getText()+fld2Ans4.getText()+fld3Ans4.getText()+fld4Ans4.getText()+
                fld5Ans4.getText()+fld6Ans4.getText()+fld7Ans4.getText()+fld8Ans4.getText();
        if (str.equals("01001111")){
            cnt--;
        }
        goTo(3);
    }
    public void backTo4(){
        String str = fld1Ans5.getText()+fld2Ans5.getText()+fld3Ans5.getText()+fld4Ans5.getText()+
                fld5Ans5.getText()+fld6Ans5.getText()+fld7Ans5.getText()+fld8Ans5.getText();
        if (str.equals("11011100")){
            cnt--;
        }
        goTo(4);
    }
    public void backTo5(){
        if (rb2True6.isSelected()){
            cnt--;
        }
        goTo(5);
    }
    public void backTo6(){
        if (fld1Ans7.getText().equals("R") && fld2Ans7.getText().equals("S")){
            cnt--;
        }
        goTo(6);
    }
    public void backTo7(){
        String str = fld1Ans8.getText()+fld2Ans8.getText()+fld3Ans8.getText()+fld4Ans8.getText();
        if (str.equals("SRQQ")){
            cnt--;
        }
        goTo(7);
    }
    public void backTo8(){
        if (fld1Ans9.getText().equals("Хранение")&&fld2Ans9.getText().equals("Сброс")&&
                fld3Ans9.getText().equals("Установка")&&fld4Ans9.getText().equals("")){
            cnt--;
        }
        goTo(8);
    }
    public void backTo9(){
        if (rb3True10.isSelected()){
            cnt++;
        }
        goTo(9);
    }
    public void goTo2(){
        if (fldAns1.getText().equals("комбинационная схема")) {
            cnt++;
        }
        if (!Objects.equals(fldAns1.getText(), "")) {
            goTo(2);
        } else{
            alertEr.show();
        }
    }

    public void goTo3(){
        if (rb1True2.isSelected() && rb2True2.isSelected()){
            cnt++;
        }
        if (rb1True2.isSelected() || rb2True2.isSelected()||rb3True2.isSelected()||rb4True2.isSelected()) {
            goTo(3);
        } else{
            alertEr.show();
        }
    }

    public void goTo4(){
        if (rb1True3.isSelected() && (rb2True3.isSelected() && rb3True3.isSelected())){
            cnt++;
        }
        if (rb1True3.isSelected() || rb2True3.isSelected() || rb3True3.isSelected()||
            rb4True3.isSelected()||rb5True3.isSelected()) {
            goTo(4);
        } else{
            alertEr.show();
        }
    }

    public void goTo5(){
        String str = fld1Ans4.getText()+fld2Ans4.getText()+fld3Ans4.getText()+fld4Ans4.getText()+
                fld5Ans4.getText()+fld6Ans4.getText()+fld7Ans4.getText()+fld8Ans4.getText();
        if (str.equals("01001111")){
            cnt++;
        }
        if (str.length() == 8) {
            if (src!=32) {
                goTo(5);
            } else {
                alertRes = new Alert(Alert.AlertType.INFORMATION, "Тестирование окончено. Количество правильных ответов: " +
                        cnt+"/4", ButtonType.OK);
                alertRes.setTitle("Результат");
                alertRes.setHeaderText(null);
                alertRes.show();
                if (cnt == 4) {
                    testStage.getOwner().setUserData(1);
                }
                testStage.close();
            }
        } else{
            alertEr.show();
        }
    }

    public void goTo6(){
        String str = fld1Ans5.getText()+fld2Ans5.getText()+fld3Ans5.getText()+fld4Ans5.getText()+
                fld5Ans5.getText()+fld6Ans5.getText()+fld7Ans5.getText()+fld8Ans5.getText();
        if (str.equals("11011100")){
            cnt++;
        }
        if (str.length() == 8) {
            goTo(6);
        } else{
            alertEr.show();
        }
    }

    public void goTo7(){
        if (rb2True6.isSelected()){
            cnt++;
        }
        if (rb1True6.isSelected()||rb2True6.isSelected()||rb3True6.isSelected()) {
            if (src!=64) {
                goTo(7);
            } else {
                alertRes = new Alert(Alert.AlertType.INFORMATION, "Тестирование окончено. Количество правильных ответов: " +
                        cnt+"/2", ButtonType.OK);
                alertRes.setTitle("Результат");
                alertRes.setHeaderText(null);
                alertRes.show();
                if (cnt == 2) {
                    testStage.getOwner().setUserData(1);
                }
                testStage.close();
            }
        } else{
            alertEr.show();
        }
    }

    public void goTo8(){
        if (fld1Ans7.getText().equals("R") && fld2Ans7.getText().equals("S")){
            cnt++;
        }
        if (!fld1Ans7.getText().equals("") && !fld2Ans7.getText().equals("")) {
            goTo(8);
        } else{
            alertEr.show();
        }
    }

    public void goTo9(){
        String str = fld1Ans8.getText()+fld2Ans8.getText()+fld3Ans8.getText()+fld4Ans8.getText();
        if (str.equals("SRQQ")){
            cnt++;
        }
        if (str.length() == 4) {
            goTo(9);
        } else{
            alertEr.show();
        }
    }

    public void goTo10(){
        if (fld1Ans9.getText().equals("Хранение")&&fld2Ans9.getText().equals("Сброс")&&
                fld3Ans9.getText().equals("Установка")&&fld4Ans9.getText().equals("")){
            cnt++;
        }
        if (!fld1Ans9.getText().equals("")&&!fld2Ans9.getText().equals("")&&
                !fld3Ans9.getText().equals("")) {
            goTo(10);
        } else{
            alertEr.show();
        }
    }

    private void goTo(int value) {

        try {
            if (scenes.get(value)==null) {
                scenes.add(value, new Scene(FXMLLoader.load(Main.class.getResource("view/tests/s/" + value + ".fxml"))));
            }
            testStage.setScene(scenes.get(value));
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
        if (rb1True10.isSelected()||rb2True10.isSelected()||rb3True10.isSelected()) {
            if (src!=128) {
                alert.show();
                testStage.close();
            } else {
                alertRes = new Alert(Alert.AlertType.INFORMATION, "Тестирование окончено. Количество правильных ответов: " +
                        cnt+"/4", ButtonType.OK);
                alertRes.setTitle("Результат");
                alertRes.setHeaderText(null);
                alertRes.show();
                testStage.close();
            }

        } else{
            alertEr.show();
        }

    }

    public void goToClose(){
        testStage.close();
    }


    public void filter4Ans(Event event) {
        String str;
        TextField txt = (TextField)event.getTarget();
        str = txt.getText();
        if (str.length() <= 1){
            if (str.equals("1")||str.equals("0")){
                return;
            }
        }
        txt.setText("");
    }

    public void filter7Ans(Event event){
        TextField input = (TextField)event.getTarget();
        String str = input.getText();
        if (str.length() <= 1){
            if (str.equals("S")||str.equals("R")||str.equals("Q")){
                return;
            }
        }
        input.setText("");
    }
}
