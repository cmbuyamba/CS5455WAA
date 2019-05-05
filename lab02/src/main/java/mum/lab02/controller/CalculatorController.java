package mum.lab02.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mum.lab02.domain.Calculator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.RequestMapping;
import mum.edu.framework.annotation.Controller;
import mum.lab02.validator.CalculatorValidator;

@Controller
public class CalculatorController {

	@AutoWired
	CalculatorValidator productValidator;

	@RequestMapping(value = { "/", "/calculator_input" })
	public String inputCalculator(HttpServletRequest request, HttpServletResponse response) {
		return "/WEB-INF/jsp/calculator.jsp";
	}

	@RequestMapping(value = "/calculate")
	public String calculate(Calculator calculator, HttpServletRequest request, HttpServletResponse response) {
		List<String> errors = productValidator.validate(calculator);
		if (errors.isEmpty()) {
			// store calculator in a scope variable for the view
			request.setAttribute("sum", calculator.getAdd1()+calculator.getAdd2());
			request.setAttribute("product", calculator.getMult1()*calculator.getMult2());
		} else {
			// store errors and calculator in a scope variable for the view
			request.setAttribute("errors", errors);
		}

		request.setAttribute("calculator", calculator);
		return "/WEB-INF/jsp/calculator.jsp";
	}
}
