package csu.train.community.views;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

public class citizenController {


    @FXML
    private Button Appointment;

    @FXML
    private Button QuitCitizen;

    @FXML
    private Button Suggestion;

    @FXML
    private AnchorPane ViewNotice;

    @FXML
    private Button View;
    @FXML
    private Button exit;
    @FXML
    private AnchorPane mainview;
    @FXML
    private ImageView central;
    @FXML
    private Button banshi;

    @FXML
    private Button jianyi;

    @FXML
    private Button tongzhi;


    @FXML


    void out (ActionEvent event) {
        System.exit(0);
    }
    @FXML
    void change1(ActionEvent event) throws Exception{
        Parent change1= FXMLLoader.load(this.getClass().getResource("banshi.fxml"));
        mainview.getChildren().clear();
        mainview.getChildren().add(change1);

    }

    @FXML
    void change2(ActionEvent event) throws Exception{
        Parent change1= FXMLLoader.load(this.getClass().getResource("tongzhi.fxml"));
        mainview.getChildren().clear();
        mainview.getChildren().add(change1);


    }

    @FXML
    void change3(ActionEvent event) throws Exception{
        Parent change1= FXMLLoader.load(this.getClass().getResource("progress.fxml"));
        mainview.getChildren().clear();
        mainview.getChildren().add(change1);


    }




}
