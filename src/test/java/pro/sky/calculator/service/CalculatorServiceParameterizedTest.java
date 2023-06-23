package pro.sky.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.calculator.constants.CalculatorServiceTestConstants.*;

import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceParameterizedTest {

    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    static Stream<Arguments> provideParamsForTests() {
        return Stream.of(
                Arguments.of(valueNum10, valueNum5),
                Arguments.of(valueNum6, valueNum2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void shouldReturnSumOfTwoNums(int num1, int num2) {
        String actual1 = out.plus(num1, num2);
        String expected1 = num1 + " + " + num2 + " = " + (num1 + num2);
        assertEquals(expected1, actual1);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void shouldReturnDifferenceOfTwoNums(int num1, int num2) {
        String actual1 = out.minus(num1, num2);
        String expected1 = num1 + " - " + num2 + " = " + (num1 - num2);
        assertEquals(expected1, actual1);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void shouldReturnMultiplyOfTwoNums(int num1, int num2) {
        String actual1 = out.multiply(num1, num2);
        String expected1 = num1 + " * " + num2 + " = " + (num1 * num2);
        assertEquals(expected1, actual1);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTests")
    void shouldReturnDivideOfTwoNums(int num1, int num2) {
        String actual1 = out.divide(num1, num2);
        String expected1 = num1 + " / " + num2 + " = " + (double)(num1 / num2);
        assertEquals(expected1, actual1);
    }
}
