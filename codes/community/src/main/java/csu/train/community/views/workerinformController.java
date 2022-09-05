package csu.train.community.views;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.security.PrivateKey;
import java.util.ResourceBundle;

public class workerinformController implements Initializable {
    @FXML
    private AnchorPane workerinformpage;

    @FXML
    private Button workerinform;

    @FXML
    private TextArea content;

    @FXML
    private TextField danwei;

    @FXML
    private Button fujian;

    @FXML
    private TextField title;




    @FXML
    private DatePicker end;

    @FXML
    private DatePicker begin;
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        workerinformpage.getStylesheets().add(getClass().getResource("css/meihua.css").toExternalForm());//导入css样式表
    }



}
