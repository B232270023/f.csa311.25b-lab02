package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;
import java.util.ArrayList;
import java.util.List;

public class Renderer {
    private List<Shape> shapes;

    public Renderer() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void drawAll() {
        for (Shape shape : shapes) {
            shape.draw();
            System.out.println("Area: " + shape.getArea());
        }
    }

    public void calculateTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        System.out.println("Total Area: " + totalArea);
    }
}