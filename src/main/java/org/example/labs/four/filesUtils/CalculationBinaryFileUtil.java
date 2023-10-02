package org.example.labs.four.filesUtils;


import org.example.labs.four.Calculation;

import java.io.*;

public class CalculationBinaryFileUtil implements CalculationFileOperations {

    @Override
    public void writeToFile(Calculation calculation, String filename) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filename))) {
            dos.writeInt(calculation.getNumerator());
            dos.writeInt(calculation.getDenominator());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Calculation readFromFile(String filename) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            int numerator = dis.readInt();
            int denominator = dis.readInt();
            return new Calculation(numerator, denominator);
        }
    }
}

