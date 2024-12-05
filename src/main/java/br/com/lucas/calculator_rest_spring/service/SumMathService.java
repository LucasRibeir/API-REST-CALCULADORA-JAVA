package br.com.lucas.calculator_rest_spring.service;

import br.com.lucas.calculator_rest_spring.exception.MathOperationsException;
import br.com.lucas.calculator_rest_spring.utils.MathCalculatorUtils;
import org.springframework.stereotype.Service;

@Service
public class SumMathService implements ISumMath {

    @Override
    public Double calculateSum(String numberOne, String numberTwo) {
        if (!MathCalculatorUtils.isNumeric(numberOne) || !MathCalculatorUtils.isNumeric(numberTwo))
            throw new MathOperationsException("Please set a numeric value");

        return MathCalculatorUtils.convertoDouble(numberOne) + MathCalculatorUtils.convertoDouble(numberTwo);
    }
}