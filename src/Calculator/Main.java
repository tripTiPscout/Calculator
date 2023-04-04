package Calculator;

import Calculator.Data.CalculationEngine;
import Calculator.Data.Extensions;
import Calculator.Data.InputInterpreter;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CalculationEngine engine = new CalculationEngine();
        InputInterpreter interpreter = Extensions.buildInterpreter(engine, new Stack<>());

        calculateExpression(scanner, interpreter);   // input: 5 + 2 * 3 - 1 / 2 =

        calculateSeparatedValues(scanner, interpreter);
    }

    private static void calculateSeparatedValues(Scanner scanner, InputInterpreter interpreter) {
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            interpreter.interpret(input);

            input = scanner.nextLine();
        }
    }

    private static void calculateExpression(Scanner scanner, InputInterpreter interpreter) {
        String[] tokens = scanner.nextLine().split("\\s+");
        for (String token : tokens) {
            if(token.equals("=")){
                interpreter.interpret(token);
                break;
            }
            interpreter.interpret(token);
        }
    }
}
