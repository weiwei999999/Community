module csu.train.community {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires java.mail;
<<<<<<< HEAD
=======
    // requires java.mail;
>>>>>>> 6e5e488eb24b2c0b78c9d3d342a1b05f618a2920


    opens csu.train.community to javafx.fxml;
    opens csu.train.community.views to javafx.fxml;
   exports csu.train.community;
    exports csu.train.community.views;
    exports csu.train.community.util;
    exports csu.train.community.dao;
    exports csu.train.community.vo;
    exports csu.train.community.model;
}