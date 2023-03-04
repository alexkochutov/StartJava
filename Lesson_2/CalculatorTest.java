import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        boolean repeat = false;
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Введите первое число: ");
            calc.setA(scanner.nextInt());

            System.out.print("Введите знак математической операции: ");
            calc.setOperator(scanner.next().charAt(0));

            System.out.print("Введите второе число: ");
            calc.setB(scanner.nextInt());

            System.out.println("Результат выражения \"" + calc.getA() + " "
                    + calc.getOperator() + " " + calc.getB() + "\" = " + calc.calculate());

            String answer = "";
            while (!("yes".equals(answer) || "no".equals(answer))) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
                if (answer.equals("yes")) {
                    repeat = true;
                } else if (answer.equals("no")) {
                    repeat = false;
                }
            }
        } while (repeat);
    }
}