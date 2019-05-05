package edu.mum.cs.cmbk.service;

import edu.mum.cs.cmbk.domain.Calculator;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public void add(Calculator calculator) {
        calculator.add();
    }

    @Override
    public void mult(Calculator calculator) {
        calculator.mult();
    }
}