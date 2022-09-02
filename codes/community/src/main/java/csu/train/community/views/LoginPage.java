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

        AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("login.fxml"));

        Scene scene = new Scene(anchorPane);

        stage.setScene(scene);
        theStage=stage;
        stage.show();

    }
}
