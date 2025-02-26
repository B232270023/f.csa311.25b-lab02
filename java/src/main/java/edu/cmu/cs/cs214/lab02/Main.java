package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2, 3);
        Shape circle = new Circle(5);
        Shape square = new Square(4);

        Renderer renderer = new Renderer();
        renderer.addShape(rectangle);
        renderer.addShape(circle);
        renderer.addShape(square);

        renderer.drawAll();
        renderer.calculateTotalArea();
    }
}