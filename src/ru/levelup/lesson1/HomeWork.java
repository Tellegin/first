package ru.levelup.lesson1;

public class HomeWork {
    public static void main(String[] args) {

//инициализация целой переменной с диапазоном допустимых значениний -128 до 127
        int a = 20;
        int b = 47;
        //инициализация дробной переменной с диапазоном допустимых значениний ~4,9*10-324  до ~1,8*10308
        float c = 20;
        float d = 47;
       
        int sum = a+b;
        int diff = b-a;
        int diffmin = a-b;
        int div = b/a;
        int mult = b*a;
        float divfloat =b/a; //деление объявленных целых переменных с выводом дробной переменной
        float divfloat2 =d/c; //деление объявленных дробных переменных с выводом дробной переменной


        System.out.println("Сумма: " +sum);
        System.out.println("Разность: " +diff);
        System.out.println("Разность отрицательная: " +diffmin);
        System.out.println("Частное: " +div);
        System.out.println("Частное дробное: " +divfloat);
        System.out.println("Частное дробное для дробных перемнных: " +divfloat2);
        System.out.println("Произведение: " +mult);






    }
}


