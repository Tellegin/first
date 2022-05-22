package ru.levelup.lesson2;

public class HomeWork24 {
    public static void main(String[] args) {
        System.out.println("Программа генерирует случайное трехзначное число и выводит его наибольшую цифру, а также само число");
        int rnd = (int) (100 + Math.random() * 899);
        int first = rnd / 100;
        int secondBegin = rnd / 10;
        int second = secondBegin % 10;
        int third = rnd % 10;
        if (first > second && first > third) {
            System.out.println (first);
        } else if (second > first && second > third) {
            System.out.println (second);
        } else {
            System.out.println (third);
        }
        System.out.println (rnd);
    }
}


