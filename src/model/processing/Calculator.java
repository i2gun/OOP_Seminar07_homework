package model.processing;

import model.operations.Operation;

import java.util.HashMap;
import java.util.Map;

public class Calculator<T> {

    private final Map<Character, Operation<T>> operations;
    private Character lastOperator;
    private T lastResult;
    private T lastNum1;
    private T lastNum2;
    private boolean num1check;
    private boolean num2check;

    public Calculator() {
        operations = new HashMap<>();
        num1check = false;
        num2check = false;
    }

    public void addOperation(char operator, Operation<T> operation) {
        operations.put(operator, operation);
    }

    public void setNum1(T num) {
        lastNum1 = num;
        num1check = true;
    }

    public void setNum2(T num) {
        lastNum2 = num;
        num2check = true;
    }

    public T calculate (T num1, char operator, T num2) {
        lastOperator = operator;
        lastNum1 = num1;
        lastNum2 = num2;
        if (operations.containsKey(operator)) {
            Operation<T> operation = operations.get(operator);
            lastResult = operation.execute(num1, num2);
        } else {
            System.out.println("Некорректный оператор!");
            lastResult = null;
        }
        return lastResult;
    }

    public void calculate (char operator) {
        if (num1check && num2check) {
            lastResult = calculate(lastNum1, operator, lastNum2);
        } else {
            lastResult = null;
        }
    }

    @Override
    public String toString() {
        if (lastResult == null) {
            return "Предыдущая операция завершилась ошибкой!";
        }
        return "Операция: " + lastNum1 + " " + lastOperator + " " + lastNum2 +
                " = " + lastResult;
    }
}
