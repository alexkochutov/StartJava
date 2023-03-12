package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secret;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        System.out.println("Игроки " + player1.getName() + " и "
                + player2.getName() + " начинают игру...");
        secret = 1 + (int) (Math.random() * 100);
        System.out.println("Компьютер загадал число в полуинтервале (0, 100]");
    }

    public void start() {
        do {
            inputNumber(player1);
            if (compareNumbers(player1)) break;
            inputNumber(player2);
        } while (!compareNumbers(player2));
    }

    private void inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ход игрока " + player.getName() + ": Введите число: ");
        player.setNumber(scanner.nextInt());
    }

    private boolean compareNumbers(Player player) {
        int number = player.getNumber();
        if (number == secret) {
            System.out.println("Вы угадали!!! Игрок " + player.getName() + " выиграл!");
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
}