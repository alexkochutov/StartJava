package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public final static int CAPACITY = 10;

    private String name;
    private int countAttempts;
    private int[] answers = new int[CAPACITY];
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCountAttempts() {
        return countAttempts;
    }

    public int getAnswer() {
        return answers[countAttempts - 1];
    }

    public int[] getAllAnswers() {
        return Arrays.copyOf(answers, countAttempts);
    }

    public void addAnswer(int number) {
        if ((number <= 0) || (number > 100)) {
            throw new IllegalArgumentException("Введенное число не входит в полуинтервал (0, 100]");
        }
        answers[countAttempts] = number;
        countAttempts++;
    }

    public int getScore() {
        return score;
    }

    public void increaseScore() {
        score++;
    }

    public void clear() {
        Arrays.fill(answers, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public boolean checkAttempts() {
        return countAttempts < CAPACITY;
    }
}