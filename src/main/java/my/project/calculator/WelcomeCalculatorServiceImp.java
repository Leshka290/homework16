package my.project.calculator;

import org.springframework.stereotype.Service;

@Service
public class WelcomeCalculatorServiceImp implements WelcomeCalculatorService {

    @Override
    public String welcomeCalculator(){
        return "Добро пожаловать в калькулятор";
    }
}
