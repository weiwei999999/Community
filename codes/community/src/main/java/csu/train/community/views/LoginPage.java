package csu.train.community.views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
//这是主页，轻易不要动，想动在群里说一下

public class LoginPage extends Application {
    public  static  Stage theStage;

    public static void main(String[] args) { launch(args);}

    @Override
    public void start(Stage stage) throws Exception {
<<<<<<< HEAD
       // <<<<<<< HEAD
       AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("worker.fxml"));
//=======
        //AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("login.fxml"));
//>>>>>>> 5b5dbd480e0e225b5163154bc341242865dd4129
=======


        AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("worker.fxml"));

      //  AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("login.fxml"));

>>>>>>> 9aedaf6cb73c9ca5cfd619074b8d19aee3d3c5dd

        Scene scene = new Scene(anchorPane);
       // scene.getStylesheets().add(getClass().getResource("css/workermain.css").toExternalForm());//导入css样式表

        stage.setScene(scene);

        stage.show();

    }
}
