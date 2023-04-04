package Calculator.Operations;

import java.util.Stack;

public class MemorySave implements Operation {
    private final Stack<Double> memory;

    public MemorySave(Stack<Double> memory) {
        this.memory = memory;
    }

    @Override
    public void addOperand(double operand) {
        this.memory.push(operand);
    }

    @Override
    public double getResult() {
        return this.memory.peek();
    }

    @Override
    public boolean isCompleted() {
        return false;
    }
}
