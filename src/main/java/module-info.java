module com.example.tictatoy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tictatoy to javafx.fxml;
    exports com.example.tictatoy;
}