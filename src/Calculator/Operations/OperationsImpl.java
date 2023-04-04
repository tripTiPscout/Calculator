package Calculator.Operations;

import java.util.ArrayList;
import java.util.List;

public abstract class OperationsImpl implements Operation{

    public List<Double> operands;

    public double result;

    public OperationsImpl() {
        this.operands = new ArrayList<>();
    }

    @Override
    public void addOperand(double operand) {}

    @Override
    public double getResult() {
        return this.result;
    }

    @Override
    public boolean isCompleted() {
        return this.operands.size() == 2;
    }
}
