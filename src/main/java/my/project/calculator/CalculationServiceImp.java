package my.project.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculationServiceImp implements CalculationService{

    @Override
    public String plus(int num1, int num2) {
        return String.valueOf(num1 + num2);
    }

    @Override
    public String minus(int num1, int num2) {
        return String.valueOf(num1 - num2);
    }

    @Override
    public String multiply(int num1, int num2) {
        return String.valueOf(num1 * num2);
    }

    @Override
    public String divide(int num1, int num2) {
        try {
            return String.valueOf(num1 / num2);
        } catch (ArithmeticException e) {
            return e.toString();
        }
    }
}
