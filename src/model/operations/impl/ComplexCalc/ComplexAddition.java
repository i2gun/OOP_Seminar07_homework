package model.operations.impl.ComplexCalc;

import model.operations.Operation;
import model.ComplexNumber;

public class ComplexAddition implements Operation<ComplexNumber> {

    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.getReal() + num2.getReal(),
                            num1.getImaginary() + num2.getImaginary());
    }
}