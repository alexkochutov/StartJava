package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int a;
    private int b;
    private char operator;

    private void setA(int a) {
        this.a = a;
    }

    private void setB(int b) {
        this.b = b;
    }

    private void setOperator(char operator) {
        this.operator = operator;
    }

    public double calculate(String expression) {
        String[] elements = expression.split(" ");
        setA(Integer.parseInt(elements[0]));
        setOperator(elements[1].charAt(0));
        setB(Integer.parseInt(elements[2]));

        double result = 0;
        switch (operator) {
            case '+':
                return Math.addExact(a, b);
            case '-':
                return Math.subtractExact(a, b);
            case '*':
                return Math.multiplyExact(a, b);
            case '/':
                return (double) a / b;
            case '^':
                return Math.pow(a, b);
            case '%':
                return a % b;
        }
        return result;
    }
}