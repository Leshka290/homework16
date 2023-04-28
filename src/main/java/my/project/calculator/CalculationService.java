package my.project.calculator;

import org.springframework.stereotype.Service;


public interface CalculationService {
    String plus(int num1, int num2);

    String minus(int num1, int num2);

    String multiply(int num1, int num2);

    String divide(int num1, int num2);
}
