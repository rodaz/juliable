package ru.diit.controllers;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.util.Duration;


/**
 * Created by Alexey on 13.04.2016.
 */
public class EduControl {

    @FXML
    private VBox vboxR;
    @FXML
    private VBox vboxS;
    @FXML
    private VBox vboxE;
    @FXML
    private VBox vboxJK;

//    private Image imgJKTrue = new Image("file:resources/images/jk/tableTrue.jpg");
//    private Image imgJKMin1 = new Image("file:resources/images/jk/min1.jpg");
//    private Image imgJKMin2 = new Image("file:resources/images/jk/min2.jpg");
//    private Image imgJKMin3 = new Image("file:resources/images/jk/min3.jpg");
//    private Image imgJKMin4 = new Image("file:resources/images/jk/min4.jpg");
//    private Image imgJKSynt = new Image("file:resources/images/jk/synt.jpg");

    private Image imgSTrue1 = new Image("file:resources/images/s/true1.jpg");
    private Image imgSTrue2 = new Image("file:resources/images/s/true2.jpg");
    private Image imgSTrue3 = new Image("file:resources/images/s/true3.jpg");
    private Image imgSTrue4 = new Image("file:resources/images/s/true4.jpg");
    private Image imgSTrue5 = new Image("file:resources/images/s/true5.jpg");
    private Image imgSTrue6 = new Image("file:resources/images/s/true6.jpg");
    private Image imgSTrue7 = new Image("file:resources/images/s/true7.jpg");
    private Image imgSTrue8 = new Image("file:resources/images/s/true8.jpg");
    private Image imgSTrue9 = new Image("file:resources/images/s/true9.jpg");
    private Image imgSTrue10 = new Image("file:resources/images/s/true10.jpg");
    private Image imgSTrue11 = new Image("file:resources/images/s/true11.jpg");
    private Image imgSMin1 = new Image("file:resources/images/s/1.jpg");
    private Image imgSMin2 = new Image("file:resources/images/s/2.jpg");
    private Image imgSMin3 = new Image("file:resources/images/s/3.jpg");
    private Image imgSMin4 = new Image("file:resources/images/s/4.jpg");
    private Image imgSMin5 = new Image("file:resources/images/s/5.jpg");
    private Image imgSMin6 = new Image("file:resources/images/s/6.jpg");
    private Image imgSMin7 = new Image("file:resources/images/s/7.jpg");
    private Image imgSMin8 = new Image("file:resources/images/s/8.jpg");
    private Image imgSMin9 = new Image("file:resources/images/s/9.jpg");
    private Image imgSMin10 = new Image("file:resources/images/s/10.jpg");
    private Image imgSMin11 = new Image("file:resources/images/s/11.jpg");
    private Image imgSMin12 = new Image("file:resources/images/s/12.jpg");
    private Image imgSSynt1 = new Image("file:resources/images/s/synt1.jpg");
    private Image imgSSynt2 = new Image("file:resources/images/s/synt2.jpg");
    private Image imgSSynt3 = new Image("file:resources/images/s/synt3.jpg");
    private Image imgSSynt4 = new Image("file:resources/images/s/synt4.jpg");
    private Image imgSSynt5 = new Image("file:resources/images/s/synt5.jpg");
    private Image imgSSynt6 = new Image("file:resources/images/s/synt6.jpg");
    private Image imgSSynt7 = new Image("file:resources/images/s/synt7.jpg");
    private Image imgSSynt8 = new Image("file:resources/images/s/synt8.jpg");
    private Image imgSSynt9 = new Image("file:resources/images/s/synt9.jpg");
    private Image imgSSynt10 = new Image("file:resources/images/s/synt10.jpg");
    private Image imgSSynt11 = new Image("file:resources/images/s/synt11.jpg");
    private Image imgSSynt12 = new Image("file:resources/images/s/synt12.jpg");
    private Image imgSSynt13 = new Image("file:resources/images/s/synt13.jpg");
    private Image imgSSynt14 = new Image("file:resources/images/s/synt14.jpg");


