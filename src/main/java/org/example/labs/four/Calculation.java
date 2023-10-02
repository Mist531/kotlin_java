package org.example.labs.four;

import org.example.labs.four.filesUtils.CalculationFileOperations;

import java.io.IOException;

public class Calculation {
    private int numerator;
    private int denominator;
    private CalculationFileOperations calculationFileOperation;

    private boolean shouldSimplify;

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public Calculation(int numerator, int denominator) {
        setCalculation(numerator, denominator);
    }

    public Calculation(int numerator, int denominator, boolean shouldSimplify) {
        setCalculation(numerator, denominator);
        setShouldSimplify(shouldSimplify);
    }

    public Calculation(String fileName, CalculationFileOperations calculationFileOperations) {
        try {
            calculationFileOperation = calculationFileOperations;
            Calculation calculation = calculationFileOperations.readFromFile(fileName);
            setCalculation(calculation);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    //region Getters and Setters
    public boolean getShouldSimplify() {
        return shouldSimplify;
    }

    public void setShouldSimplify(boolean shouldSimplify) {
        this.shouldSimplify = shouldSimplify;
    }

    private void setCalculation(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Знаменатель не может быть равен нулю.");
        }
        if (shouldSimplify) {
            int gcd = gcd(numerator, denominator);
            this.numerator = numerator / gcd;
            this.denominator = denominator / gcd;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    private void setCalculation(Calculation calculation) {
        setCalculation(calculation.getNumerator(), calculation.getDenominator());
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    //endregion

    public void save(String fileName, CalculationFileOperations calculationFileOperations) {
        calculationFileOperations.writeToFile(this, fileName);
    }

    public void display() {
        if (calculationFileOperation != null) {
            System.out.println(calculationFileOperation + "  " + numerator + "/" + denominator);
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }

    public void add(Calculation other) {
        int newNumerator = this.numerator * other.denominator + this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        setCalculation(newNumerator, newDenominator);
        display();
    }

    public void subtract(Calculation other) {
        int newNumerator = this.numerator * other.denominator - this.denominator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        setCalculation(newNumerator, newDenominator);
        display();
    }

    public void multiply(Calculation other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        setCalculation(newNumerator, newDenominator);
        display();
    }

    public void divide(Calculation other) {
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        setCalculation(newNumerator, newDenominator);
        display();
    }
}
