package ru.levelup.lesson3;
//Выведите на экран все положительные делители натурального числа, введённого пользователем с клавиатуры.
import java.util.Scanner;

public class HomeWork35 {
    public static void main(String args[]) {
        int n;
        int count = 0;
        System.out.print("Вводите ваше натуральное число - ");
        Scanner sr = new Scanner(System.in);
        if (sr.hasNextInt()) {
            n = sr.nextInt();
            System.out.print("Число " + n + " делится на - ");
            for (int i = 1; i <= n; i++) {
                if ((n % i) == 0) {
                    count++;
                    System.out.print(i + " ");
                }
            }
            System.out.println("Количество делителей - " + count);
        }
    }
}
