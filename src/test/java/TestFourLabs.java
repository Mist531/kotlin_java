import org.example.labs.four.Calculation;
import org.example.labs.four.filesUtils.CalculationBinaryFileUtil;
import org.example.labs.four.filesUtils.CalculationTextFileUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class TestFourLabs {
    @Test
    public void testTextFileSaveAndRead() throws IOException {
        Calculation calculation = new Calculation(5, 2);
        CalculationTextFileUtil textUtil = new CalculationTextFileUtil();
        textUtil.writeToFile(calculation, "test.txt");
        Calculation readCalculation = textUtil.readFromFile("test.txt");
        assertEquals(calculation.toString(), readCalculation.toString());
    }

    @Test
    public void testBinaryFileSaveAndRead() throws IOException {
        Calculation calculation = new Calculation(5, 2);
        CalculationBinaryFileUtil binaryUtil = new CalculationBinaryFileUtil();
        binaryUtil.writeToFile(calculation, "test.bin");
        Calculation readCalculation = binaryUtil.readFromFile("test.bin");
        assertEquals(calculation.toString(), readCalculation.toString());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testZeroDenominator() {
        new Calculation(5, 0);
    }

    @Test
    public void testAddition() {
        Calculation firstCalculation = new Calculation(1, 2);
        Calculation secondCalculation = new Calculation(1, 3);
        firstCalculation.add(secondCalculation);
        assertEquals("5/6", firstCalculation.toString());
    }

    @Test
    public void testSubtraction() {
        Calculation firstCalculation = new Calculation(1, 2);
        Calculation secondCalculation = new Calculation(1, 3);
        firstCalculation.subtract(secondCalculation);
        assertEquals("1/6", firstCalculation.toString());
    }

    @Test
    public void testMultiplication() {
        Calculation firstCalculation = new Calculation(1, 2);
        Calculation secondCalculation = new Calculation(1, 3);
        firstCalculation.multiply(secondCalculation);
        assertEquals("1/6", firstCalculation.toString());
    }

    @Test
    public void testDivision() {
        Calculation firstCalculation = new Calculation(1, 2);
        Calculation secondCalculation = new Calculation(1, 3);
        firstCalculation.divide(secondCalculation);
        assertEquals("3/2", firstCalculation.toString());
    }
}
