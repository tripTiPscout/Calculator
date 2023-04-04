package Calculator.Operations;

import java.text.DecimalFormat;

public class Result extends OperationsImpl {

    public Result(double result) {
        DecimalFormat format = new DecimalFormat("0.########");
        System.out.println(format.format(result));
    }
}
