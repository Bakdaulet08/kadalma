module org.example.kadalma {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.kadalma to javafx.fxml;
    exports org.example.kadalma;
}