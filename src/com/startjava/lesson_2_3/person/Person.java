package com.startjava.lesson_2_3.person;

public class Person {

    String gender = "male";
    String name = "Vasya";
    int height = 188;
    float weight = 82.5F;
    int age = 30;

    void go() {
        System.out.println(name + " идет");
    }

    void sit() {
        System.out.println(name + " сидит");
    }

    void run() {
        System.out.println(name + " бежит");
    }

    void talk() {
        System.out.println(name + " говорит");
    }

    void learnJava() {
        System.out.println(name + " изучает Java");
    }
}