package ru.levelup.lesson3;

public class PointApp {
    public static void main(String[] args) {
        //object, reference, instance, объект, ссылка, экземпляр
        int xp1 =4;

        Point p1 = new Point();
        p1.x = 5;
        p1.y = 7;

        Point p2 = new Point();
        p2.x = 5;
        p2.y = 8;

        System.out.println("P1: x = " + p1.x);
        System.out.println("P2: x = " + p2.x);

}
    }
