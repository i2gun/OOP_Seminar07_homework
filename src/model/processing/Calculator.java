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
    private final boolean[] allSetCheck;

    public Calculator() {
        operations = new HashMap<>();
        allSetCheck = new boolean[] { false, false, false };
    }

    public void addOperation(char operator, Operation<T> operation) {
        operations.put(operator, operation);
        allSetCheck[2] = true;
    }

    public void setNum1(T num) {
        lastNum1 = num;
        allSetCheck[0] = true;
    }

    public void setNum2(T num) {
        lastNum2 = num;
        allSetCheck[1] = true;
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
        if (allSetCheck[0] && allSetCheck[1] && allSetCheck[2]) {
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
