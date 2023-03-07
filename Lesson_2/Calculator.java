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

    public int calculate() {
        int result = 0;
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            case '^':
                result = 1;
                for (int i = 0; i < b; i++) {
                result *= a;
                }
                return result;
            case '%':
                return a % b;
        }
        return result;
    }
}