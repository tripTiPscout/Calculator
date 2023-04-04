package Calculator.Data;

import Calculator.Operations.Addition;
import Calculator.Operations.Division;
import Calculator.Operations.MemoryRecall;
import Calculator.Operations.MemorySave;
import Calculator.Operations.Multiplication;
import Calculator.Operations.Operation;
import Calculator.Operations.Result;
import Calculator.Operations.Subtraction;

import java.util.Stack;

public class InputInterpreter {

    private final Stack<Double> memory;

    private final CalculationEngine engine;

    public InputInterpreter(CalculationEngine engine, Stack<Double> stack) {
        this.engine = engine;
        this.memory = stack;
    }


    public boolean interpret(String input) {
        try {
            engine.pushNumber(Double.parseDouble(input));
        } catch (Exception ex) {
            engine.pushOperation(this.getOperation(input));
        }
        return true;
    }

    public Operation getOperation(String operation) {
        return switch (operation) {
            case "+" -> new Addition();
            case "-" -> new Subtraction();
            case "*" -> new Multiplication();
            case "/" -> new Division();
            case "=" -> new Result(engine.getCurrentResult());
            case "ms" -> new MemorySave(this.memory);
            case "mr" -> new MemoryRecall(this.memory);
            default -> null;
        };
    }
}
