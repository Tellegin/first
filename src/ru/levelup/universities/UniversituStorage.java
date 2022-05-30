package ru.levelup.universities;




public class UniversituStorage {

    private University[] universities;

    public  UniversituStorage(){

        this.universities = new University[]{
                new University(shortName: "СПБГУ", name: "Государственный универститет", foundationYear: 1803),
                new University(shortName: "СПБГПУ", name: "Политехнический универститет", foundationYear: 1804)

        };
    }
    //Проверяет есть ли такой университет в массиве
    public boolean exists(University university){
        return false;
    }
}
