package task_1;

import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Объявляем и инициализируем переменные
        boolean validInput = false;
        int num1 = 0;
        int num2 = 0;

        // Цикл для ввода двух целых чисел
        do {
            System.out.print("Введите первое целое число: ");
            String input1 = scanner.nextLine();

            System.out.print("Введите второе целое число: ");
            String input2 = scanner.nextLine();

            // Проверяем, что оба числа корректны
            if (isInteger(input1)) {
                System.out.println("Первое число должно быть целым числом.");
                continue;
            }
            if (isInteger(input2)) {
                System.out.println("Второе число должно быть целым числом.");
                continue;
            }

            num1 = Integer.parseInt(input1);
            num2 = Integer.parseInt(input2);

            // Проверяем, что оба числа не равны нулю
            if (num1 == 0 && num2 == 0) {
                System.out.println("Ошибка: оба числа не могут быть равны нулю.");
                continue;
            }

            validInput = true;
        } while (!validInput);

        // Выполняем арифметические операции
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        // Обрабатываем операцию деления отдельно
        String quotientMessage = "";
        if (num2 != 0) {
            double quotient = (double) num1 / num2;
            quotientMessage = "Частное: " + quotient;
        } else {
            quotientMessage = "Деление на ноль невозможно!";
        }

        // Выводим результаты
        printResult(sum, difference, product, quotientMessage);
    }

    // Метод для проверки, является ли строка целым числом
    private static boolean isInteger(String str) {
        if (str.isEmpty()) return true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c < '0' || c > '9') && c != '-') {
                return true;
            }
        }
        return false;
    }

    // Метод для вывода результатов вычислений
    public static void printResult(int sum, int difference, int product, String quotientMessage) {
        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println(quotientMessage); // Выводим либо результат деления, либо ошибку
    }
}
