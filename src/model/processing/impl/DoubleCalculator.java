package model.processing.impl;

import model.processing.Calculator;

public class DoubleCalculator extends Calculator<Double> {

    private final double epsilon = 0.0000001;

    public DoubleCalculator() {
        super();
        addOperation('+', Double::sum);
        addOperation('*', (num1, num2) -> num1 * num2);
        addOperation('-', (num1, num2) -> num1 - num2);
        addOperation('/', (num1, num2) -> {
            if (Math.abs(num2) > epsilon){
                return num1 / num2;
            } else {
                System.out.println("Ошибка деления на ноль!");
                return null;
            }
        });
    }

}
