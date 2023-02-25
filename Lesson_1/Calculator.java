public class Calculator {

    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        int result = 0;
        char operator = '^';    // Possible values: +, -, *, /, ^, %
        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else if (operator == '/') {
            result = a / b;
        } else if (operator == '^') {
            result = a;
            for (int i = 1; i < b; i++) {
                result *= a;
            }
        } else {
            result = a % b;
        }
        System.out.println(a + " " + operator + " " + b + " = " + result);
    }
}