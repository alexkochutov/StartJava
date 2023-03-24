package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {
    public static final int ATTEMPT_LIMIT = 10;

    private String name;
    private int attemptCount = 0;
    private int[] answers = new int[ATTEMPT_LIMIT];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttemptCount() {
        return attemptCount;
    }

    public void setAnswer(int number) {
        answers[attemptCount] = number;
        ++attemptCount;
    }

    public int getAnswer() {
        return answers[getAttemptCount() - 1];
    }

    public int[] getAllAnswers() {
        return Arrays.copyOf(answers, getAttemptCount());
    }

    public void clearAnswers() {
        Arrays.fill(answers, 0, getAttemptCount() - 1, 0);
        attemptCount = 0;
    }
}