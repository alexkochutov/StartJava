package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private static int a;
    private static int b;
    private static char operator;

    private static void setA(String operand) throws IllegalArgumentException {
        if (isCorrect(operand)) {
            a = Integer.parseInt(operand);
        } else {
            throw new IllegalArgumentException("Первый агрумент не соответствует требованиям");
        }
    }

    private static void setB(String operand) throws IllegalArgumentException {
        if (isCorrect(operand)) {
            b = Integer.parseInt(operand);
        } else {
            throw new IllegalArgumentException("Второй агрумент не соответствует требованиям");
        }
    }

    public static double calculate(String expression) throws IllegalArgumentException {
        String[] elements = expression.split(" ");
        setA(elements[0]);
        operator = elements[1].charAt(0);
        setB(elements[2]);

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

    private static boolean isCorrect(String operand) {
        return ((Integer.parseInt(operand) > 0) && (Integer.parseInt(operand) % 1 == 0));
    }
}