package mum.lab02.validator;

import java.util.ArrayList;
import java.util.List;

import mum.lab02.domain.Calculator;

public class CalculatorValidatorImpl implements CalculatorValidator {
	
	public List<String> validate(Object  object ) {
		List<String> errors = new ArrayList<String>();
		
		Calculator calculator = (Calculator) object;

		Double add1 = calculator.getAdd1();
        Double add2 = calculator.getAdd2();
        Double mult1 = calculator.getMult1();
        Double mult2 = calculator.getMult2();

		if (add1 == null) {
			errors.add("Calculator must have a add1");
		}

        if (add2 == null) {
            errors.add("Calculator must have a add2");
        }
        if (mult1 == null) {
            errors.add("Calculator must have a mult1");
        }
        if (mult2 == null) {
            errors.add("Calculator must have a mult2");
        }

		return errors;
	}
}
