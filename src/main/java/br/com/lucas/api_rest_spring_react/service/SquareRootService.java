package br.com.lucas.api_rest_spring_react.service;

import br.com.lucas.api_rest_spring_react.exception.MathOperationsException;
import br.com.lucas.api_rest_spring_react.utils.MathCalculatorUtils;
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
