package csu.train.community.views;



import csu.train.community.util.ConnectionUtil;
import csu.train.community.vo.Role;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

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
    Role role = new Role();

    @FXML
    void checking(ActionEvent event) {
        Connection cn = ConnectionUtil.getConnection();

        //查找行的SQL
        String sql = "SELECT service_situation FROM citizen_data WHERE user_mailBox = ?";
        //声明语句对象
        PreparedStatement pstmt = null;
        //声明结果集游标，用于获取查询结果中每一行数据
        ResultSet rs = null;

        //绑定到PreparedStatement对象中
        try {
            //预编译SQL
            pstmt = cn.prepareStatement(sql);
            //绑定SQL语句中?对应的参数
            pstmt.setString(1,"1573152761@qq.com");
            //查询操作，返回结果集
            rs = pstmt.executeQuery();

            //判断查询结果集中是否有数据
            if(rs.next()) {

                //创建对象，并将数据存储到Role对象中
               // Role role = new Role();

                //使用rs.getXxx(结果集中的字段名或索引)方法获取结果集中的列数据
               // role.setId(rs.getInt("user_id"));
               // role.setMailBox(rs.getString("user_mailBox"));
                role.setService_situation(rs.getInt("service_situation"));

                //System.out.println(role.getMailBox());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //最终得给它关上
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();;
                }
            }
        }
        value=role.getService_situation();
        if (value==2)
        {nothingleft.setVisible(true);nothingleftLabel.setVisible(true);}
        else if (value==1){doing.setVisible(true);doingLabel.setVisible(true);}
        else if (value==3){done.setVisible(true);doneLabel.setVisible(true);}
        else {System.out.println("无");}


        }

    public void initialize(URL url, ResourceBundle resourceBundle) {
        doneLabel.getStylesheets().add(getClass().getResource("css/citizen.css").toExternalForm());
        doingLabel.getStylesheets().add(getClass().getResource("css/citizen.css").toExternalForm());
        nothingleftLabel.getStylesheets().add(getClass().getResource("css/citizen.css").toExternalForm());
    }
}



