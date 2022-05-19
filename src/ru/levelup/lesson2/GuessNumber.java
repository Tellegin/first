package ru.levelup.lesson2;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        int EnteredNumber = sc.nextInt(); //считает введенное значение, преобразует в int и сохранит в переменную enteredNumber
        //Генерация числа (использую ГСПЧ)
        Random r = new Random();
        //генерирует число от 0 до числа указанного в скобках (до переменной переданной), исключая его ( число -1)
        int secretNumber = r.nextInt(4); // генерирует [0, 4] - [0, 3]
        //
        if (secretNumber == EnteredNumber) {
            System.out.println("Вы угадали!");
        } else {
            if (secretNumber > EnteredNumber) {

                System.out.println("Вы ввели число меньше чем сгенерированное");
            } else {
                System.out.println("Вы ввели число больше чем сгенерированное");
            }

            System.out.println("Вы не угадали! Число " + secretNumber);

        }

    }
}
