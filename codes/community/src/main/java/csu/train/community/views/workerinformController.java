package csu.train.community.views;

import csu.train.community.dao.RoleDao;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.security.PrivateKey;
import java.util.Date;
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

    @FXML
    void admit_inform(ActionEvent event) {
        String text = content.getText();
        String title2=title.getText();
        String danwei2=danwei.getText();
        String data1=begin.getValue().toString();
        String data2=end.getValue().toString();

        System.out.println(data1);
        RoleDao roleDao = new RoleDao();

        roleDao.updateNotice(1,title2,data1,data2,danwei2,text);

        for(int citizenId = 1 ; citizenId <= 5 ; citizenId++ ) {
            //发布新通知后，重置所有人的接收状态
            roleDao.updateIfReceiveNoticeById(citizenId,0);
        }
    }

}
