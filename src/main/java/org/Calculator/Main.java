package org.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Number num1 = 10;
        Number num2 = 5.5;

        double add = calculator.calculate(Operation.ADD, num1, num2);
        double sub = calculator.calculate(Operation.SUBTRACT, num1, num2);
        double mul = calculator.calculate(Operation.MULTIPLY, num1, num2);
        double div = calculator.calculate(Operation.DIVIDE, num1, num2);

        System.out.println("ADD: " + add);
        System.out.println("SUBTRACT: " + sub);
        System.out.println("MULTIPLY: " + mul);
        System.out.println("DIVIDE: " + div);
    }
}