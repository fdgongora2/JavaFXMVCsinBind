module com.example.javafxmvcsinbind {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxmvcsinbind to javafx.fxml;
    exports com.example.javafxmvcsinbind;
}