    private ImageView imgViewSTrue1 = new ImageView(imgSTrue1);
    private ImageView imgViewSTrue2 = new ImageView(imgSTrue2);
    private ImageView imgViewSTrue3 = new ImageView(imgSTrue3);
    private ImageView imgViewSTrue4 = new ImageView(imgSTrue4);
    private ImageView imgViewSTrue5 = new ImageView(imgSTrue5);
    private ImageView imgViewSTrue6 = new ImageView(imgSTrue6);
    private ImageView imgViewSTrue7 = new ImageView(imgSTrue7);
    private ImageView imgViewSTrue8 = new ImageView(imgSTrue8);
    private ImageView imgViewSTrue9 = new ImageView(imgSTrue9);
    private ImageView imgViewSTrue10 = new ImageView(imgSTrue10);
    private ImageView imgViewSTrue11 = new ImageView(imgSTrue11);
    private ImageView imgViewSMin1 = new ImageView(imgSMin1);
    private ImageView imgViewSMin2 = new ImageView(imgSMin2);
    private ImageView imgViewSMin3 = new ImageView(imgSMin3);
    private ImageView imgViewSMin4 = new ImageView(imgSMin4);
    private ImageView imgViewSMin5 = new ImageView(imgSMin5);
    private ImageView imgViewSMin6 = new ImageView(imgSMin6);
    private ImageView imgViewSMin7 = new ImageView(imgSMin7);
    private ImageView imgViewSMin8 = new ImageView(imgSMin8);
    private ImageView imgViewSMin9 = new ImageView(imgSMin9);
    private ImageView imgViewSMin10 = new ImageView(imgSMin10);
    private ImageView imgViewSMin11 = new ImageView(imgSMin11);
    private ImageView imgViewSMin12 = new ImageView(imgSMin12);
    private ImageView imgViewSSynt1 = new ImageView(imgSSynt1);
    private ImageView imgViewSSynt2 = new ImageView(imgSSynt2);
    private ImageView imgViewSSynt3 = new ImageView(imgSSynt3);
    private ImageView imgViewSSynt4 = new ImageView(imgSSynt4);
    private ImageView imgViewSSynt5 = new ImageView(imgSSynt5);
    private ImageView imgViewSSynt6 = new ImageView(imgSSynt6);
    private ImageView imgViewSSynt7 = new ImageView(imgSSynt7);
    private ImageView imgViewSSynt8 = new ImageView(imgSSynt8);
    private ImageView imgViewSSynt9 = new ImageView(imgSSynt9);
    private ImageView imgViewSSynt10 = new ImageView(imgSSynt10);
    private ImageView imgViewSSynt11 = new ImageView(imgSSynt11);
    private ImageView imgViewSSynt12 = new ImageView(imgSSynt12);
    private ImageView imgViewSSynt13 = new ImageView(imgSSynt13);
    private ImageView imgViewSSynt14 = new ImageView(imgSSynt14);

    private Group dogMin1;
    private Group dogMin2;
    private Group dogTrue1;
    private Group dogTrue2;
    private Group dogSynt1;
    private Group dogSynt2;
    private Timeline tlMin1;
    private Timeline tlMin2;
    private Timeline tlTrue1;
    private Timeline tlTrue2;
    private Timeline tlSynt1;
    private Timeline tlSynt2;
    private Label lbl1 = new Label("Шаг 1");
    private Label lbl2 = new Label("Шаг 2");

    @FXML
    public void initialize(){
        // Выравниваем по центру
        vboxR.setAlignment(Pos.CENTER);
        vboxS.setAlignment(Pos.CENTER);
        vboxE.setAlignment(Pos.CENTER);
        vboxJK.setAlignment(Pos.CENTER);

    }

    public void viewRMin(){
//        pagination = new Pagination(4);
//        pagination.setPageFactory((Integer pageIndex) -> createPage(pageIndex));
//        vboxR.getChildren().addAll(pagination);
    }

