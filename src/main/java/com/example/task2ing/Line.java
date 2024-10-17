package com.example.task2ing;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line extends Shape {
    public Line(Color color) {
        super(color);
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setStroke(getColor());
        gc.strokeLine(50, 50, 150, 150);
    }

    @Override
    public String descriptor() {
        return "Line";
    }
}
