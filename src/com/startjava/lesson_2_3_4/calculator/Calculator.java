package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static int a;
    private static int b;
    private static char operator;

    public static double calculate(String expression) {
        parseExpression(expression);

        return switch (operator) {
            case '+' -> Math.addExact(a, b);
            case '-' -> Math.subtractExact(a, b);
            case '*' -> Math.multiplyExact(a, b);
            case '/' -> (double) a / b;
            case '^' -> Math.pow(a, b);
            case '%' -> a % b;
            default -> 0;
        };
    }

    private static void parseExpression(String expression) {
        String[] elements = expression.split(" ");
        a = checkOperand(elements[0]);
        b = checkOperand(elements[2]);
        operator = elements[1].charAt(0);
    }

    private static int checkOperand(String element) {
        int result = Integer.parseInt(element);
        if ((result > 0) && (result % 1 == 0)) {
            return result;
        }
        throw new IllegalArgumentException("Аргумент должен быть натуральным числом");
    }
}