    //---------------------------------------------------------------------------------------
    private void clearSBox(){
        ObservableList<Node> nodes = vboxS.getChildren();
        if (nodes.size() != 0){
            vboxS.getChildren().removeAll(nodes);
        }
    }

    public void viewSTrue(){
        clearSBox();
        if (dogTrue1 == null){
            createDog1True();
        }
        vboxS.getChildren().addAll(lbl1, dogTrue1);
        tlTrue1.play();
    }

    private void createDog1True() {
        dogTrue1 = new Group(imgViewSTrue1);
        dogTrue1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                nextSTrue();
            }
        });
        tlTrue1 = new Timeline(
                new KeyFrame(Duration.millis(2000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogTrue1.getChildren().setAll(imgViewSTrue1);
                    }
                }),
                new KeyFrame(Duration.millis(4000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogTrue1.getChildren().setAll(imgViewSTrue2);
                    }
                }),
                new KeyFrame(Duration.millis(6000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogTrue1.getChildren().setAll(imgViewSTrue3);
                    }
                }),
                new KeyFrame(Duration.millis(8000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogTrue1.getChildren().setAll(imgViewSTrue4);
                    }
                }),
                new KeyFrame(Duration.millis(10000), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        dogTrue1.getChildren().setAll(imgViewSTrue5);
                    }
                }));
        tlTrue1.setCycleCount(1);
    }

    private void nextSTrue() {
        clearSBox();
        if (dogTrue2 == null){
            createDog2True();
        }
        vboxS.getChildren().addAll(lbl2, dogTrue2);
        tlTrue2.play();
    }

    private void createDog2True() {
        dogTrue2 = new Group(imgViewSTrue6);
        dogTrue1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                viewSTrue();
            }
        });
        tlTrue2 = new Timeline(
                new KeyFrame(Duration.millis(2000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogTrue2.getChildren().setAll(imgViewSTrue6);
                    }
                }),
                new KeyFrame(Duration.millis(4000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogTrue2.getChildren().setAll(imgViewSTrue7);
                    }
                }),
                new KeyFrame(Duration.millis(6000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogTrue2.getChildren().setAll(imgViewSTrue8);
                    }
                }),
                new KeyFrame(Duration.millis(8000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogTrue2.getChildren().setAll(imgViewSTrue9);
                    }
                }),
                new KeyFrame(Duration.millis(10000), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        dogTrue2.getChildren().setAll(imgViewSTrue10);
                    }
                }),
                new KeyFrame(Duration.millis(12000), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        dogTrue2.getChildren().setAll(imgViewSTrue11);
                    }
                }));
        tlTrue2.setCycleCount(1);
    }

    public void viewSMin(){
        clearSBox();
        if (dogMin1 == null){
            createDog1Min();
        }
        vboxS.getChildren().addAll(lbl1, dogMin1);
        tlMin1.play();
    }

    private void createDog1Min() {
        dogMin1 = new Group(imgViewSMin1);
        dogMin1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                nextSMin();
            }
        });
        tlMin1 = new Timeline(
                new KeyFrame(Duration.millis(2000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogMin1.getChildren().setAll(imgViewSMin1);
                    }
                }),
                new KeyFrame(Duration.millis(4000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogMin1.getChildren().setAll(imgViewSMin2);
                    }
                }),
                new KeyFrame(Duration.millis(6000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogMin1.getChildren().setAll(imgViewSMin3);
                    }
                }),
                new KeyFrame(Duration.millis(8000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogMin1.getChildren().setAll(imgViewSMin4);
                    }
                }));
        tlMin1.setCycleCount(1);
    }

    private void nextSMin() {
        clearSBox();
        if (dogMin2 == null){
            createDog2Min();
        }
        vboxS.getChildren().addAll(lbl2, dogMin2);
        tlMin2.play();
    }

    private void createDog2Min() {
        dogMin2 = new Group(imgViewSMin5);
        dogMin2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                viewSMin();
            }
        });
        tlMin2 = new Timeline(
                new KeyFrame(Duration.millis(2000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogMin2.getChildren().setAll(imgViewSMin5);
                    }
                }),
                new KeyFrame(Duration.millis(4000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogMin2.getChildren().setAll(imgViewSMin6);
                    }
                }),
                new KeyFrame(Duration.millis(6000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogMin2.getChildren().setAll(imgViewSMin7);
                    }
                }),
                new KeyFrame(Duration.millis(8000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogMin2.getChildren().setAll(imgViewSMin8);
                    }
                }),
                new KeyFrame(Duration.millis(10000), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        dogMin2.getChildren().setAll(imgViewSMin9);
                    }
                }),
                new KeyFrame(Duration.millis(12000), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        dogMin2.getChildren().setAll(imgViewSMin10);
                    }
                }),
                new KeyFrame(Duration.millis(14000), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        dogMin2.getChildren().setAll(imgViewSMin11);
                    }
                }),
                new KeyFrame(Duration.millis(16000), new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        dogMin2.getChildren().setAll(imgViewSMin12);
                    }
                }));
        tlMin2.setCycleCount(1);
    }

    public void viewSSynt(){
        clearSBox();
        if (dogSynt1 == null){
            createDog1Synt();
        }
        vboxS.getChildren().addAll(lbl1, dogSynt1);
        tlSynt1.play();
    }

    private void createDog1Synt() {
        dogSynt1 = new Group(imgViewSSynt1);
        dogSynt1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                nextSSynt();
            }
        });
        tlSynt1 = new Timeline(
                new KeyFrame(Duration.millis(2000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt1.getChildren().setAll(imgViewSSynt1);
                    }
                }),
                new KeyFrame(Duration.millis(4000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt1.getChildren().setAll(imgViewSSynt2);
                    }
                }),
                new KeyFrame(Duration.millis(6000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt1.getChildren().setAll(imgViewSSynt3);
                    }
                }),
                new KeyFrame(Duration.millis(8000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt1.getChildren().setAll(imgViewSSynt4);
                    }
                }),
                new KeyFrame(Duration.millis(10000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt1.getChildren().setAll(imgViewSSynt5);
                    }
                }),
                new KeyFrame(Duration.millis(12000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt1.getChildren().setAll(imgViewSSynt6);
                    }
                }),
                new KeyFrame(Duration.millis(14000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt1.getChildren().setAll(imgViewSSynt7);
                    }
                }));
        tlSynt1.setCycleCount(1);
    }

    private void nextSSynt() {
        clearSBox();
        if (dogSynt2 == null){
            createDog2Synt();
        }
        vboxS.getChildren().addAll(lbl2, dogSynt2);
        tlSynt2.play();
    }

    private void createDog2Synt() {
        dogSynt2 = new Group(imgViewSSynt8);
        dogSynt2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                viewSSynt();
            }
        });
        tlSynt2 = new Timeline(
                new KeyFrame(Duration.millis(2000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt2.getChildren().setAll(imgViewSSynt8);
                    }
                }),
                new KeyFrame(Duration.millis(4000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt2.getChildren().setAll(imgViewSSynt9);
                    }
                }),
                new KeyFrame(Duration.millis(6000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt2.getChildren().setAll(imgViewSSynt10);
                    }
                }));
        tlSynt2.setCycleCount(1);
    }


    //------------------------------------------------------------------------------------------
    public void viewEMin(){
//        vboxE.setAlignment(Pos.CENTER);
//        pagination = new Pagination(4);
//        pagination.setPageFactory((Integer pageIndex) -> createPage(pageIndex));
//        pagination.getStyleClass().add(Pagination.STYLE_CLASS_BULLET);
//        vboxE.getChildren().addAll(pagination);
    }

    public void viewJKTrue(){

    }

    public void viewJKMin(){

    }

    public void viewJKSynt(){

    }
}
