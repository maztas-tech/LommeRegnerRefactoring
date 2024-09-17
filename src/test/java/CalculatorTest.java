import Files.opgave1.Calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {
    private static final Calculator calculator = new Calculator();

    @Test
    void add() {
        double first = 1.0;
        double second = 2.0;
        double result = calculator.add(first,second);
        Assertions.assertEquals(3.0, result, 0.1);
    }

    @Test
    void subtract() {
        double first = 1.0;
        double second = 2.0;
        double result = calculator.subtract(first,second);
        Assertions.assertEquals(-1.0, result, 0.1);
    }

    @Test
    void multiply() {
        double first = 1.0;
        double second = 2.0;
        double result = calculator.multiply(first,second);
        Assertions.assertEquals(2.0, result, 0.1);
    }

    @Test
    void divide() {
        double first = 1.0;
        double second = 2.0;
        double result = calculator.divide(first,second);
        Assertions.assertEquals(0.5, result, 0.1);
    }
}
