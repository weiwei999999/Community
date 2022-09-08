package csu.train.community.views;

import csu.train.community.dao.RoleDao;
import csu.train.community.vo.Role;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class banshi {

    @FXML
    private Button submit;
    @FXML
    private TextArea shenqingcontent;

    @FXML
    void submit(ActionEvent event) {
      String content =shenqingcontent.getText();
        RoleDao op=new RoleDao();
        op.updateservicecontent(content,"1573152761@qq.com");




    }

}