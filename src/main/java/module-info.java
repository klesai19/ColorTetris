module com.example.colortetris {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.colortetris to javafx.fxml;
    exports com.example.colortetris;
}