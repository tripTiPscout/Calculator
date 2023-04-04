package Calculator.Operations;

import java.util.Stack;

public class MemoryRecall implements Operation {
    private final Stack<Double> memory;

    public MemoryRecall(Stack<Double> memory) {
        this.memory = memory;
    }

    @Override
    public void addOperand(double operand) {

    }

    @Override
    public double getResult() {
        return this.memory.pop();
    }

    @Override
    public boolean isCompleted() {
        return !this.memory.isEmpty();
    }
}