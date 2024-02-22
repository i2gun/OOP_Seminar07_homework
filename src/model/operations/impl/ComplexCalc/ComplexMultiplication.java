package model.operations.impl.ComplexCalc;

import model.operations.Operation;
import model.ComplexNumber;

public class ComplexMultiplication implements Operation<ComplexNumber> {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        double realPart = num1.getReal() * num2.getReal() - num1.getImaginary() * num2.getImaginary();
        double imaginaryPart = num1.getReal() * num2.getImaginary() + num1.getImaginary() * num2.getReal();
        return new ComplexNumber(realPart, imaginaryPart);
    }
}