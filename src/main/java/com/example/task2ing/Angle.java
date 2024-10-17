package com.example.task2ing;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Angle extends Shape {
    public Angle(Color color) {
        super(color);
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setStroke(getColor());
        gc.strokeLine(50, 50, 150, 50);
        gc.strokeLine(150, 50, 150, 150);
    }

    @Override
    public String descriptor() {
        return "Angle";
    }
}