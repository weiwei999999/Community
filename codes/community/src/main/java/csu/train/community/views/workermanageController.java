package csu.train.community.views;

import csu.train.community.dao.RoleDao;
import csu.train.community.util.ConnectionUtil;
import csu.train.community.vo.Role;
import javafx.beans.Observable;
import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

public class workermanageController implements Initializable {



    @FXML
    private AnchorPane workermanage;

    @FXML
    private TableView<Role> residenttable;

    @FXML
    private TableColumn<Role, String> address;

    @FXML
    private TableColumn<Role, String> phone;

    @FXML
    private TableColumn<Role, String> sex;

    @FXML
    private TableColumn<Role, String> name;

    @FXML
    private TableColumn<Role, String> job;

    @FXML
    private TableColumn<Role, CheckBox> delete;
    @FXML
    private Button managebaocun;


    @FXML
    private TableColumn<Role, Integer> age;
   // String[] food = {"A", "B", "C"};

   // private ObservableList<househeader> househeaderData = FXCollections.observableArrayList();
    private ObservableList<Role> RoleData = FXCollections.observableArrayList();



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){
        workermanage.getStylesheets().add(getClass().getResource("css/yangshi.css").toExternalForm());//导入css样式表


        RoleDao m= new RoleDao();
            //可以参考：Java数据处理的博客UserService服务类进行编写
            List<Role> list = m.getRole();
            //System.out.println(list.get(0).getId());
            //遍历list集合，将数据添加进ObservableList的集合里面
            for (Role f : list) {
                RoleData.add(f);}
                name.setCellValueFactory(new PropertyValueFactory<>("name"));
                sex.setCellValueFactory(new PropertyValueFactory<>("id"));
                address.setCellValueFactory(new PropertyValueFactory<>("address"));
                age.setCellValueFactory(new PropertyValueFactory<>("mailBox"));
                job.setCellValueFactory(new PropertyValueFactory<>("receive_content"));
                phone.setCellValueFactory(new PropertyValueFactory<>("receive_covid_content"));
                delete.setCellValueFactory(cellData ->cellData.getValue().cb.getCheckBox());


                residenttable.setEditable(true);

                residenttable.setItems(RoleData);


          //
        //  residenttable.getItems().set()

    }
    @FXML
    public void mbaocun()
    {
        ObservableList<Role> list = residenttable.getItems();
        for (Role o : list ) {
            if (o.cb.isSelected()) {
                RoleDao m = new RoleDao();
                String mail = o.getMailBox();
                m.delete258( mail);
            }
        }
    }
}