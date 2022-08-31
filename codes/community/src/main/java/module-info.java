module csu.service.community {
    requires javafx.controls;
    requires javafx.fxml;


    opens csu.service.community to javafx.fxml;
    exports csu.service.community;
    exports csu.service.community.citizen;
    exports csu.service.community.worker;
    exports csu.service.community.login;
}