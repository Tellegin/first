package ru.levelup.lesson9;
import java.util.ArrayList;
import java.util.List;

public class CollectionExemple {
    public static void main(String[] args) {
        //Список на основе массива (аналог ListArray из предыдущих занятий)
        List<String> products = new ArrayList<>();
        products.add("Milk");
        products.add("Cheese");
        products.add("Tomatoes");
        products.add("Cucumber");
        products.add("Bread");
        products.add("Milk");
        //products - содержит 6 элментов
        System.out.println("Size:" + products.size());

        System.out.println("Has Milk:" + products.contains("Milk"));
        System.out.println("Has chokolate" + products.contains("chokolate"));

        //indexOf - exists only lists

        System.out.println("Index of tomatoes:" + products.indexOf("Tomatoes"));
        System.out.println("Index of Milk:" + products.indexOf("Milk"));
        System.out.println("Last index of Milk:" + products.indexOf("Milk"));

        System.out.println();
        System.out.println("Product list");
        //for-each - сокращенный вид
        //for (<Type of collection's element> <var> : <collection's object>)
        for (String element : products){
            // 1 iteration: element = Milk
            // 2 iteration element = Cheese
            // ...
            System.out.println(element);
        }


    }
}
