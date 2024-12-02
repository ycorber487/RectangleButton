package es.ieslosmontecillos.rectanglebutton;

import javafx.scene.control.Button;

public class myBoton {
    private Button boton;

    // Constructor
    public myBoton(String text) {
        this.boton = new Button(text);
    }


    public void setText(String text) {
        boton.setText(text);
    }


    public void setOnAction(Runnable action) {
        boton.setOnAction(e -> action.run());
    }



}

