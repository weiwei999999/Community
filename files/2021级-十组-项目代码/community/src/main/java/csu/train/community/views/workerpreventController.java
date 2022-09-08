package csu.train.community.views;
import csu.train.community.dao.RoleDao;
import csu.train.community.vo.Role;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;


public class workerpreventController implements Initializable {


    @FXML
    private AnchorPane workerpreventpage;

    @FXML
    private TableColumn<Role, String> waidiname;

    @FXML
    private TableColumn<Role, String> waiditime;

    @FXML
    private TableColumn<Role, String> waidilast;

    @FXML
    private TableColumn<Role, String> waidiplace;

    @FXML
    private TableColumn<Role, String> waidigrade;

    @FXML
    private TableView<Role> waidi;

    @FXML
    private TextArea covid_text;

    @FXML
    private Button covid_admit_button;

    private ObservableList<Role> RoleData = FXCollections.observableArrayList();

    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        workerpreventpage.getStylesheets().add(getClass().getResource("css/meihua.css").toExternalForm());

        RoleDao m= new RoleDao();
        //可以参考：Java数据处理的博客UserService服务类进行编写
        List<Role> list = m.getRole();
        //System.out.println(list.get(0).getId());
        //遍历list集合，将数据添加进ObservableList的集合里面
        for (Role f : list) {
            if(f.getWaidi()==1)
            { RoleData.add(f);}}
        waidiname.setCellValueFactory(new PropertyValueFactory<>("name"));
        // sex.setCellValueFactory(new PropertyValueFactory<>("id"));
        waidiplace.setCellValueFactory(new PropertyValueFactory<>("waidiplace"));
        waidigrade.setCellValueFactory(new PropertyValueFactory<>("waidigrade"));
        waidilast.setCellValueFactory(new PropertyValueFactory<>("waidilast"));
        waiditime.setCellValueFactory(new PropertyValueFactory<>("waiditime"));
        waidi.setEditable(true);

        waidi.setItems(RoleData);
    }

    @FXML
    void covid_admit(ActionEvent event) {
        String text = covid_text.getText();
        RoleDao roleDao = new RoleDao();
        roleDao.updateNoticeCovid(1, text);
    }
}
