import calculator.Calculator;
import ComplexCalc.*;

public class ComplexCalculator extends Calculator<ComplexNumber> {

    public ComplexCalculator() {
        super();
        addOperation('+', new ComplexAddition());
        addOperation('/', new ComplexDivision());
        addOperation('*', new ComplexMultiplication());
        addOperation('-', new ComplexSubtraction());
    }

}
