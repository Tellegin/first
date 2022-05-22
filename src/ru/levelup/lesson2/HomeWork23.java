package ru.levelup.lesson2;

public class HomeWork23 {
    public static void main(String[] args) {
        System.out.println("Программа опеределит попало ли случайно выбранное из отрезка [5;155] целое число в интервал (25;100)");
        double rnd = 5 + Math.random() * 150;
        if(rnd<=25||rnd>=100){
            System.out.println("Число "+rnd+" не содержится в интервале (25,100)");
        }
        else {
            System.out.println("Число " + rnd + " содержится в интервале (25,100)");
        }
    }
}
