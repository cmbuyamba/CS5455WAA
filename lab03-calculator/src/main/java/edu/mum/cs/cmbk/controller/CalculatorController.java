package edu.mum.cs.cmbk.controller;

import edu.mum.cs.cmbk.domain.Calculator;
import edu.mum.cs.cmbk.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/"})
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping(method = RequestMethod.GET)
    public String getCalculator(Calculator calculator) {
        return "calculator";
    }

    @RequestMapping(value = {"/calculator"}, method = RequestMethod.POST)
    public String calculate(Calculator calculator) {
        if (calculator.getAdd1() != null && calculator.getAdd2() != null)
            calculator.add();
        if (calculator.getMult1() != null && calculator.getMult2() != null)
            calculator.mult();
        return "calculator";
    }
}
