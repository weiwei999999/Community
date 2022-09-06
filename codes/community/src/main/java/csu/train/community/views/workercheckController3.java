package csu.train.community.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class workercheckController3 implements Initializable {
    @FXML
    private TableColumn<check, String> finishren;

    @FXML
    private TableColumn<check, String> finishwu;

    @FXML
    private TableColumn<check, CheckBoxTableCell> finishtowait;

    @FXML
    private TableView<check> finishtable;

    private ObservableList<check> checkData = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        checkData.add(new check("mingming","5grejtjnb","shvhivhioa","nnnnnn",0.1));
        finishren.setCellValueFactory(celldate->celldate.getValue().nameProperty());
        finishwu.setCellValueFactory(cellDate->cellDate.getValue().shenqingwuProperty());
        finishtowait.setCellFactory(cellDate->new CheckBoxTableCell<>());
        finishtable.setEditable(true);
        finishtable.setItems(checkData);
    }

}
