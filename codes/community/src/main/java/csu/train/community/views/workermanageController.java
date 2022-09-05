package csu.train.community.views;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class workermanageController implements Initializable {



    @FXML
    private AnchorPane workermanage;

    @FXML
    private TableView<househeader> residenttable;

    @FXML
    private TableColumn<househeader, String> address;

    @FXML
    private TableColumn<househeader, String> phone;

    @FXML
    private TableColumn<househeader, String> sex;

    @FXML
    private TableColumn<househeader, String> name;

    @FXML
    private TableColumn<househeader, String> job;

    @FXML
    private TableColumn<househeader, Integer> age;
   // String[] food = {"A", "B", "C"};

    private ObservableList<househeader> househeaderData = FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        househeaderData.add(new househeader("mingming","male","address",20,"4849595","yyyy"));
        name.setCellValueFactory(celldate->celldate.getValue().nameProperty());
        sex.setCellValueFactory(celldate->celldate.getValue().sexProperty());
        address.setCellValueFactory(celldate->celldate.getValue().addressProperty());
       // age.setCellValueFactory(celldate->celldate.getValue().ageProperty());
        phone.setCellValueFactory(celldate->celldate.getValue().phoneProperty());

        residenttable.setItems(househeaderData);


        workermanage.getStylesheets().add(getClass().getResource("css/yangshi.css").toExternalForm());//导入css样式表



    }
}