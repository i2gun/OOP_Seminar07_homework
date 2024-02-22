import calculator.Calculator;
import ComplexCalc.ComplexNumber;

public class Main {
    public static void main(String[] args) {
        Calculator<Double> doubleCalc = new DoubleCalculator();
        doubleCalc.setNum1(222.0);
        doubleCalc.setNum2(111.0);

        calculateAndPrint(doubleCalc, '*');
        calculateAndPrint(doubleCalc, '+');
        calculateAndPrint(doubleCalc, '-');
        calculateAndPrint(doubleCalc, '/');

        System.out.println();

        Calculator<ComplexNumber> complexCalc = new ComplexCalculator();
        complexCalc.setNum1(new ComplexNumber(5, 5));
        complexCalc.setNum2(new ComplexNumber(15, 15));

        calculateAndPrint(complexCalc, '*');
        calculateAndPrint(complexCalc, '+');
        calculateAndPrint(complexCalc, '-');
        calculateAndPrint(complexCalc, '/');
    }

    private static void calculateAndPrint(Calculator<?> calculator, char operator) {
        calculator.calculate(operator);
        System.out.println(calculator);
    }
}