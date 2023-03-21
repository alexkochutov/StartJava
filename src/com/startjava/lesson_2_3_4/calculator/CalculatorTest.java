package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeat = "yes";
        do {
            if ("yes".equals(repeat)) {
                double result = 0d;
                boolean isValid;
                do {
                    isValid = true;
                    System.out.print("Введите математическое выражение: ");
                    try {
                        result = Calculator.calculate(scanner.nextLine());
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                        isValid = false;
                    }
                } while (!isValid);
                System.out.printf((result % 1 == 0) ? "%.0f%n" : "%.3f%n", result);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            repeat = scanner.nextLine();
        } while (!"no".equals(repeat));
    }
}