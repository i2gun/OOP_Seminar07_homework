package presenter;

import model.ComplexNumber;
import model.processing.Calculator;
import model.processing.impl.ComplexCalculator;
import model.processing.impl.DoubleCalculator;

public class Controller {

    public void doubleCalc(double num1, double num2) {
        Calculator<Double> doubleCalc = new DoubleCalculator();
        doubleCalc.setNum1(num1);
        doubleCalc.setNum2(num2);
        allOperations(doubleCalc);
    }

    public void complexCalc(double real1, double real2, double img1, double img2) {
        Calculator<ComplexNumber> complexCalc = new ComplexCalculator();
        complexCalc.setNum1(new ComplexNumber(real1, img1));
        complexCalc.setNum2(new ComplexNumber(real2, img2));
        allOperations(complexCalc);
    }

    private void allOperations(Calculator<?> calculator) {
        calculateAndPrint(calculator, '*');
        calculateAndPrint(calculator, '+');
        calculateAndPrint(calculator, '-');
        calculateAndPrint(calculator, '/');
    }

    private static void calculateAndPrint(Calculator<?> calculator, char operator) {
        calculator.calculate(operator);
        System.out.println(calculator);
    }
}
