package csu.train.community.views;

//登录页的controller，梁泉负责编写



import csu.train.community.dao.RoleDao;
import csu.train.community.model.EmailSend;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.mail.MessagingException;
import java.io.IOException;
import java.sql.SQLException;


public class LoginController {
    int model = 0;
    @FXML
    private CheckBox citizen;

    @FXML
    private Button submitBtn;

    @FXML
    private Button loginBtn;

    @FXML
    private CheckBox worker;

    @FXML
    private ImageView image;
    @FXML
    private TextField email;
    @FXML
    private TextField postword;
    @FXML
    private VBox rcebian;

    public String yanzhengma;
    @FXML
    void send(ActionEvent event) {
        boolean flag;
        String correct = "[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";
        String mail = email.getText();
        flag = mail.matches(correct);
        int ma = number();
        yanzhengma = String.valueOf(ma);

        try {
            new EmailSend().sentSimpleMail("验证码", yanzhengma, email.getText());
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        RoleDao roleDao = new RoleDao();
        if(flag && roleDao.getRoleByMail(mail))//复合格式并且邮箱在数据库里
        {
            LoginPage.sta_person_mailBox = mail;
        }

        else {
            Alert alert = new Alert(Alert.AlertType.ERROR, "请输入正确的邮箱");
            alert.show();
            email.setText("");
        }


    }

    @FXML
    void login(ActionEvent event) {
     if(postword.getText().equals(yanzhengma))

     {if (model == 0) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "请选择职务");
            alert.show();
        }
        if (worker.isSelected()) {
            AnchorPane anchorPane = null;
            try {

                anchorPane = FXMLLoader.load(this.getClass().getResource("worker.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            Scene scene = new Scene(anchorPane);
            scene.setFill(Paint.valueOf("#ffffff00"));
            scene.getStylesheets().add(getClass().getResource("css/workermain.css").toExternalForm());

            stage.setScene(scene);
            stage.setTitle("欢迎来到员工管理系统");
            stage.initStyle(StageStyle.TRANSPARENT);
            stage.show();
            LoginPage.theStage.close();
        }
        if (citizen.isSelected()) {
            BorderPane borderPane = null;
            try {
                borderPane = FXMLLoader.load(this.getClass().getResource("citizen.fxml"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            Scene scene = new Scene(borderPane);

            stage.setScene(scene);
            stage.setTitle("欢迎来到居民服务系统");

            stage.show();
            LoginPage.theStage.close();

        }
     }
     else
     {
         Alert alert = new Alert(Alert.AlertType.ERROR, "验证码错误");
         alert.show();

     }

    }


    @FXML
    void chenged(ActionEvent event) throws IOException {
        model = 1;

    }

    @FXML
    void chenged1(ActionEvent event) {
        model = 2;

    }


    int number() {
        int a;
        a = (int) ((Math.random()+1)*10000);
        return a;

    }
}
