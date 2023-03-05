public class JaegerTest {

    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setName("Coyote Tango");
        jaeger1.setMark("Mark-1[");
        jaeger1.setOrigin("Japan");
        jaeger1.setHeight(280f);
        jaeger1.setWeight(2.312f);
        jaeger1.setSpeed(5);
        jaeger1.setStrength(7);
        jaeger1.setArmor(4);
        jaeger1.setWeapon("Ballistic mortar cannons V-PI EnergyCaster");

        Jaeger jaeger2 = new Jaeger("Gipsy Danger", "Mark-3", "United States of America",
                260f, 1.980f, 7, 8, 6, "I-19 Plasmacaster (Plasma Cannon)");

        System.out.println("Jaeger #1 has next properties: \n"
                + "Name - " + jaeger1.getName() + "\n"
                + "Mark - " + jaeger1.getMark() + "\n"
                + "Origin - " + jaeger1.getOrigin() + "\n"
                + "Height - " + jaeger1.getHeight() + "\n"
                + "Weight - " + jaeger1.getWeight() + "\n"
                + "Speed - " + jaeger1.getSpeed() + "\n"
                + "Strength - " + jaeger1.getStrength() + "\n"
                + "Armor - " + jaeger1.getArmor() + "\n"
                + "Weapon - " + jaeger1.getWeapon() + "\n");
        jaeger1.move();
        jaeger1.useWeapon();

        System.out.println("Jaeger #2 has next properties: \n"
                + "Name - " + jaeger2.getName() + "\n"
                + "Mark - " + jaeger2.getMark() + "\n"
                + "Origin - " + jaeger2.getOrigin() + "\n"
                + "Height - " + jaeger2.getHeight() + "\n"
                + "Weight - " + jaeger2.getWeight() + "\n"
                + "Speed - " + jaeger2.getSpeed() + "\n"
                + "Strength - " + jaeger2.getStrength() + "\n"
                + "Armor - " + jaeger2.getArmor() + "\n"
                + "Weapon - " + jaeger2.getWeapon() + "\n");
        jaeger2.move();
        jaeger2.useWeapon();
    }
}