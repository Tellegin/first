package ru.levelup.lesson2;

public class HomeWork25 {
        public static void main(String[] args) {
            int first = 3;
            int second = 9;
            int third = -1;
            if (first < second && first < third && second < third) {
                System.out.println (first + " " + second + " " + third);
            } else if (second < first && second < third && first < third) {
                System.out.println (second + " " + first + " " + third);
            } else if (third < first && third < second && first < second) {
                System.out.println (third + " " + first + " " + second);
            }
        }
    }

