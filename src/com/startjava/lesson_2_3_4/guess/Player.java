package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int CAPACITY = 10;

    private String name;
    private int countAttempts;
    private int[] answers = new int[CAPACITY];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCountAttempt() {
        return countAttempts;
    }

    public void addAnswer(int number) {
        answers[countAttempts] = number;
        countAttempts++;
    }

    public int getAnswer() {
        return answers[countAttempts - 1];
    }

    public int[] getAllAnswers() {
        return Arrays.copyOf(answers, countAttempts);
    }

    public void clearAnswers() {
        Arrays.fill(answers, 0, countAttempts, 0);
        countAttempts = 0;
    }

    public boolean checkAttempts() {
        return countAttempts < CAPACITY;
    }
}