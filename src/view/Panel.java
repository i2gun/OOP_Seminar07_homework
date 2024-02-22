package view;

import presenter.Controller;
import java.util.Scanner;

public class Panel {

    public void run() {
        Scanner doubles = new Scanner(System.in);
        Controller controller = new Controller();

        System.out.print("Введите первое число: ");
        double num1 = doubles.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = doubles.nextDouble();
        controller.doubleCalc(num1, num2);

        System.out.println();
        System.out.print("Введите действительную часть первого числа: ");
        double real1 = doubles.nextDouble();
        System.out.print("Введите действительную часть второго числа: ");
        double real2 = doubles.nextDouble();
        System.out.print("Введите мнимую часть первого числа: ");
        double img1 = doubles.nextDouble();
        System.out.print("Введите мнимую часть второго числа: ");
        double img2 = doubles.nextDouble();
        controller.complexCalc(real1, real2, img1, img2);
    }
}
