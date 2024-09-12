package org.Calculator;

public class Calculator {
    public double calculate(Operation operation, Number num1, Number num2){
        double result = operation.cal(num1.doubleValue(), num2.doubleValue());
        return result;
    }

    public double chainingCalculate(Operation[] operations, Number[] values) {
        // Check if the input is valid - operations.length = values.length - 1
        if(operations.length != values.length - 1){
            throw new IllegalArgumentException("The number of operations must equal to number of values plus 1.");
        }

        double result = values[0].doubleValue();

        for(int i = 0; i < operations.length; i ++){
            result = operations[i].cal(result, values[i + 1].doubleValue());
        }
        return result;
    }
}
