module com.example.minimaxgui_new {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.minimaxgui_new to javafx.fxml;
    exports com.example.minimaxgui_new;
}