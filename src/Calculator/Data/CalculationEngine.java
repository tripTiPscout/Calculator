package Calculator.Data;

import Calculator.Operations.Operation;

public class CalculationEngine {

    private Operation operation;

    public double result;

    public CalculationEngine() {
        this.result = 0;
        this.operation = null;
    }

    public void pushNumber(double number) {
        if (this.operation != null) {
            operation.addOperand(number);

            if (operation.isCompleted()) {
                this.result = operation.getResult();
                this.operation = null;
            }
        } else {
            this.result = number;
        }
    }

    public void pushOperation(Operation operation) {
        if (operation.isCompleted()) {
            this.pushNumber(operation.getResult());
        } else {
            this.operation = operation;
            this.pushNumber(this.result);
        }
    }

    public double getCurrentResult() {
        return this.result;
    }
}
