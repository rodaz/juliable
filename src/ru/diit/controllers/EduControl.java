package ru.diit.controllers;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
import ru.diit.Main;


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

    @FXML
    private Button btnMin;
    @FXML
    private Button btnSynt;
    @FXML
    private Button btnTest;

    private static int src = 7;

    private Image imgSTrue1 = new Image("ru/diit/images/s/true1.jpg");
    private Image imgSTrue2 = new Image("ru/diit/images/s/true2.jpg");
    private Image imgSTrue3 = new Image("ru/diit/images/s/true3.jpg");
    private Image imgSTrue4 = new Image("ru/diit/images/s/true4.jpg");
    private Image imgSTrue5 = new Image("ru/diit/images/s/true5.jpg");
    private Image imgSTrue6 = new Image("ru/diit/images/s/true6.jpg");
    private Image imgSTrue7 = new Image("ru/diit/images/s/true7.jpg");
    private Image imgSTrue8 = new Image("ru/diit/images/s/true8.jpg");
    private Image imgSTrue9 = new Image("ru/diit/images/s/true9.jpg");
    private Image imgSTrue10 = new Image("ru/diit/images/s/true10.jpg");
    private Image imgSTrue11 = new Image("ru/diit/images/s/true11.jpg");
    private Image imgSMin1 = new Image("ru/diit/images/s/1.jpg");
    private Image imgSMin2 = new Image("ru/diit/images/s/2.jpg");
    private Image imgSMin3 = new Image("ru/diit/images/s/3.jpg");
    private Image imgSMin4 = new Image("ru/diit/images/s/4.jpg");
    private Image imgSMin5 = new Image("ru/diit/images/s/5.jpg");
    private Image imgSMin6 = new Image("ru/diit/images/s/6.jpg");
    private Image imgSMin7 = new Image("ru/diit/images/s/7.jpg");
    private Image imgSMin8 = new Image("ru/diit/images/s/8.jpg");
    private Image imgSMin9 = new Image("ru/diit/images/s/9.jpg");
    private Image imgSMin10 = new Image("ru/diit/images/s/10.jpg");
    private Image imgSMin11 = new Image("ru/diit/images/s/11.jpg");
    private Image imgSMin12 = new Image("ru/diit/images/s/12.jpg");
    private Image imgSSynt1 = new Image("ru/diit/images/s/synt1.jpg");
    private Image imgSSynt2 = new Image("ru/diit/images/s/synt2.jpg");
    private Image imgSSynt3 = new Image("ru/diit/images/s/synt3.jpg");
    private Image imgSSynt4 = new Image("ru/diit/images/s/synt4.jpg");
    private Image imgSSynt5 = new Image("ru/diit/images/s/synt5.jpg");
    private Image imgSSynt6 = new Image("ru/diit/images/s/synt6.jpg");
    private Image imgSSynt7 = new Image("ru/diit/images/s/synt7.jpg");
    private Image imgSSynt8 = new Image("ru/diit/images/s/synt8.jpg");
    private Image imgSSynt9 = new Image("ru/diit/images/s/synt9.jpg");
    private Image imgSSynt10 = new Image("ru/diit/images/s/synt10.jpg");
    private Image imgSSynt11 = new Image("ru/diit/images/s/synt11.jpg");
    private Image imgSSynt12 = new Image("ru/diit/images/s/synt12.jpg");
    private Image imgSSynt13 = new Image("ru/diit/images/s/synt13.jpg");
    private Image imgSSynt14 = new Image("ru/diit/images/s/synt14.jpg");
    private Image imgSSynt15 = new Image("ru/diit/images/s/synt15.jpg");
    private Image imgSSynt16 = new Image("ru/diit/images/s/synt16.jpg");
    private Image imgSSynt17 = new Image("ru/diit/images/s/synt17.jpg");
    private Image imgSSynt18 = new Image("ru/diit/images/s/synt18.jpg");
    private Image imgSSynt19 = new Image("ru/diit/images/s/synt19.jpg");
    private Image imgSSynt20 = new Image("ru/diit/images/s/synt20.jpg");
    private Image imgSSynt21 = new Image("ru/diit/images/s/synt21.jpg");
    private Image imgSSynt22 = new Image("ru/diit/images/s/synt22.jpg");
    private Image imgSSynt23 = new Image("ru/diit/images/s/synt23.jpg");
    private Image imgSSynt24 = new Image("ru/diit/images/s/synt24.jpg");
    private Image imgSSynt25 = new Image("ru/diit/images/s/synt25.jpg");


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
    private ImageView imgViewSSynt15 = new ImageView(imgSSynt15);
    private ImageView imgViewSSynt16 = new ImageView(imgSSynt16);
    private ImageView imgViewSSynt17 = new ImageView(imgSSynt17);
    private ImageView imgViewSSynt18 = new ImageView(imgSSynt18);
    private ImageView imgViewSSynt19 = new ImageView(imgSSynt19);
    private ImageView imgViewSSynt20 = new ImageView(imgSSynt20);
    private ImageView imgViewSSynt21 = new ImageView(imgSSynt21);
    private ImageView imgViewSSynt22 = new ImageView(imgSSynt22);
    private ImageView imgViewSSynt23 = new ImageView(imgSSynt23);
    private ImageView imgViewSSynt24 = new ImageView(imgSSynt24);
    private ImageView imgViewSSynt25 = new ImageView(imgSSynt25);

    private Group dogMin1;
    private Group dogMin2;
    private Group dogTrue1;
    private Group dogTrue2;
    private Group dogSynt1;
    private Group dogSynt2;
    private Group dogSynt3;
    private Group dogSynt4;
    private Group dogSynt5;
    private Group dogSynt6;
    private Timeline tlMin1;
    private Timeline tlMin2;
    private Timeline tlTrue1;
    private Timeline tlTrue2;
    private Timeline tlSynt1;
    private Timeline tlSynt2;
    private Timeline tlSynt3;
    private Timeline tlSynt4;
    private Timeline tlSynt5;
    private Timeline tlSynt6;
    private Label lbl1 = new Label("Шаг 1");
    private Label lbl2 = new Label("Шаг 2");
    private Label lbl3 = new Label("Шаг 3");
    private Label lbl4 = new Label("Шаг 4");
    private Label lbl5 = new Label("Шаг 5");
    private Label lbl6 = new Label("Шаг 6");
    private Stage stageMain;
    private Stage testStage;

    @FXML
    private VBox vboxSrc;

    @FXML
    public void initialize(){
        vboxSrc.setAlignment(Pos.CENTER);
        vboxR.setAlignment(Pos.CENTER);
        vboxS.setAlignment(Pos.CENTER);
        vboxE.setAlignment(Pos.CENTER);
        vboxJK.setAlignment(Pos.CENTER);

    }

    private void clearSBox(){
        ObservableList<Node> nodes = vboxS.getChildren();
        if (nodes.size() != 0){
            vboxS.getChildren().removeAll(nodes);
        }
    }

    public void viewSTrue(){
        src = 7;
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
        dogTrue2.setOnMouseClicked(new EventHandler<MouseEvent>() {
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
                        btnTest.setVisible(true);
                    }
                }));
        tlTrue2.setCycleCount(1);
    }

    public void viewSMin(){
        src = 8;
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
                        btnTest.setVisible(true);
                    }
                }));
        tlMin2.setCycleCount(1);
    }

    public void viewSSynt(){
        src = 9;
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
                next2SSynt();
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

    private void next2SSynt(){
        clearSBox();
        if (dogSynt3 == null){
            createDog3Synt();
        }
        vboxS.getChildren().addAll(lbl3, dogSynt3);
        tlSynt3.play();
    }

    private void createDog3Synt() {
        dogSynt3 = new Group(imgViewSSynt11);
        dogSynt3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                next3SSynt();
            }
        });
        tlSynt3 = new Timeline(
                new KeyFrame(Duration.millis(2000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt3.getChildren().setAll(imgViewSSynt11);
                    }
                }),
                new KeyFrame(Duration.millis(4000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt3.getChildren().setAll(imgViewSSynt12);
                    }
                }),
                new KeyFrame(Duration.millis(6000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt3.getChildren().setAll(imgViewSSynt13);
                    }
                }),
                new KeyFrame(Duration.millis(8000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt3.getChildren().setAll(imgViewSSynt14);
                    }
                }));
        tlSynt3.setCycleCount(1);
    }

    private void next3SSynt(){
        clearSBox();
        if (dogSynt4 == null){
            createDog4Synt();
        }
        vboxS.getChildren().addAll(lbl4, dogSynt4);
        tlSynt4.play();
    }

    private void createDog4Synt() {
        dogSynt4 = new Group(imgViewSSynt15);
        dogSynt4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                next4SSynt();
            }
        });
        tlSynt4 = new Timeline(
                new KeyFrame(Duration.millis(2000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt4.getChildren().setAll(imgViewSSynt15);
                    }
                }),
                new KeyFrame(Duration.millis(4000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt4.getChildren().setAll(imgViewSSynt16);
                    }
                }),
                new KeyFrame(Duration.millis(6000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt4.getChildren().setAll(imgViewSSynt17);
                    }
                }),
                new KeyFrame(Duration.millis(8000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt4.getChildren().setAll(imgViewSSynt18);
                    }
                }),
                new KeyFrame(Duration.millis(10000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt4.getChildren().setAll(imgViewSSynt19);
                    }
                }),
                new KeyFrame(Duration.millis(12000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt4.getChildren().setAll(imgViewSSynt20);
                    }
                }),
                new KeyFrame(Duration.millis(14000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt4.getChildren().setAll(imgViewSSynt21);
                    }
                }),
                new KeyFrame(Duration.millis(16000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt4.getChildren().setAll(imgViewSSynt22);
                    }
                }));
        tlSynt4.setCycleCount(1);
    }

    private void next4SSynt(){
        clearSBox();
        if (dogSynt5 == null){
            createDog5Synt();
        }
        vboxS.getChildren().addAll(lbl5, dogSynt5);
        tlSynt5.play();
    }

    private void createDog5Synt() {
        dogSynt5 = new Group(imgViewSSynt23);
        dogSynt5.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                viewSSynt();
            }
        });
        tlSynt5 = new Timeline(
                new KeyFrame(Duration.millis(2000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt5.getChildren().setAll(imgViewSSynt23);
                    }
                }),
                new KeyFrame(Duration.millis(4000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt5.getChildren().setAll(imgViewSSynt24);
                    }
                }),
                new KeyFrame(Duration.millis(6000), new EventHandler<ActionEvent>(){
                    @Override
                    public void handle(ActionEvent t) {
                        dogSynt5.getChildren().setAll(imgViewSSynt25);
                        btnTest.setVisible(true);
                    }
                }));
        tlSynt5.setCycleCount(1);
    }

    public void goToTesting(){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(Main.class.getResource("view/preTesting.fxml"));
            Parent rootTest = fxmlLoader.load();
            testStage = new Stage();
            testStage.setTitle("Тестирование");
            testStage.setResizable(false);
            testStage.setScene(new Scene(rootTest, 300, 200));
            MainController mainController = fxmlLoader.getController();
            mainController.setStagePreTest(testStage);
            testStage.show();
            stageMain.close();
        } catch (Exception e){e.printStackTrace();}

    }

    public void setStageMain(Stage stageMain) {
        this.stageMain = stageMain;
    }

    public void goToTrueTest(){
        if (src == 7) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(Main.class.getResource("view/tests/s/1.fxml"));
                Parent rootTest = fxmlLoader.load();
                testStage = new Stage();
                testStage.setTitle("Самотестирование");
                testStage.setResizable(false);
                testStage.setScene(new Scene(rootTest));
                testStage.initModality(Modality.WINDOW_MODAL);
                testStage.initOwner(stageMain);
                TestSControl testSControl = fxmlLoader.getController();
                testSControl.setTestStage(testStage);
                TestSControl.src = 32;
                TestSControl.cnt = 0;
                testStage.showAndWait();
                if ((Integer) stageMain.getUserData() == 1) {
                    btnMin.setDisable(false);
                    btnTest.setVisible(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else if(src == 8){
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(Main.class.getResource("view/tests/s/5.fxml"));
                Parent rootTest = fxmlLoader.load();
                testStage = new Stage();
                testStage.setTitle("Самотестирование");
                testStage.setResizable(false);
                testStage.setScene(new Scene(rootTest));
                testStage.initModality(Modality.WINDOW_MODAL);
                testStage.initOwner(stageMain);
                TestSControl testSControl = fxmlLoader.getController();
                testSControl.setTestStage(testStage);
                TestSControl.src = 64;
                TestSControl.cnt = 0;
                testStage.showAndWait();
                if ((Integer) stageMain.getUserData() == 1) {
                    btnSynt.setDisable(false);
                    btnTest.setVisible(false);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader();
                fxmlLoader.setLocation(Main.class.getResource("view/tests/s/7.fxml"));
                Parent rootTest = fxmlLoader.load();
                testStage = new Stage();
                testStage.setTitle("Самотестирование");
                testStage.setResizable(false);
                testStage.setScene(new Scene(rootTest));
                testStage.initModality(Modality.WINDOW_MODAL);
                testStage.initOwner(stageMain);
                TestSControl testSControl = fxmlLoader.getController();
                testSControl.setTestStage(testStage);
                TestSControl.src = 128;
                TestSControl.cnt = 0;
                testStage.showAndWait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}