package org.example;

import org.example.labs.four.Calculation;
import org.example.labs.four.filesUtils.CalculationBinaryFileUtil;
import org.example.labs.four.filesUtils.CalculationFileOperations;
import org.example.labs.four.filesUtils.CalculationTextFileUtil;
import org.example.labs.one.Phone;
import org.example.labs.three.Cat;
import org.example.labs.three.Dog;
import org.example.labs.two.Movie;

public class LabsImpl implements Labs {

    @Override
    public void labOne() {
        Phone artemPhone = new Phone("Artem", "89082223344");
        Phone mikePhone = new Phone("Mike", "89082223341");
        if (!artemPhone.equals(mikePhone)) {
            mikePhone.printInfo();
            mikePhone.setName(artemPhone.getName());
            mikePhone.printInfo();
        } else {
            mikePhone.printInfo();
        }
    }

    @Override
    public void labTwo() {
        Movie movie = new Movie("Начало", "Кристофер Нолан", 2010, 2.22);
        movie.printInfo();
    }

    @Override
    public void labThree() {
        Dog myDog = new Dog("Барбос", 5, "Черный", "Лабрадор");
        myDog.eat("корм для собак");
        myDog.sleep();
        myDog.bark();

        Cat myCat = new Cat("Василий", 3, "Серый");
        boolean catIsIndoor = myCat.isIndoor();
        if (catIsIndoor) {
            System.out.println(myCat.getName() + " домашний кот.");
        } else {
            System.out.println(myCat.getName() + " уличный кот.");
        }
        myCat.sleep();
        myCat.meow();
    }

    @Override
    public void labFour() {
        CalculationFileOperations textFileOperations = new CalculationTextFileUtil();
        CalculationFileOperations binaryFileOperations = new CalculationBinaryFileUtil();
        Calculation calc1 = new Calculation(1, 2, true);
        Calculation calc2 = new Calculation(1, 3);

        calc1.add(calc2);
        calc1.setCalculation(1, 2);
        calc1.subtract(calc2);
        calc1.setCalculation(1, 2);
        calc1.multiply(calc2);
        calc1.setCalculation(1, 2);
        calc1.divide(calc2);

        String textFileName = "calculation.txt";
        calc1.save(textFileName, textFileOperations);
        Calculation loadedTextCalc = new Calculation(textFileName, textFileOperations);
        loadedTextCalc.display();

        String binFileName = "calculation.bin";
        calc1.save(binFileName, binaryFileOperations);
        Calculation loadedBinCalc = new Calculation(binFileName, binaryFileOperations);
        loadedBinCalc.display();
    }
}
