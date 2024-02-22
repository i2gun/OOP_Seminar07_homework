package view;

import presenter.Controller;
import java.util.Scanner;

public class Panel {

    public void run() {
        Scanner number = new Scanner(System.in);
        Controller controller = new Controller();

        int numtype = 0;
        String msg = "Выберите тип данных (1 - вещественные; 2 - комплесные): ";
        while (numtype != 1 && numtype != 2) {
            System.out.print(msg);
            while (!number.hasNextInt()) {
                System.out.print("Ошибка ввода. " + msg);
                number.next();
            }
            numtype = number.nextInt();
        }

        switch (numtype) {
            case 1:
                double num1 = enterNumber("Введите первое число: ");
                double num2 = enterNumber("Введите второе число: ");
                controller.doubleCalc(num1, num2);
                break;

            case 2:
                double real1 = enterNumber("Введите действительную часть первого числа: ");
                double real2 = enterNumber("Введите действительную часть второго числа: ");
                double img1 = enterNumber("Введите мнимую часть первого числа: ");
                double img2 = enterNumber("Введите мнимую часть второго числа: ");
                controller.complexCalc(real1, real2, img1, img2);
                break;
        }
    }

    private double enterNumber(String msg) {
        Scanner number = new Scanner(System.in);
        System.out.print(msg);
        while (!number.hasNextDouble()) {
            System.out.print("Ошибка ввода. " + msg);
            number.next();
        }
        return number.nextDouble();
    }
}
