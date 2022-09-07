package csu.train.community.views;

import csu.train.community.dao.RoleDao;
import csu.train.community.vo.Role;
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

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class workercheckController4 implements Initializable {

    @FXML
    private TableView<Role> notable;
    @FXML
    private TableColumn<Role, String> noren;

    @FXML
    private Button nocun;
    @FXML
    private TableColumn<Role, CheckBox> notowait;

    @FXML
    private TableColumn<Role, String> nowu;


    private ObservableList<Role> RoleData = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        RoleDao m = new RoleDao();
        //可以参考：Java数据处理的博客UserService服务类进行编写
        List<Role> list = m.getRole();
        //System.out.println(list.get(0).getId());
        //遍历list集合，将数据添加进ObservableList的集合里面

        for (Role f : list) {
            if(f.getService_situation()==3)
            { RoleData.add(f);
                notowait.setCellValueFactory(cellData ->cellData.getValue().cb.getCheckBox());
                noren.setCellValueFactory(new PropertyValueFactory<>("name"));
                nowu.setCellValueFactory(new PropertyValueFactory<>("service_content"));


                notable.setItems(RoleData);}

        }
    }
    @FXML
    void nocun(ActionEvent event) {
        ObservableList<Role> list = notable.getItems();
        for (Role o : list ) {
            if (o.cb.isSelected()) {
                RoleDao m = new RoleDao();
                String mail = o.getMailBox();
                m.updateservice(1, mail);
            }
        }
    }
}
