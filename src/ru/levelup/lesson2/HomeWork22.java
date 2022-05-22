package ru.levelup.lesson2;
import java.util.Scanner;
public class HomeWork22 {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);
        System.out.println("Введите число m и n Программа определит число ближайшее в 10");
        System.out.println("Введите n");
        double n = op.nextDouble();
        System.out.println("Введите m");
        double m = op.nextDouble();
        int a = 10;
        double b = Math.abs(a-n);
        double c = Math.abs(a-m);
        if (b==c) {
            System.out.println("Числа " + n + " и " + m + " равноудалены от " + a);
        }
            if(b>c){
                System.out.println("Число m " + m +" ближе к "+a);
            }
            if (b<c) {
                System.out.println("Число n" + n +" ближе к "+a);
            }

        op.close();
    }

}
