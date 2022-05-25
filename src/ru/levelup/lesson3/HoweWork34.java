package ru.levelup.lesson3;

import java.util.Scanner;

//Создайте программу, вычисляющую факториал натурального числа n, которое пользователь введёт с клавиатуры.
//n!=1*
public class HoweWork34 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Введите число:");
        double a = op.nextDouble();

        long fact = 1;

                        for (int currentnum =1; currentnum <=a; currentnum++){

            fact = fact*currentnum;

        }
System.out.println("Значение факториала:"+fact);
    }
}
