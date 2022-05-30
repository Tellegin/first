package ru.levelup.universities;

public class University {
    private String shortName;
    private String name;
    private int fondationYear;

    public University(String shortName, String name, int foundationYear) {
        this.shortName = shortName;
        this.name = name;
        this.fondationYear = foundationYear;
    }
    @Override
    public boolean equals(Object o){

    }
}
