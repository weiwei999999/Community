package csu.train.community.views;

import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class WorkerController implements Initializable{


    @FXML
    private ImageView drop;
    @FXML
    private ImageView qiehuan2;
    Image ppt =new Image(this.getClass().getResourceAsStream("qiehuan.png"));

    @FXML
    private Button residentManagement;

    @FXML
    private AnchorPane workermain;


    @FXML
    private AnchorPane parent;

    @FXML
    private Button information;

    @FXML
    private Button check;

    @FXML
    private Button illness;

    @FXML
    private Button out;
    @FXML
    private VBox ssssss;




    @Override
   public void initialize(URL url, ResourceBundle resourceBundle) {
       qiehuan2.setImage(ppt);

       ssssss.getStylesheets().add(getClass().getResource("css/meihua.css").toExternalForm());

    }

    @FXML
    public void inform(ActionEvent event) throws Exception{

       // drop.setImage(new Image(this.getClass().getResourceAsStream("../picture/drip-full.png");
        TranslateTransition translate = new TranslateTransition();

        translate.setNode(drop); //drop.setImage(image1);
        translate.setDuration(Duration.millis(500));
       // translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setToX(0.00);
        translate.setToY(0.00);
       // translate.setAutoReverse(true);

        translate.play();//drop.setImage(image2);
        Parent informjiemian=FXMLLoader.load(this.getClass().getResource("workerinform.fxml"));
        parent.getChildren().clear();
        parent.getChildren().add(informjiemian);
        huanye();

    }
    @FXML
    void apply(ActionEvent event) throws Exception{
        //drop.setImage(image1);
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(this.drop);
        translate.setDuration(Duration.millis(500));
        //translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setToX(0);
        translate.setToY(110.0);
      //  translate.setAutoReverse(true);
       // drop.setImage(image2);
        translate.play();
      //  ;

       Parent checkjiemian =FXMLLoader.load(this.getClass().getResource("workercheck.fxml"));
       parent.getChildren().clear();
      parent.getChildren().add(checkjiemian);
        huanye();



    }

    @FXML
    void illness(ActionEvent event) throws  Exception{
       // drop.setImage(image1);
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(this.drop);
        translate.setDuration(Duration.millis(500));
       // translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setToX(0);
        translate.setToY(220);
       // translate.setAutoReverse(true);
        translate.play();
       // drop.setImage(image2);
         huanye();

        Parent preventjiemian=FXMLLoader.load(this.getClass().getResource("workerprevent.fxml"));
        parent.getChildren().clear();

        parent.getChildren().add(preventjiemian);

    }

    @FXML
    void resident(ActionEvent event) throws Exception{
      // drop.setImage(image1);

        TranslateTransition translate = new TranslateTransition();
        translate.setNode(this.drop);
        translate.setDuration(Duration.millis(500));
        //translate.setCycleCount(TranslateTransition.INDEFINITE);
        translate.setToX(0);
        translate.setToY(335);
        //translate.setAutoReverse(true);
        translate.play();
        //drop.setImage(image2);
        Parent managejiemian=FXMLLoader.load(this.getClass().getResource("workermanage.fxml"));
        parent.getChildren().clear();
        parent.getChildren().add(managejiemian);
        huanye();


    }

    @FXML
    void out(ActionEvent event) {
        System.exit(0);
    }
    void huanye() throws Exception
    {

        TranslateTransition translate = new TranslateTransition();
        translate.setNode(this.qiehuan2);
        translate.setDuration(Duration.millis(150));

        translate.setCycleCount(2);
            System.out.println(qiehuan2.getX());
        translate.setByX(0);
        translate.setByY(628);
        translate.setAutoReverse(true);
        translate.play();


    }
}


