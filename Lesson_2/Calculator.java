public class Calculator {
    private int a;
    private int b;
    private char operator;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public char getOperator() {
        return operator;
    }

    private int add() {
        return a + b;
    }

    private int subtract() {
        return a - b;
    }

    private int multiply() {
        return a * b;
    }

    private int divide() {
        return a / b;
    }

    private int power() {
        int result = 1;
        for (int i = 0; i < b; i++) {
            result *= a;
        }
        return result;
    }

    private int getReminder() {
        return a % b;
    }

    public int calculate() {
        int result = 0;
        switch (operator) {
        case '+':
            result = add();
            break;
        case '-':
            result = subtract();
            break;
        case '*':
            result = multiply();
            break;
        case '/':
            result = divide();
            break;
        case '^':
            result = power();
            break;
        case '%':
            result = getReminder();
            break;
        }
        return result;
    }
}