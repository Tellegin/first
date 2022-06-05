//package ru.levelup.lesson5;
//
//import ru.levelup.lesson4.Shape;
//
//public class InheritanceApp {
//
//    public static void main(String[] args) {
//
//        Rectangle rectangle = new Rectangle();
//        rectangle.setName("Rectangle AB");
//
//        Rectangle rectangleWithName = new Rectangle("Rect Name");
//        System.out.println("Name: " + rectangleWithName.getName());
//
//        // int[] array = new int[4];
//        // array[0] = 45;
//        // array[1] = 46;
//
//        // int[] array = new int[] { 4, 5, 6, 7, 8 };
//        // int[] array = { 45, 46, 47, 48 };
//        // double[] array = { 54.23, 54.54, 53.12 };
//
//        // int a = 4; int b = 6; int c = 8;
//        // int[] array = { a, b, c }
//
//        Rectangle rect = new Rectangle(3, "R3", 8, 3);
//        double perimeter = rect.calculatePerimeter();
//        System.out.println(rect.getName() + ": perimeter = " + perimeter);
//
//        Shape shape = new Shape();
//        Triangle triangle = new Triangle(4, "T4", 3, 4, 5);
//
//        System.out.println("Shape's square: " + shape.calculateSquare());
//        System.out.println("Rectangle's square: " + rect.calculateSquare());
//        System.out.println("Triangle's square: " + triangle.calculateSquare());
//
//
//        System.out.println();
//        ShapeService shapeService = new ShapeService();
//        shapeService.printShapeSquare(shape);   // 0
//        shapeService.printShapeSquare(rect);    // 24
//        shapeService.printShapeSquare(triangle);
//
//    }
//
//}
//
