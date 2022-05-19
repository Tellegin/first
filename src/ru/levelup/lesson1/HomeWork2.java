package ru.levelup.lesson1;

import java.util.Scanner;
public class HomeWork2 {

    public static void main(String[] args) {
        System.out.println("Программа решает уравнение вида:");
        System.out.println("ax + b = 0");
        System.out.println("Введите a, b и узнаете x:");
        Scanner vv = new Scanner(System.in);

        System.out.println("Введите a:");
        double a = vv.nextDouble();
        System.out.println("Введите b:");
        double b = vv.nextDouble();
        double x = -b/a;
        System.out.println("Результат:" +x);
        vv.close();




    }

}
