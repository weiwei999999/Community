package csu.train.community.views;

import csu.train.community.dao.RoleDao;
import csu.train.community.vo.Role;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class tongzhi {

    @FXML
    private Label inform;

    @FXML
    private Button known;

    @FXML
    private Button getInform;

    @FXML
    void knownClick(ActionEvent event) {//收到通知
        RoleDao roleDao = new RoleDao();
        roleDao.updateIfReceiveNoticeByMail(LoginPage.sta_person_mailBox, 1);
        //收到通知后，将是否接收到设为1
    }

    @FXML
    void getInfo(ActionEvent event) {//获取通知
        RoleDao roleDao = new RoleDao();
        inform.setText(roleDao.readNotice());
    }


}

