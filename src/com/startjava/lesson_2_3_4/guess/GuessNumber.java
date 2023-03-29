package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.Scanner;

public class GuessNumber {
    private final int ROUND_COUNT = 3;

    private Player[] players;
    private boolean isRoundFinished;
    private int secretNumber;

    public GuessNumber(Player... players) {
        this.players = Arrays.copyOf(players, players.length);
    }

    public void start() {
        shuffle();
        for (int i = 1; i <= ROUND_COUNT; i++) {
            isRoundFinished = false;
            System.out.println("***************** РАУНД " + i + " ******************");
            init();
            setSecretNumber();
            System.out.println("У каждого игрока по " + Player.CAPACITY + " попыток");
            do {
                for (Player player : players) {
                    if (!hasAttempts(player)) break;
                    inputNumber(player);
                    if (isGuessed(player)) break;
                }
            } while(!isRoundFinished);
            showRoundResult();
            System.out.println("************ РАУНД " + i + " ЗАВЕРШИЛСЯ ************");
        }
        showGameResult();
    }

    private void shuffle() {
        int countSteps = players.length;
        int shuffleScope = players.length - 1;
        for (int i = 1; i < countSteps; i++) {
            int random = (int) (Math.random() * shuffleScope);
            if (random != shuffleScope) {
                Player temp = players[shuffleScope];
                players[shuffleScope] = players[random];
                players[random] = temp;
            }
            shuffleScope--;
        }
        System.out.println("Игроки будут ходить в следующем порядке:");
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }

    private void init() {
        for (Player player : players) {
            initPlayers(player);
        }
    }

    private void initPlayers(Player player) {
        if (player.getCountAttempt() != 0) {
            player.clearAnswers();
        }
    }

    private void setSecretNumber() {
        secretNumber = 1 + (int) (Math.random() * 100);
        System.out.println("Компьютер загадал число в полуинтервале (0, 100]");
    }

    private boolean hasAttempts(Player player) {
        if (player.checkAttempts()) return true;
        System.out.println("У игрока " + player.getName() + " закончились попытки");
        isRoundFinished = true;
        return false;
    }

    private void inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Ход игрока " + player.getName() + ": Введите число: ");
            try {
                player.addAnswer(scanner.nextInt());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while(true);
    }

    private boolean isGuessed(Player player) {
        int number = player.getAnswer();
        if (number == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число \"" + secretNumber +
                    "\" с " + player.getCountAttempt() + " попытки");
            player.increaseScore();
            isRoundFinished = true;
            return true;
        }
        System.out.println("Число " + number + ((number > secretNumber) ? " больше " : " меньше ") +
                "того, что загадал компьютер");
        return false;
    }

    private void showRoundResult() {
        for (Player player : players) {
            showPlayerAnswers(player);
        }
    }

    private void showPlayerAnswers(Player player) {
        System.out.print("Все ответы игрока " + player.getName() + ": ");
        for (int number : player.getAllAnswers()) {
            System.out.print(" " + number);
        }
        System.out.println();
    }

    private void showGameResult() {
        System.out.print("По результатам " + ROUND_COUNT + " раундов ");
        if (players[0].getScore() == players[1].getScore()) {
            System.out.println("произошла ничья!");
        } else {
            Player winner = players[0];
            for (int i = 1; i < players.length; i++) {
                if (winner.getScore() < players[i].getScore()) {
                    winner = players[i];
                }
            }
            System.out.println("победу одержал игрок " + winner.getName());
        }
    }
}