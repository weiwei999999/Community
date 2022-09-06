package csu.train.community.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;

import java.net.URL;
import java.util.ResourceBundle;

public class workercheckController4 implements Initializable {

    @FXML
    private TableView<check> notable;
    @FXML
    private TableColumn<check, String> noren;

    @FXML
    private TableColumn<check, CheckBoxTableCell> notowait;

    @FXML
    private TableColumn<check, String> nowu;

    @FXML
    private TableColumn<check, String> noreason;

    private ObservableList<check> checkData = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        checkData.add(new check("mingming","5grejtjnb","shvhivhioa","nnnnnn",0.1));
        noren.setCellValueFactory(cellDate->cellDate.getValue().nameProperty());
        noreason.setCellValueFactory(cellDate->cellDate.getValue().refusereaonProperty());
        nowu.setCellValueFactory(cellDate->cellDate.getValue().shenqingwuProperty());
        notowait.setCellFactory(cellDate->new CheckBoxTableCell<>());
        notable.setEditable(true);
        notable.setItems(checkData);


    }
}
