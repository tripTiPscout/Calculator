package Calculator.Operations;

public class Addition extends OperationsImpl {

    @Override
    public void addOperand(double operand) {
        this.operands.add(operand);

        if (this.isCompleted()) {
            this.result = this.operands.get(0) + this.operands.get(1);
        }
    }

}
