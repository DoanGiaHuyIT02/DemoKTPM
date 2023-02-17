module com.dgh.demoapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dgh.demoapp to javafx.fxml;
    exports com.dgh.demoapp;
}
