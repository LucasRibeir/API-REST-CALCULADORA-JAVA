package br.com.lucas.calculator_rest_spring.controller;

import br.com.lucas.calculator_rest_spring.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MathController {

    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private ISumMath sumMath;
    @Autowired
    private ISubstractionMath substractionMath;
    @Autowired
    private IMultiplicationMath multiplicationMath;
    @Autowired
    private IDivisionMath divisionMath;
    @Autowired
    private IMeanMath meanMath;
    @Autowired
    private ISquareRoot squareRoot;

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}")
    @GetMapping
    public Double sum(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) {
        return sumMath.calculateSum(numberOne, numberTwo);
    }

    @RequestMapping(value = "/substraction/{numberOne}/{numberTwo}")
    @GetMapping
    public Double subtraction(@PathVariable(value = "numberOne") String numberOne,
                              @PathVariable(value = "numberTwo") String numberTwo) {
        return substractionMath.calculateSubstraction(numberOne, numberTwo);
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}")
    @GetMapping
    public Double multiplication(@PathVariable(value = "numberOne") String numberOne,
                                 @PathVariable(value = "numberTwo") String numberTwo) {
        return multiplicationMath.calculateMultiplication(numberOne, numberTwo);
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}")
    @GetMapping
    public Double division(@PathVariable(value = "numberOne") String numberOne,
                           @PathVariable(value = "numberTwo") String numberTwo) {
        return divisionMath.calculateDivision(numberOne, numberTwo);
    }

    @RequestMapping(value = "/mean/{numberOne}/{numberTwo}")
    @GetMapping
    public Double mean(@PathVariable(value = "numberOne") String numberOne,
                       @PathVariable(value = "numberTwo") String numberTwo) {
        return meanMath.calculateMean(numberOne, numberTwo);
    }

    @RequestMapping(value = "/squareRoot/{number}")
    @GetMapping
    public Double squareRoot(@PathVariable(value = "number") String numberOne) {
        return squareRoot.squareRootCalculate(numberOne);
    }
}