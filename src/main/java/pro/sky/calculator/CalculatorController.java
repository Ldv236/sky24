package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return calculatorService.welcome();
    }

    @GetMapping("/plus")
    public String plus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Необходимо передать int-параметры num1 и num2, например \"?num1=5&num2=6\"";
        }
        return calculatorService.plus(num1, num2);
    }

    @GetMapping("/minus")
    public String minus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "Необходимо передать int-параметры num1 и num2, например \"?num1=5&num2=6\"";
        }
        return calculatorService.minus(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Необходимо передать int-параметры num1 и num2, например \"?num1=5&num2=6\"";
        }
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = false) Integer num1, @RequestParam(required = false) Integer num2) {
        if (num1 == null || num2 == null) {
            return "Необходимо передать int-параметры num1 и num2, например \"?num1=5&num2=6\"";
        }
        return calculatorService.divide(num1, num2);
    }
}
