package org.example.labs.three;

public class Pet {
    private String name;
    private int age;
    private String color;

    public Pet(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    //region Getters and Setters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //endregion

    public void eat(String food) {
        System.out.println(name + " ест " + food + ".");
    }

    public void sleep() {
        System.out.println(name + " спит.");
    }
}
