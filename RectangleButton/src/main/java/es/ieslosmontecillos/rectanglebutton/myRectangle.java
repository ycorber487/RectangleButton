package es.ieslosmontecillos.rectanglebutton;

import javafx.scene.shape.Rectangle;

public class myRectangle {
    private Rectangle rectangle;

    // Constructor
    public myRectangle(double width, double height, double x, double y) {
        this.rectangle = new Rectangle(width, height);
        this.rectangle.setX(x);
        this.rectangle.setY(y);
    }


    public void setDimensions(double width, double height) {
        rectangle.setWidth(width);
        rectangle.setHeight(height);
    }


    public Rectangle getRectangle() {
        return rectangle;
    }


    public void move(double deltaX, double deltaY) {
        rectangle.setX(rectangle.getX() + deltaX);
        rectangle.setY(rectangle.getY() + deltaY);
    }
}

