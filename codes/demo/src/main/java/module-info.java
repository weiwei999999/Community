module com.example.demo {//模块的名称，可以改成和包名一致
    //下面这俩不能删
    requires javafx.controls;
    requires javafx.fxml;



    opens com.example.demo to javafx.fxml;
    opens com.example.demo.test to javafx.fxml;

    exports com.example.demo;
    exports com.example.demo.test;
}