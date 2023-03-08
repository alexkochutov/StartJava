package com.startjava.lesson_1.result;

public class MyFirstGame {

    public static void main(String[] args) {
        int rangeBegin = 1;
        int rangeEnd  = 100;
        int secretNumber = 76;
        int guessNumber;
        do {
            guessNumber = (rangeBegin + rangeEnd) / 2;
            if (guessNumber < secretNumber){
                System.out.println("Число " + guessNumber + " меньше того, что загадал компьютер.");
                rangeBegin = guessNumber;
            } else if (guessNumber > secretNumber) {
                System.out.println("Число " + guessNumber + " больше того, что загадал компьютер.");
                rangeEnd = guessNumber;
            }
        } while (guessNumber != secretNumber);
        System.out.println("Вы победили!");
    }
}