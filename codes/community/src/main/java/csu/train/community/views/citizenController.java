package csu.train.community.views;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class citizenController implements Initializable {


    @FXML
    private Button exit;
    @FXML
    private AnchorPane mainview;
    @FXML
    private BorderPane citizenBorder;
    @FXML
    private ImageView central;
    @FXML
    private Button banshi;

    @FXML
    private Button progress;

    @FXML
    private Button tongzhi;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        citizenBorder.getStylesheets().add(getClass().getResource("css/citizen.css").toExternalForm());

    }




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
