package csu.train.community.views;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LoginPage extends Application {

    public static void main(String[] args) { launch(args);}

    @Override
    public void start(Stage stage) throws Exception {

        AnchorPane anchorPane = FXMLLoader.load(this.getClass().getResource("loginView.fxml"));

        Scene scene = new Scene(anchorPane);

        stage.setScene(scene);

        stage.show();

    }
}
