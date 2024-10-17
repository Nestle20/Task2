package com.example.task2ing;

import javafx.scene.paint.Color;

public class ShapeFactory {
    public Shape createPolygon(int numberOfSides, Color color) {
        switch (numberOfSides) {
            case 0:
                return new Circle(color);
            case 1:
                return new Line(color);
            case 2:
                return new Angle(color);
            case 3:
                return new Triangle(color);
            case 4:
                return new Square(color);
            default:
                throw new IllegalArgumentException("Unsupported number of sides: " + numberOfSides);
        }
    }
}
