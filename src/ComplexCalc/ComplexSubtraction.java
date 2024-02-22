package ComplexCalc;

import calculator.Operation;

public class ComplexSubtraction implements Operation<ComplexNumber> {
    @Override
    public ComplexNumber execute(ComplexNumber num1, ComplexNumber num2) {
        return new ComplexNumber(num1.getReal() - num2.getReal(),
                            num1.getImaginary() - num2.getImaginary());
    }
}