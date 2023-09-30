import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    @Test
    public void testAdd() {
        assertEquals (Calculator.add(2, 4), 6);
    }

    @Test
    public void testDivideByZero() {
        assertThrows (ArithmeticException.class, () -> Calculator.divide(3, 0));
    }
}
