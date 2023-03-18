package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        String repeat = "yes";
        do {
            if ("yes".equals(repeat)) {
                System.out.print("Введите математическое выражение: ");
                double result = calc.calculate(scanner.nextLine());
                if (result % 1 == 0) {
                    System.out.println((int) result);
                } else {
                    System.out.printf("%.3f%n", result);
                }
            }
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            repeat = scanner.nextLine();
        } while (!"no".equals(repeat));
    }
}