package csu.train.community.views;

//登录页的controller，梁泉负责编写



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Date;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class LoginController  {
    int model=0;
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
    void send(ActionEvent event) {
        boolean flag;
        String correct="[\\w!#$%&'*+/=?^_`{|}~-]+(?:\\.[\\w!#$%&'*+/=?^_`{|}~-]+)*@(?:[\\w](?:[\\w-]*[\\w])?\\.)+[\\w](?:[\\w-]*[\\w])?";
        String mail=email.getText();
        flag =mail.matches(correct);

        if(flag)
        {
            int time=30;
            while(time>0)
            { time--;
                try{
                    Thread.sleep(1000);
                    String s;
                    s=String.valueOf(time);
                    submitBtn.setText(s);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }}
        else
        {
            Alert alert =new Alert(Alert.AlertType.ERROR,"请输入正确的邮箱");
            alert.show();
            email.setText("");
        }







    }

    @FXML
    void login(ActionEvent event) {
        if(model==0)
        {
            Alert alert=new Alert(Alert.AlertType.ERROR,"请选择职务");
            alert.show();
        }
    }

    @FXML
    void chenged(ActionEvent event) {
        model=1;
    }

    @FXML
    void chenged1(ActionEvent event) {
        model=2;
    }

}
