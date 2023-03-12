package com.startjava.lesson_2_3_4.animal;

public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.setGender("Самец");
        wolf1.setName("Акела");
        wolf1.setWeight(38.2F);
        wolf1.setAge(4);
        wolf1.setColor("Серый");

        System.out.println("Пол - " + wolf1.getGender() + "\n"
                + "Имя - " + wolf1.getName() + "\n"
                + "Вес - " + wolf1.getWeight() + "\n"
                + "Возраст - " + wolf1.getAge() + "\n"
                + "Окрас - " + wolf1.getColor() + "\n");

        wolf1.go();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}