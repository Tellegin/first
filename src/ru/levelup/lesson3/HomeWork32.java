package ru.levelup.lesson3;
//Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 …
public class HomeWork32 {
    public static void main(String args []) {
        int sum = 0;
        int count = 0;
        for (int i = sum; i <= 54; i++) {
            sum = 2 * i + 1;
            count++;
            System.out.println(count + " элемент - " + sum);
        }
        System.out.println("Первые " + count + " элементов");
    }
}