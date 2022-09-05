package csu.train.community.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class workermanageController implements Initializable {


    @FXML
    private TableView<househeader> residenttable;

    @FXML
    private TableColumn<househeader, String> dishIdColumn;
    @FXML
    private TableColumn<househeader, String> dishNameColumn;
    @FXML
    private TableColumn<househeader, String> imagePathColumn;
    @FXML
    private TableColumn<househeader, Number> priceColumn;

    String[] food = {"A", "B", "C"};

    private ObservableList<househeader> househeaderData = FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        househeaderData.add(new househeader("D001", "AAA", "imgs/1.png", 52.5));
        househeaderData.add(new househeader("D002", "BBB", "imgs/2.png", 92.5));
        househeaderData.add(new househeader("D003", "CCC", "imgs/3.png", 95.7));
        househeaderData.add(new househeader("D004", "DDD", "imgs/4.png", 41.6));
        househeaderData.add(new househeader("D001", "AAA", "imgs/1.png", 52.5));
        househeaderData.add(new househeader("D002", "BBB", "imgs/2.png", 92.5));
        househeaderData.add(new househeader("D003", "CCC", "imgs/3.png", 95.7));
        househeaderData.add(new househeader("D004", "DDD", "imgs/4.png", 41.6));
        househeaderData.add(new househeader("D001", "AAA", "imgs/1.png", 52.5));
        househeaderData.add(new househeader("D002", "BBB", "imgs/2.png", 92.5));
        househeaderData.add(new househeader("D003", "CCC", "imgs/3.png", 95.7));
        househeaderData.add(new househeader("D004", "DDD", "imgs/4.png", 41.6));



      residenttable.setItems(househeaderData);






    }
}