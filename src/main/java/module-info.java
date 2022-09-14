module com.example.javachess {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javachess to javafx.fxml;
    exports com.example.javachess;
}