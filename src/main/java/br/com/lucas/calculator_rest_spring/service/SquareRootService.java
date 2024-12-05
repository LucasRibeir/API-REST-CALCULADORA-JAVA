package br.com.lucas.calculator_rest_spring.service;

import br.com.lucas.calculator_rest_spring.exception.MathOperationsException;
import br.com.lucas.calculator_rest_spring.utils.MathCalculatorUtils;
import org.springframework.stereotype.Service;

@Service
public class SquareRootService implements ISquareRoot {

    @Override
    public Double squareRootCalculate(String number) {
        if (!MathCalculatorUtils.isNumeric(number))
            throw new MathOperationsException("Please set a numeric value");

        return Math.sqrt(MathCalculatorUtils.convertoDouble(number));
    }
}
