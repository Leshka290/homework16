package my.project.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp implements CalculatorService {

    @Override
    public String welcomeCalculator(){
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String plus(int num1, int num2) {
        return "num1 + num2 = " + (num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return "num1 - num2 = " + (num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return "num1 * num2 = " + (num1 * num2);
    }

    @Override
    public String divide(int num1, int num2) {
        try {
            return "num1 / num2 = " + (num1 / num2);
        } catch (ArithmeticException e) {
            return e.toString();
        }
    }
}
