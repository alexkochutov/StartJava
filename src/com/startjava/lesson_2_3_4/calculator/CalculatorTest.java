package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String repeat = "yes";
        do {
            if ("yes".equals(repeat)) {
                double result;
                do {
                    System.out.print("Введите математическое выражение: ");
                    try {
                        result = Calculator.calculate(scanner.nextLine());
                        break;
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                } while (true);
                System.out.printf((result % 1 == 0) ? "%.0f%n" : "%.3f%n", result);
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            repeat = scanner.nextLine();
        } while (!"no".equals(repeat));
    }
}