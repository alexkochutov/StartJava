public class WolfTest {

    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        wolf1.gender = "Самец";
        wolf1.name = "Акела";
        wolf1.weight = 38.2F;
        wolf1.age = 4;
        wolf1.color = "Серый";

        System.out.println("Пол - " + wolf1.gender + "\n"
                + "Имя - " + wolf1.name + "\n"
                + "Вес - " + wolf1.weight + "\n"
                + "Возраст - " + wolf1.age + "\n"
                + "Окрас - " + wolf1.color + "\n");

        wolf1.go();
        wolf1.sit();
        wolf1.run();
        wolf1.howl();
        wolf1.hunt();
    }
}