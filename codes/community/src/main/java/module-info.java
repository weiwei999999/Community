module csu.train.community {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;
    requires java.mail;


    opens csu.train.community to javafx.fxml;
    opens csu.train.community.views to javafx.fxml;
    exports csu.train.community;
    exports csu.train.community.views;
    exports csu.train.community.util;
    exports csu.train.community.dao;
    exports csu.train.community.vo;
    exports csu.train.community.model;
}