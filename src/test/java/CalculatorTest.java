import org.Calculator.Calculator;
import org.Calculator.Operation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5.0, calculator.calculate(Operation.ADD, 2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1.0, calculator.calculate(Operation.SUBTRACT, 3, 2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6.0, calculator.calculate(Operation.MULTIPLY, 2, 3));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.calculate(Operation.DIVIDE, 6, 3));
    }

    @Test
    public void testZeroDivisor() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.calculate(Operation.DIVIDE, 6, 0);
        });
        assertEquals("Cannot use 0 as divisor.", exception.getMessage());
    }

    @Test
    public void testChainedOperations() {
        Operation[] operations = {Operation.ADD, Operation.MULTIPLY, Operation.SUBTRACT};
        Number[] values = {5, 3, 2, 4};
        assertEquals(12.0, calculator.chainingCalculate(operations, values));
    }

    @Test
    public void testChainedOperationsWithWrongNumberOfArguments() {
        Operation[] operations = {Operation.ADD, Operation.MULTIPLY, Operation.SUBTRACT};
        Number[] values = {5, 3, 2};
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.chainingCalculate(operations, values);
        });
        assertEquals("The number of operations must equal to number of values plus 1.", exception.getMessage());
    }
}