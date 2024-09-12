#  README Calculator

## Usage:
```java
// Create Calculator Instance        
Calculator calculator = new Calculator();
Number num1 = 10;
Number num2 = 5.5;

// Perform Operations
double add = calculator.calculate(Operation.ADD, num1, num2);
double sub = calculator.calculate(Operation.SUBTRACT, num1, num2);
double mul = calculator.calculate(Operation.MULTIPLY, num1, num2);
double div = calculator.calculate(Operation.DIVIDE, num1, num2);

// Chaining Operations
Operation[] operations = {Operation.ADD, Operation.MULTIPLY, Operation.SUBTRACT};
Number[] values = {5, 3, 2, 4};
calculator.chainingCalculate(operations, values);

System.out.println("ADD: " + add);
System.out.println("SUBTRACT: " + sub);
System.out.println("MULTIPLY: " + mul);
System.out.println("DIVIDE: " + div);
```

## Design Decision:
### Open-Closed Principle
```
The Calculator class follows the Open-Closed Principle, 
meaning it is open for extension but closed for modification.
If additional operations are needed, they can be added to the 
Operation enum without any modification in Calculator class.
```
### IoC Compatibility:
```
The calculator is compatible with IoC because its design allows for 
dependency injection and external management of behaviors. 
You can easily add or modify operations without changing the 
core Calculator class, which fits well with IoC principles like 
loose coupling and the Open-Closed Principle.
```