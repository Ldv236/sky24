package pro.sky.calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.calculator.constants.CalculatorServiceTestConstants.*;

public class CalculatorServiceTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();


    @Test
    void shouldReturnSumOfTwoNums() {

        String actual1 = out.plus(valueNum10, valueNum5);
        String expected1 = valueNum10 + " + " + valueNum5 + " = " + (valueNum10 + valueNum5);
        assertEquals(expected1, actual1);

        String actual2 = out.plus(valueNum6, valueNum2);
        String expected2 = valueNum6 + " + " + valueNum2 + " = " + (valueNum6 + valueNum2);
        assertEquals(expected2, actual2);
    }

    @Test
    void shouldReturnDifferenceOfTwoNums() {

        String actual1 = out.minus(valueNum10, valueNum5);
        String expected1 = valueNum10 + " - " + valueNum5 + " = " + (valueNum10 - valueNum5);
        assertEquals(expected1, actual1);

        String actual2 = out.minus(valueNum6, valueNum2);
        String expected2 = valueNum6 + " - " + valueNum2 + " = " + (valueNum6 - valueNum2);
        assertEquals(expected2, actual2);
    }

    @Test
    void shouldReturnMultiplyOfTwoNums() {

        String actual1 = out.multiply(valueNum10, valueNum5);
        String expected1 = valueNum10 + " * " + valueNum5 + " = " + (valueNum10 * valueNum5);
        assertEquals(expected1, actual1);

        String actual2 = out.multiply(valueNum6, valueNum0);
        String expected2 = valueNum6 + " * " + valueNum0 + " = " + (valueNum6 * valueNum0);
        assertEquals(expected2, actual2);
    }

    @Test
    void shouldReturnDivideOfTwoNums() {

        String actual1 = out.divide(valueNum10, valueNum5);
        String expected1 = valueNum10 + " / " + valueNum5 + " = " + (double)(valueNum10 / valueNum5);
        assertEquals(expected1, actual1);

        String actual2 = out.divide(valueNum6, valueNum2);
        String expected2 = valueNum6 + " / " + valueNum2 + " = " + (double)(valueNum6 / valueNum2);
        assertEquals(expected2, actual2);
    }

    @Test
    void shouldThrowIllegalArgumentExceptionWhenNum2HaveNullValue() {
        assertThrows(IllegalArgumentException.class, () -> out.divide(valueNum10, valueNum0));
    }
}
