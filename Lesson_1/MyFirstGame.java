public class MyFirstGame {

    public static void main(String[] args) {
        int intervalBegin = 1;
        int intervalEnd  = 100;
        int secretNumber = 76;
        boolean isGuessed = false;
        while (!isGuessed) {
            int guessNumber = (intervalBegin + intervalEnd) / 2;
            if (guessNumber == secretNumber) {
                isGuessed = true;
                System.out.println("Вы победили!");
            } else if (guessNumber < secretNumber){
                System.out.println("Число " + guessNumber + " меньше того, что загадал компьютер.");
                intervalBegin = guessNumber;
            } else {
                System.out.println("Число " + guessNumber + " больше того, что загадал компьютер.");
                intervalEnd = guessNumber;
            }
        }
    }
}