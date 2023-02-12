public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("#1. Перевод псевдокода на язык Java");
        int age = 31;
        if (age > 20) {
            System.out.println("Пора начинать работать");
        } else {
            System.out.println("Нужно еще поучиться");
        }
        boolean male = true;
        if (!male) {
            System.out.println("Возраст выхода на пенсию - 60 лет");
        } else {
            System.out.println("Возраст выхода на пенсию - 65 лет");
        }
        double height = 1.56;
        if (height < 1.80) {
            System.out.println("Можно попробовать стать космонавтом");
        } else {
            System.out.println("Лучше, наверное, стать баскетболистом");
        }
        char firstNameLetter = "Dariya".charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("Вполне возможно, что Вы - Michael\n");
        } else if (firstNameLetter == 'I') {
            System.out.println("Весьма вероятно, что Вы - Irina\n");
        } else {
            System.out.println("Очень много разных вариантов\n");
        }

        System.out.println("#2. Поиск max и min числа");
        int num1 = 2000;
        int num2 = 100;
        if (num1 > num2) {
            System.out.println("min = " + num2 + "\nmax = " + num1 + "\n");
        } else if (num1 < num2) {
            System.out.println("min = " + num1 + "\nmax = " + num2 + "\n");
        } else {
            System.out.println("Числа " + num1 + " и " + num2 + " равны\n");
        }

        System.out.println("#3. Проверка числа");
        int number = -10023;
        if (number != 0) {
            if (number % 2 == 0) {
                System.out.print("Число " + number + " является четным и ");
            } else {
                System.out.print("Число " + number + " является нечетным и ");
            }
            if (number > 0) {
                System.out.println("положительным\n");
            } else {
                System.out.println("отрицательным\n");
            }
        } else {
            System.out.println("Число равно " + number + "\n");
        }

        System.out.println("#4. Поиск одинаковых цифр в числах");
        int number1 = 123;
        int number2 = 223;
        int hundreds1 = number1 / 100;
        int hundreds2 = number2 / 100;
        int tens1 = (number1 % 100) / 10;
        int tens2 = (number2 % 100) / 10;
        int ones1 = number1 % 10;
        int ones2 = number2 % 10;
        if ((hundreds1 != hundreds2) && (tens1 != tens2) && (ones1 != ones2)) {
            System.out.println("Все цифры в разрядах разные\n");
        } else {
            System.out.println("Первое число = " + number1 + "\n" +
                    "Второе число = " + number2);
            if (hundreds1 == hundreds2) {
                System.out.println("Одинаковая цифра - " + hundreds1 + " в разряде сотен (2)");
            }
            if (tens1 == tens2) {
                System.out.println("Одинаковая цифра - " + tens1 + " в разряде десятков (1)");
            }
            if (ones1 == ones2) {
                System.out.println("Одинаковая цифра - " + ones1 + " в разряде единиц (0)\n");
            }
        }

        System.out.println("#5. Определение символа по его коду");
        char symbol = '\u0057';
        if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ " + symbol + " - это маленькая буква\n");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ " + symbol + " - это большая буква\n");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Символ " + symbol + " - это число\n");
        } else {
            System.out.println("Символ " + symbol + " - это не буква и не число\n");
        }

        System.out.println("#6. Подсчет суммы вклада и начисленных банком %");
        double deposit = 300_000;
        double interest = 10;
        if (deposit < 100_000) {
            interest = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            interest = 7;
        }
        System.out.println("Сумма вклада = " + deposit + "\n" + 
                "Начисленный % = " + (deposit / 100 * interest) + "\n" + 
                "Итоговая сумма с % = " + (deposit + (deposit / 100 * interest)) + "\n");

        System.out.println("#7. Определение оценки по предметам");
        int historyPercent = 59;
        int codingPercent = 91;
        int historyMark = 2;
        int codingMark = 2;
        if (historyPercent > 91) {
            historyMark = 5;
        } else if (historyPercent > 73) {
            historyMark = 4;
        } else if (historyPercent > 60) {
            historyMark = 3;
        }
        if (codingPercent > 91) {
            codingMark = 5;
        } else if (codingPercent > 73) {
            codingMark = 4;
        } else if (codingPercent > 60) {
            codingMark = 3;
        }
        double averagePercent = (double) (historyPercent + codingPercent) / 2;
        double averageMark = (double) (historyMark + codingMark) / 2;
        System.out.println("История - " + historyMark + "\n" +
                "Программирование - " + codingMark + "\n" +
                "Средний бал оценок по предметам - " + averageMark + "\n" +
                "Средний % по предметам - " + averagePercent + "\n");

        System.out.println("#8. Расчет прибыли за год");
        int rent = 5000;
        int income = 13000;
        int cost = 9000;
        int profit = (income - rent - cost) * 12;
        System.out.print("Прибыль за год: ");
        if (profit <= 0) {
            System.out.print(profit);
        } else {
            System.out.print("+" + profit);
        }
        System.out.println(" руб.\n");

        System.out.println("#9. Подсчет количества банкнот");
        int requiredSum = 567;
        int hundredsRequired = requiredSum / 100;
        int tensRequired = (requiredSum % 100) / 10;
        int onesRequired = (requiredSum % 100) % 10;
        int hundredsInAtm = 10;
        int tensInAtm = 5;
        int onesInAtm = 50;
        int total = 0;
        if (((hundredsInAtm * 100) + (tensInAtm * 10) + onesInAtm) < requiredSum) {
            System.out.println("В банкомате не достаточно купюр для выдачи суммы " + requiredSum + "\n");
        } else {
            if (hundredsInAtm >= hundredsRequired) {
                total += hundredsRequired * 100;
            } else {
                total += hundredsInAtm * 100;
                tensRequired += (hundredsRequired - hundredsInAtm) * 10;
                hundredsRequired = hundredsInAtm;
            }
            if (tensInAtm >= tensRequired) {
                total += tensRequired * 10;
            } else {
                total += tensInAtm * 10;
                onesRequired += (tensRequired - tensInAtm) * 10;
                tensRequired = tensInAtm;
            }
            total += onesRequired;

            System.out.println("Будет выдано:\n" +
                    hundredsRequired + " банкнот номиналом 100\n" + 
                    tensRequired + " банкнот номиналом 10\n" + 
                    onesRequired + " банкнот номиналом 1\n" + 
                    "Всего выдано на сумму " + total);
        }
    }
}