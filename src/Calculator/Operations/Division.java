package Calculator.Operations;

public class Division extends OperationsImpl {

    @Override
    public void addOperand(double operand) {
        this.operands.add(operand);

        if (this.isCompleted()) {
            if (this.operands.get(1) == 0) {
                System.out.println("Cannot divide by zero. Insert valid value:");
                this.operands.remove(1);
                return;
            }
            this.result = this.operands.get(0) / this.operands.get(1);
        }
    }
}
