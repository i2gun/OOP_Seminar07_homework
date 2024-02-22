package model.processing.impl;

import model.operations.impl.ComplexCalc.ComplexAddition;
import model.operations.impl.ComplexCalc.ComplexDivision;
import model.operations.impl.ComplexCalc.ComplexMultiplication;
import model.operations.impl.ComplexCalc.ComplexSubtraction;
import model.ComplexNumber;
import model.processing.Calculator;

public class ComplexCalculator extends Calculator<ComplexNumber> {

    public ComplexCalculator() {
        super();
        addOperation('+', new ComplexAddition());
        addOperation('/', new ComplexDivision());
        addOperation('*', new ComplexMultiplication());
        addOperation('-', new ComplexSubtraction());
    }

}
