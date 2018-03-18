/* @author Zhanna */

import java.util.Scanner;

public class Calc {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое дробное число:");//пример 1.23
        double a = scanner.nextDouble();
        System.out.println("Введите второе дробное число:");//пример 1.23
        double b = scanner.nextDouble();
        System.out.println("Выберите операцию: +, -, *, /");
        String oper = scanner.next();
        double result = 0.0; /*значение результата по умолчанию*/
        switch (oper) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                result = a /b;
                break;
            default:
                System.out.println("Вы ввели некорректную операцию");
        }
        /*
         Вывод результата.
         */
        System.out.printf("Результат равен="+"%.4f", result);
    }
    }

