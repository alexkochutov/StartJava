package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int capacity = 10;

    private String name;
    private int attemptCount;
    private int[] answers = new int[capacity];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public void addAnswer(int number) {
        answers[attemptCount] = number;
        attemptCount++;
    }

    public int getAnswer() {
        return answers[attemptCount - 1];
    }

    public int[] getAllAnswers() {
        return Arrays.copyOf(answers, attemptCount);
    }

    public void clearAnswers() {
        Arrays.fill(answers, 0, attemptCount, 0);
        attemptCount = 0;
    }

    public boolean checkAttempts() {
        return getAttemptCount() < capacity;
    }
}