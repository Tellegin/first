package ru.levelup.lesson4;


// Access modifiers (модификаторы доступа)
// 1. private - доступ только внутри класса
// 2. private-package (default-package) - отсутствие модификатора - private + доступ на уровне пакета
// 3. protected - предыдущий + доступ в классе-наследнике (даже если он в другом пакета)
// 4. public - доступ разрешен везде
public class Shape {

    int order;
    private String name;

    Shape(String shapeName) {
        name = shapeName;
    }

    Shape(int shapeOrder, String shapeName) {
        order = shapeOrder;
        name = shapeName;
    }

    public String getName() {
        return name;
    }

}
