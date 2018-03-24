/* @author Zhanna */

import java.util.Scanner;


public class Calc {

    static void Calculator() {
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
                result = a / b;
                break;
            default:
                System.out.println("Вы ввели некорректную операцию");
        }
        /*
         Вывод результата.
         */
        System.out.printf("Результат равен=" + "%.4f", result);
    }



    static void Slovo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива:");
        Integer a = scanner.nextInt();
        String[] thisIsAStringArray = new String[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Введите слово:");
            String b = scanner.next();
            thisIsAStringArray[i] = b;
        }
        for (int i = 0; i < a; i++) {
            System.out.println(thisIsAStringArray[i]);

        }
        int bestElementIndex = 0;
        for (int i = 1; i < thisIsAStringArray.length; i++) {
            if (thisIsAStringArray[i].length() > thisIsAStringArray[bestElementIndex].length()) {
                bestElementIndex = i;
            }
        }

        System.out.println("Самое длинное слово" + "  " + thisIsAStringArray[bestElementIndex]);
    }

    static void Choice() {
        System.out.println("Выбрать: Калькулятор-1, Поиск максимального значения-2:");
        Scanner scanner = new Scanner(System.in);
        Integer y = scanner.nextInt();
        switch (y) {
            case 1: Calculator();
            break;
            case 2: Slovo();
            break;
            default: System.out.println("Такой операции нет");
            break;


        }


    }
    public static void main (String [] args) {
Choice();
    }
}













