package csu.train.community.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;

import java.net.URL;
import java.util.ResourceBundle;

public class workercheckController2 implements Initializable {

    @FXML
    private TableColumn<check, CheckBoxTableCell> waittofinish;

    @FXML
    private TableView<check> waittable;


    @FXML
    private TableColumn<check, String> waitwu;

    @FXML
    private TableColumn<check, String> waittime;

    @FXML
    private TableColumn<check,String> waitren;

    @FXML
    private TableColumn<check, CheckBoxTableCell> waittono;

    private ObservableList<check> checkData = FXCollections.observableArrayList();
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        checkData.add(new check("mingming","5grejtjnb","shvhivhioa","nnnnnn",0.2));
        waitren.setCellValueFactory(cellDate->cellDate.getValue().nameProperty());
        waittime.setCellValueFactory(cellDate->cellDate.getValue().waittimeProperty());
        waitwu.setCellValueFactory(cellDate->cellDate.getValue().shenqingwuProperty());
        waittono.setCellFactory(cellDate->new CheckBoxTableCell<>());
        waittofinish.setCellFactory(cellDate->new CheckBoxTableCell<>());
        waittable.setEditable(true);
        waittable.setItems(checkData);
    }
}