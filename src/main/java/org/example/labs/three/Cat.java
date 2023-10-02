package org.example.labs.three;

public class Cat extends Pet {

    private boolean isIndoor;

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(Boolean indoor) {
        isIndoor = indoor;
    }

    @Override
    public void eat(String food) {
        System.out.println(getName() + " ест " + food + " с удовольствием.");
    }

    public void meow() {
        System.out.println(getName() + " мяукает.");
    }
}
