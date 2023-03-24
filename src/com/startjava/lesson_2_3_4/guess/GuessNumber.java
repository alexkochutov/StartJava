package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secret;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private void setSecret() {
        secret = 1 + (int) (Math.random() * 100);
        System.out.println("Компьютер загадал число в полуинтервале (0, 100]");
    }

    public void start() {
        flushRoundResult();
        setSecret();
        System.out.println("У каждого игрока по " + Player.ATTEMPT_LIMIT + " попыток");
        do {
            if (!checkAttempts(player1)) break;
            inputNumber(player1);
            if (compareNumbers(player1)) break;

            if (!checkAttempts(player2)) break;
            inputNumber(player2);
        } while (!compareNumbers(player2));
        showRoundResult();
    }

    private void flushRoundResult() {
        flushPlayerAnswers(player1);
        flushPlayerAnswers(player2);
    }

    private void flushPlayerAnswers(Player player) {
        if (player.getAttemptCount() != 0) {
            player.clearAnswers();
        }
    }

    private boolean checkAttempts(Player player) {
        if (player.getAttemptCount() < Player.ATTEMPT_LIMIT) {
            return true;
        } else {
            System.out.println("У игрока " + player1.getName() + " закончились попытки");
        }
        return false;
    }

    private void inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ход игрока " + player.getName() + ": Введите число: ");
        player.setAnswer(scanner.nextInt());
    }

    private boolean compareNumbers(Player player) {
        int number = player.getAnswer();
        if (number == secret) {
            System.out.println("Игрок " + player.getName() + " угадал число \"" + secret +
                    "\" с " + player.getAttemptCount() + " попытки");
            return true;
        } else {
            System.out.print("Число " + number);
            if (number > secret) {
                System.out.print(" больше ");
            } else {
                System.out.print(" меньше ");
            }
            System.out.println("того, что загадал компьютер");
        }
        return false;
    }

    private void showRoundResult() {
        System.out.print("Все ответы игрока " + player1.getName() + ": ");
        for (int number : player1.getAllAnswers()) {
            System.out.print(" " + number);
        }
        System.out.println();
        System.out.print("Все ответы игрока " + player2.getName() + ": ");
        for (int number : player2.getAllAnswers()) {
            System.out.print(" " + number);
        }
        System.out.println();
    }
}