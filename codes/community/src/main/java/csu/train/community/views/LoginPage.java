package csu.train.community.views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
//这是主页，轻易不要动，想动在群里说一下

public class LoginPage extends Application {

    public static String sta_person_mailBox = "0";//全局，随时调取用户邮箱

    public  static  Stage theStage;

    public static void main(String[] args) { launch(args);}

    @Override
    public void start(Stage stage) throws Exception {

       AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("login.fxml"));

       //stage.initStyle(StageStyle.TRANSPARENT);


        Scene scene = new Scene(anchorPane);
        scene.setFill(Paint.valueOf("#ffffff00"));
        scene.getStylesheets().add(getClass().getResource("css/workermain.css").toExternalForm());//导入css样式表

        stage.setScene(scene);

        stage.show();

    }
}
