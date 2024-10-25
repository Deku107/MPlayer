module org.jsp.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens org.jsp.demo to javafx.fxml;
    exports org.jsp.demo;
}