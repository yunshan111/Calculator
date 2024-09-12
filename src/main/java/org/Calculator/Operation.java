package org.Calculator;

public enum Operation {
    ADD {
        @Override
        public double cal(double num1, double num2) {
            return num1 + num2;
        }
    },
    SUBTRACT {
        @Override
        public double cal(double num1, double num2) {
            return num1 - num2;
        }
    },
    MULTIPLY {
        @Override
        public double cal(double num1, double num2) {
            return num1 * num2;
        }
    },
    DIVIDE {
        @Override
        public double cal(double num1, double num2) {
            // Check if the divisor == 0
            if (num2 == 0) {
                throw new ArithmeticException("Cannot use 0 as divisor.");
            }
            return num1 / num2;
        }
    };

    public abstract double cal(double num1, double num2);
}