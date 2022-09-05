package csu.train.community.views;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class progress {

    @FXML
    private Button checking;

    @FXML
    private ImageView doing;
    @FXML
    private ImageView done;

    @FXML
    private ImageView nothingleft;
    @FXML
    private Label doneLabel;
    @FXML
    private Label nothingleftLabel;

    @FXML
    private Label doingLabel;


    int value = 0;

    @FXML
    void checking(ActionEvent event) {
        if (value==0)
        {nothingleft.setVisible(true);nothingleftLabel.setVisible(true);}
        else if (value==1){doing.setVisible(true);doingLabel.setVisible(true);}
        else if (value==2){done.setVisible(true);doneLabel.setVisible(true);}
        else {System.out.println("无");}


        }

    }


