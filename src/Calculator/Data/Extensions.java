package Calculator.Data;

import java.util.Stack;

public class Extensions {
    public static InputInterpreter buildInterpreter(CalculationEngine engine, Stack<Double> memory) {
        return new InputInterpreter(engine, memory);
    }
}