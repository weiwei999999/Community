package com.example.demo.test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextField myAgeTxt;

    @FXML
    Button loginButton;

    //建立一个submit方法，接收ActionEvent事件
    public void submit(ActionEvent actionEvent) {
        //System.out.println("clicked");
    }
}
