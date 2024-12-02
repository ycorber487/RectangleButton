module es.ieslosmontecillos.rectanglebutton {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens es.ieslosmontecillos.rectanglebutton to javafx.fxml;
    exports es.ieslosmontecillos.rectanglebutton;
}