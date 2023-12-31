package org.example.labs.one;

public class Phone {
    private String name;
    private String number;

    public void printInfo() {
        System.out.println(this.name + " = " + this.number);
    }

    public Phone(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
