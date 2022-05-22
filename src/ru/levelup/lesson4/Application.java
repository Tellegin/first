package ru.levelup.lesson4;

public class Application {
    public static void main(String[] args) {
        // Shape figure = null; //Shape nullFigure;
        Shape figure = new Shape("Figure 1");
        figure.name = "Figure 1";
        System.out.println(figure.name);
        System.out.println(figure.name.toUpperCase());

        Shape shape = new Shape("Shape 2");
        System.out.println(shape.name.toUpperCase());


        Shape shapeWithOrder = new Shape( shapeOrder: 4, shapeName: "Shape with order");
        System.out.println(shapeWithOrder.order + " " + shapeWithOrder.name );
    String fName = figure.getName();
    fName = "2134";
    System.out.println(fName + " - " + figure.getName());

    }
}
