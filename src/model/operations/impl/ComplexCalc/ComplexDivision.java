package model.operations.impl.ComplexCalc;

import model.operations.Operation;
import model.ComplexNumber;

public class ComplexDivision implements Operation<ComplexNumber> {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        double denominator = num2.getReal() * num2.getReal() + num2.getImaginary() * num2.getImaginary();
        if (Math.abs(denominator) < ComplexNumber.getEpsilon()) {
            System.out.println("Ошибка деления на ноль!");
            return null;
        }
        double realPart = (num1.getReal() * num2.getReal() + num1.getImaginary() * num2.getImaginary()) / denominator;
        double imaginaryPart = (num1.getImaginary() * num2.getReal() - num1.getReal() * num2.getImaginary()) / denominator;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}