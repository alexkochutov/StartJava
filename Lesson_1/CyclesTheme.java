public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("#1. Подсчет суммы четных и нечетных чисел");
        int sumOdd = 0;     // Сумма нечетных чисел
        int sumEven = 0;    // Сумма четных чисел
        int counter = -10;
        do {
            if (counter % 2 == 0) sumEven += counter;
            else sumOdd += counter;
            counter++;
        } while (counter <= 21);
        System.out.println("в промежутке [-10, 21] сумма четных чисел = " + sumEven +
                ", а нечетных = " + sumOdd);

        System.out.println("\n#2. Вывод чисел в интервале (min и max) в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;
        int min = num1;
        int max = num1;
        if (num2 < min) min = num2;
        if (num2 > max) max = num2;
        if (num3 < min) min = num3;
        if (num3 > max) max = num3;
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n#3. Вывод реверсивного числа и суммы его цифр");
        int num = 1234;
        int reverse = 0;
        int sum = 0;
        while (num > 0) {
            reverse = (reverse * 10) + (num % 10);
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Исходное число в обратном порядке - " + reverse + "\n" + 
                "Сумма цифр - " + sum);

        System.out.println("\n#4. Вывод чисел на консоль в несколько строк");
        int stringSize = 0;
        for (int i = 1; i < 24; i += 2) {
            System.out.printf("%4d", i);
            stringSize++;
            if (stringSize == 5) {
                System.out.println();
                stringSize = 0;
            }
        }
        if (stringSize != 0 && stringSize < 5) {
            for (int i = 1; i <= 5 - stringSize; i++) {
                System.out.printf("%4d", 0);
            }
        }

        System.out.println("\n\n#5. Проверка количества двоек на четность/нечетность");
        num = 3242592;
        int temp = num;
        int divider = 1000000;
        int result = 0;
        int count = 0;
        while (divider > 0) {
            result = temp / divider;
            if (result == 2) {
                count++;
            }
            temp -= result * divider;
            divider /= 10;
        }
        System.out.print("Число " + num + " содержит " + count);
        if (count % 2 == 0) {
            System.out.print(" четное ");
        } else {
            System.out.print(" нечетное ");
        }
        System.out.println("количество двоек\n");

        System.out.println("#6. Отображение фигур в консоли");
        // Drawing the rectangle
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        // Drawing the first triangle
        int i = 0;
        int j = 0;
        int length = 5;
        while (i < 5) {
            while (j < length) {
                System.out.print("#");
                j++;
            }
            System.out.println();
            length--;
            j = 0;
            i++;
        }
        System.out.println();
        // Drawing the second triangle
        i = 0;
        length = 0;
        boolean stop = false;
        do {
            i++;
            j = 0;
            if (stop) {
                length--;
            } else {
                length++;
            if (length == 3) {
                    stop = true;
                }
            }
            do {
                j++;
                System.out.print("$");
            } while (j < length);
            System.out.println();
        } while (i < 5);

        System.out.println("\n#7. Отображение ASCII-символов");
        System.out.printf("%6s%6s%n", "Dec", "Char");
        for (i = 32; i < 48; i++) {
            if (i % 2 != 0) {
                System.out.printf("%6d%6s%n", i, (char) i);
            }
        }
        for (i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%6d%6s%n", i, (char) i);
            }
        }

        System.out.println("\n#8. Проверка, является ли число палиндромом");
        num = 1234321;
        temp = num;
        divider = 1000000;
        int multiplier = 1;
        result = 0;
        while (divider > 0) {
            result += (temp / divider) * multiplier;
            temp -= (temp / divider) * divider;
            divider /= 10;
            multiplier *= 10;
        }
        System.out.print("Число " + num);
        if (num == result) {
            System.out.print(" является");
        } else {
            System.out.print(" не является");
        }
        System.out.println(" палиндромом\n");

        System.out.println("#9. Определение, является ли число счастливым");
        num = 323404;
        int firstHalf = num / 1000;
        int secondHalf = num % 1000;
        int temp1 = firstHalf;
        int temp2 = secondHalf;
        int sum1 = 0;
        int sum2 = 0;
        divider = 100;
        while (divider > 0) {
            sum1 += temp1 / divider;
            temp1 -= (temp1 / divider) * divider;
            divider /= 10;
        }
        divider = 100;
        while (divider > 0) {
            sum2 += temp2 / divider;
            temp2 -= (temp2 / divider) * divider;
            divider /= 10;
        }
        System.out.print("Сумма цифр числа " + firstHalf + " = " + sum1 + "\n" + 
                "Сумма цифр числа " + secondHalf + " = " + sum2 + "\n" +
                "Число " + num);
        if (sum1 == sum2) {
            System.out.print(" является");
        } else {
            System.out.print(" не является");
        }
        System.out.println(" счастливым\n");

        System.out.println("#10. Вывод таблицы умножения Пифагора");
        System.out.printf("%4s|%4d%4d%4d%4d%4d%4d%4d%4d%n", " ", 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("----+--------------------------------");
        for (i = 2; i <10; i++){
            System.out.printf("%4d|", i);
            for (j = 2; j < 10; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.printf("%n");
        }
    }
}