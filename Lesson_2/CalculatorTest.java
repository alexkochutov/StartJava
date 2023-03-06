import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        String repeat;
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        do {
            repeat = "";
            System.out.print("Введите первое число: ");
            calc.setA(scanner.nextInt());

            System.out.print("Введите знак математической операции: ");
            calc.setOperator(scanner.next().charAt(0));

            System.out.print("Введите второе число: ");
            calc.setB(scanner.nextInt());

            System.out.println("Результат выражения \"" + calc.getA() + " "
                    + calc.getOperator() + " " + calc.getB() + "\" = " + calc.calculate());

            while (!("yes".equals(repeat) || "no".equals(repeat))) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                repeat = scanner.next();
            }
        } while ("yes".equals(repeat));
    }
}