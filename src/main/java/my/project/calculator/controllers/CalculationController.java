package my.project.calculator.controllers;

import my.project.calculator.CalculationService;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculationController {

    private final CalculationService calculationService;

    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @RequestMapping (path = "/calculator/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return calculationService.divide(num1, num2);
    }
    @RequestMapping("/calculator/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return calculationService.divide(num1, num2);
    }

    @RequestMapping("/calculator/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return calculationService.divide(num1, num2);
    }

    @RequestMapping("/calculator/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        return calculationService.divide(num1, num2);
    }
}
