package ru.levelup.lesson4;

public class Shape {
    int order;

    String name;
    Shape(String shapeName){
        name = shapeName;
    }
    Shape(int shapeOrder, String shapeName) {
        order = shapeOrder;
        name = shapeName;
    }
}
