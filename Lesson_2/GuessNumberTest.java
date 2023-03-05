import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.next());

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.next());

        boolean repeat = false;
        do {
            GuessNumber game = new GuessNumber(player1, player2);
            game.startGame();
            String answer = "";
            while (!("yes".equals(answer) || "no".equals(answer))) {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                answer = scanner.next();
                if ("yes".equals(answer)) {
                    repeat = true;
                } else if ("no".equals(answer)) {
                    repeat = false;
                }
            }
        } while (repeat);
    }
}