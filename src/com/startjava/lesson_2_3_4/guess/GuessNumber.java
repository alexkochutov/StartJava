package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNumbers;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        init();
        setSecretNumbers();
        System.out.println("У каждого игрока по " + Player.capacity + " попыток");
        do {
            if (!hasAttempts(player1)) break;
            inputNumber(player1);
            if (isGuessed(player1)) break;

            if (!hasAttempts(player2)) break;
            inputNumber(player2);
        } while (!isGuessed(player2));
        showRoundResult();
    }

    private void init() {
        initPlayers(player1);
        initPlayers(player2);
    }

    private void initPlayers(Player player) {
        if (player.getAttemptCount() != 0) {
            player.clearAnswers();
        }
    }

    private void setSecretNumbers() {
        secretNumbers = 1 + (int) (Math.random() * 100);
        System.out.println("Компьютер загадал число в полуинтервале (0, 100]");
    }

    private boolean hasAttempts(Player player) {
        if (player.checkAttempts()) return true;
        System.out.println("У игрока " + player.getName() + " закончились попытки");
        return false;
    }

    private void inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ход игрока " + player.getName() + ": Введите число: ");
        player.addAnswer(scanner.nextInt());
    }

    private boolean isGuessed(Player player) {
        int number = player.getAnswer();
        if (number == secretNumbers) {
            System.out.println("Игрок " + player.getName() + " угадал число \"" + secretNumbers +
                    "\" с " + player.getAttemptCount() + " попытки");
            return true;
        }
        System.out.println("Число " + number + ((number > secretNumbers) ? " больше " : " меньше ") +
                "того, что загадал компьютер");
        return false;
    }

    private void showRoundResult() {
        showPlayerAnswers(player1);
        showPlayerAnswers(player2);
    }

    private void showPlayerAnswers(Player player) {
        System.out.print("Все ответы игрока " + player.getName() + ": ");
        for (int number : player.getAllAnswers()) {
            System.out.print(" " + number);
        }
        System.out.println();
    }
}