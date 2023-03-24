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
        if (isCorrect(elements[0])) {
            a = Integer.parseInt(elements[0]);
        } else {
            throw new IllegalArgumentException("Первый аргумент не соответствует требованиям:" +
                    " аргумент меньше либо равен нулю или представлен не целым числом");
        }
        if (isCorrect(elements[2])) {
            b = Integer.parseInt(elements[2]);
        } else {
            throw new IllegalArgumentException("Второй аргумент не соответствует требованиям:" +
                    " аргумент меньше либо равен нулю или представлен не целым числом");
        }
        operator = elements[1].charAt(0);
    }

    private static boolean isCorrect(String operand) {
        return ((Integer.parseInt(operand) > 0) && (Integer.parseInt(operand) % 1 == 0));
    }
}