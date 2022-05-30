package ru.levelup.lesson5;

public class InheritanceApp {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
         rectangle.setName("Rectangle AB");

         rectangle.length = 3;
         rectangle.width = 5;
         double perimeter = rectangle.calculatePerimeter();
         System.out.println(rectangle.getName() +": perimeter ="+ perimeter);

    }
}
