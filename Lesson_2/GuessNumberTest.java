import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        String repeat;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.next());

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.next());

        do {
            repeat = "";
            GuessNumber game = new GuessNumber(player1, player2);
            game.startGame();
            String answer = "";
            while (!("yes".equals(repeat) || "no".equals(repeat))) {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
                repeat = scanner.next();
            }
        } while ("yes".equals(repeat));
    }
}