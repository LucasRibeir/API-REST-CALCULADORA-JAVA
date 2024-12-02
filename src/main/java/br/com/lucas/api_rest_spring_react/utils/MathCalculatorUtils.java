package br.com.lucas.api_rest_spring_react.utils;

import org.springframework.stereotype.Component;

@Component
public class MathCalculatorUtils {

    public static Double convertoDouble(String numberString) {
        if (numberString == null)
            return 0D;

        String number = numberString.replaceAll(",", ".");

        if (isNumeric(number))
            return Double.parseDouble(number);

        return 0D;
    }

    public static boolean isNumeric(String number) {
        if (number == null)
            return false;
        String numberString = number.replaceAll(",", ".");
        return numberString.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
