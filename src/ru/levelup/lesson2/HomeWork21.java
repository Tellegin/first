package ru.levelup.lesson2;
import java.util.Scanner;

public class HomeWork21 {
    public static void main(String[] args) {
        System.out.println("Введите число. Программа определит четное оно или нечетное:");
        Scanner op = new Scanner(System.in);
        double a = op.nextDouble();
        double b = a%2;
        if (b > 0) {

            System.out.println("Вы ввели нечетное число");
        } else {
            System.out.println("Вы ввели четное число");
        }

    }
}
