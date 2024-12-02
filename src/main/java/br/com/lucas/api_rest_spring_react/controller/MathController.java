package br.com.lucas.api_rest_spring_react.controller;

import br.com.lucas.api_rest_spring_react.service.IDivisionMath;
import br.com.lucas.api_rest_spring_react.service.IMultiplicationMath;
import br.com.lucas.api_rest_spring_react.service.ISubstractionMath;
import br.com.lucas.api_rest_spring_react.service.ISumMath;
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
}