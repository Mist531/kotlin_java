package org.example.labs.four.filesUtils;

import org.example.labs.four.Calculation;

import java.io.IOException;

public interface CalculationFileOperations {

    void writeToFile(Calculation calculation, String filename);

    Calculation readFromFile(String filename) throws IOException;
}
