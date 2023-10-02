package org.example.labs.four.filesUtils;


import org.example.labs.four.Calculation;

import java.io.*;

public class CalculationTextFileUtil implements CalculationFileOperations {

    @Override
    public void writeToFile(Calculation calculation, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(calculation.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Calculation readFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            String[] parts = line.split("/");
            return new Calculation(Integer.parseInt(parts[0].trim()), Integer.parseInt(parts[1].trim()));
        }
    }
}