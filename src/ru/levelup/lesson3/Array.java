package ru.levelup.lesson3;

public class Array {
    public static void main(String[] args) {
        double price1 = 345.65;
        double price2 = 546.23;
        double price3 = 64.65;
        double price4 = 12.78;
        double price5 = 13.56;


        double avgPrice = (price1 + price2 + price3 + price4 + price5);
        System.out.println("Average price" + avgPrice);


        double [] prices = new double [5]; //набор значений с типом double
        //Записать значение в элемент массива (сохранить значение в массив)
        prices[0] = price1; // мы записали значение 345.65 в 0й элемент массива
        prices[1] = price2;
        prices[2] = price3;
        prices[3] = price4;
        prices[4] = price5;
       // prices[5] = 876.43;

        for (int i =0; i < prices.length; i++) {
            int number = i +1;
            System.out.println(number +"-" + prices [i]);
        }

        double sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum = sum + prices[i];
        }
        double avg = sum / prices.length;
        System.out.println("Average price (array):" + avg);





    }
}
