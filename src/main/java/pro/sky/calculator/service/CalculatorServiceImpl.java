package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    private void validateValues(Integer num1, Integer num2) {

        if (num1 == null || num2 == null) {
            throw new NullPointerException("Need two integer (num1 and num2) for calculate");
        }
    }

    @Override
    public String plus(int num1, int num2) {

        validateValues(num1, num2);
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String minus(int num1, int num2) {

        validateValues(num1, num2);
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String multiply(int num1, int num2) {

        validateValues(num1, num2);
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String divide(int num1, int num2) {

        validateValues(num1, num2);
        if (num2 == 0) {
            throw new IllegalArgumentException("Impossible divide on 0");
        }
        double result = (double) num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}
