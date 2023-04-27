package my.project.calculator.controllers;

import my.project.calculator.WelcomeCalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final WelcomeCalculatorService welcomeCalculator;

    public CalculatorController(WelcomeCalculatorService welcomeCalculator) {
        this.welcomeCalculator = welcomeCalculator;
    }

    @GetMapping(path = "/calculator")
    public String welcomeCalculator() {
        return welcomeCalculator.welcomeCalculator();
    }
}
