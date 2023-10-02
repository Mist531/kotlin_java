package org.example.labs.three;

public class Dog extends Pet {

    private final String breed;

    public String getBreed() {
        return breed;
    }

    public Dog(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    @Override
    public void sleep() {
        System.out.println(getName() + ", порода: " + getBreed() + ", спит.");
    }

    public void bark() {
        System.out.println(getName() + " лает.");
    }
}
