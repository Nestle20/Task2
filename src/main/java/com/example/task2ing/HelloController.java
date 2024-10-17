package com.example.task2ing;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class HelloController {
    @FXML
    private TextField fieldSides;
    @FXML
    private Canvas canvas;

    private ShapeFactory shapeFactory = new ShapeFactory();

    @FXML
    private void handleDrawButton() {
        try {
            int numberOfSides = Integer.parseInt(fieldSides.getText());
            Color color = Color.BLUE; // Фиксированный цвет для примера

            Shape shape = shapeFactory.createPolygon(numberOfSides, color);
            GraphicsContext gc = canvas.getGraphicsContext2D();

            gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight()); // Очищаем холст
            shape.draw(gc); // Рисуем фигуру
            System.out.println(shape.descriptor()); // Выводим название фигуры
        } catch (NumberFormatException e) {
            System.out.println("Введите корректное число.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
