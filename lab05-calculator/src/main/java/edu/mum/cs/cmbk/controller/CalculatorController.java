package edu.mum.cs.cmbk.controller;

import edu.mum.cs.cmbk.domain.Calculator;
import edu.mum.cs.cmbk.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping(value = {"/"})
@SessionAttributes({"greeting"})
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @RequestMapping(value = {"/", "/calculator"}, method = RequestMethod.GET)
    public String getCalculator(Calculator calculator) {
        System.out.println("calculator = " + calculator);
        return "calculator";
    }

    @RequestMapping(value = {"/calculator"}, method = RequestMethod.POST)
    public String calculate(Calculator calculator, Model model, RedirectAttributes redirectAttributes) {
       // System.out.println("++++++++++++++++++++++++++");
        if (calculator.getAdd1() != null && calculator.getAdd2() != null)
            calculatorService.add(calculator);
        if (calculator.getMult1() != null && calculator.getMult2() != null)
            calculatorService.mult(calculator);
        redirectAttributes.addFlashAttribute(calculator);
        redirectAttributes.addFlashAttribute("greeting", "Hello");
        return "redirect:/calculator";
    }
}
