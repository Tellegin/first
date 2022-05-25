package ru.levelup.lesson4;

public class Application {

    public static void main(String[] args) {

        // Shape nullFigure = null; // Shape nullFigure;

        // p1.printPoint();
        Shape figure = new Shape("Figure 1");

        System.out.println(figure.getName());
        System.out.println(figure.getName().toUpperCase());

        Shape shape = new Shape("Shape 2");
        System.out.println(shape.getName().toUpperCase());

        Shape shapeWithOrder = new Shape(4, "Shape with order");
        System.out.println(shapeWithOrder.order + " " + shapeWithOrder.getName());

        String fName = figure.getName();
        fName = "2134";
        System.out.println(fName + " - " + figure.getName());

    }

}
