module com.example.tilerunner {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.tilerunner to javafx.fxml;
    exports com.example.tilerunner;
}