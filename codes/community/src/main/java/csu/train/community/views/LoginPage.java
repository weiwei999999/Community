package csu.train.community.views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
//这是主页，轻易不要动，想动在群里说一下

public class LoginPage extends Application {
    public  static  Stage theStage;

    public static void main(String[] args) { launch(args);}

    @Override
    public void start(Stage stage) throws Exception {

       // <<<<<<< HEAD
       AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("worker.fxml"));
//=======
       // AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("login.fxml"));
//>>>>>>> 5b5dbd480e0e225b5163154bc341242865dd4129



        //AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("worker.fxml"));

      //  AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("login.fxml"));

           stage.initStyle(StageStyle.TRANSPARENT);

        Scene scene = new Scene(anchorPane);
        scene.setFill(Paint.valueOf("#ffffff00"));
       scene.getStylesheets().add(getClass().getResource("css/workermain.css").toExternalForm());//导入css样式表

        stage.setScene(scene);

        stage.show();

    }
}
