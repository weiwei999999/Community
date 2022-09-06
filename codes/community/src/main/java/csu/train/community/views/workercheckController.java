package csu.train.community.views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class workercheckController implements Initializable {
    @FXML
    private Button no;

    @FXML
    private Button wait;

    @FXML
    private Button finish;

    @FXML
    private AnchorPane checklist;

    @FXML
    private AnchorPane workercheckbutton;

    @FXML
    void waitlist(ActionEvent event) throws Exception{

        Parent waitlistjiemian= FXMLLoader.load(this.getClass().getResource("wait.fxml"));
        checklist.getChildren().clear();
        checklist.getChildren().add(waitlistjiemian);
    }

    @FXML
    void finishlist(ActionEvent event) throws Exception{
        Parent finishlistjiemian= FXMLLoader.load(this.getClass().getResource("finish.fxml"));
        checklist.getChildren().clear();
        checklist.getChildren().add(finishlistjiemian);

    }

    @FXML
    void nolist(ActionEvent event) throws Exception{
        Parent nolistjiemian= FXMLLoader.load(this.getClass().getResource("no.fxml"));
        checklist.getChildren().clear();
        checklist.getChildren().add(nolistjiemian);

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        workercheckbutton.getStylesheets().add(getClass().getResource("css/buttonxiaoguo.css").toExternalForm());//导入css样式表
        workercheckbutton.getStylesheets().add(getClass().getResource("css/meihua.css").toExternalForm());
    }


}
