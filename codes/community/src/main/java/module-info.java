module csu.train.community {
    requires javafx.controls;
    requires javafx.fxml;


    opens csu.train.community to javafx.fxml;
    exports csu.train.community;
    exports csu.train.community.views;
}