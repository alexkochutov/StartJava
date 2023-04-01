package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Player player1 = createPlayer();
        Player player2 = createPlayer();
        Player player3 = createPlayer();

        GuessNumber game = new GuessNumber(player1, player2, player3);
        String repeat = "yes";
        do {
            if ("yes".equals(repeat)) {
                game.start();
            }
            System.out.print("Хотите продолжить игру? [yes/no]: ");
            repeat = scanner.next();
        } while (!"no".equals(repeat));
    }

    private static Player createPlayer() {
        System.out.print("Введите имя игрока: ");
        return new Player(scanner.next());
    }
}