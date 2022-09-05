package csu.train.community.views;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;


public class workerpreventController implements Initializable {


    @FXML
    private AnchorPane workerpreventpage;

    @FXML
    private TableColumn<?, ?> waidiname;

    @FXML
    private TableColumn<?, ?> waiditime;

    @FXML
    private TableColumn<?, ?> waidilast;

    @FXML
    private TableColumn<?, ?> waidiplace;

    @FXML
    private TableColumn<?, ?> waidigrade;

    @FXML
    private TableView<?> waidi;

    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        workerpreventpage.getStylesheets().add(getClass().getResource("css/meihua.css").toExternalForm());
    }

}
