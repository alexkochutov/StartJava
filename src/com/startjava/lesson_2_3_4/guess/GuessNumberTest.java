package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.next());

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.next());

        System.out.print("Введите имя третьего игрока: ");
        Player player3 = new Player(scanner.next());

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
}