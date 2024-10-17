package com.example.task2ing;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(getColor());
        gc.fillPolygon(new double[]{100, 150, 50}, new double[]{50, 150, 150}, 3);
    }

    @Override
    public String descriptor() {
        return "Triangle";
    }
}
