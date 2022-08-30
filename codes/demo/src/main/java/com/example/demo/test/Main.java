package com.example.demo.test;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application{//写一个类继承application

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        //FXMLLoader fxml文件是个容器
        AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("main.fxml"));

        //Scene创建一个场景
        Scene scene = new Scene(anchorPane);


        //把场景放到舞台上去
        stage.setScene(scene);

        stage.show();
    }

}
