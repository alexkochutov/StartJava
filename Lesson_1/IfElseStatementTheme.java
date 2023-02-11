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
            System.out.println("Число " + number + " равно нулю\n");
        }

        System.out.println("#4. Поиск одинаковых цифр в числах");
        int number1 = 123;
        int number2 = 223;
        int hundreds1 = number1 / 100;
        int hundreds2 = number2 / 100;
        int dozens1 = (number1 % 100) / 10;
        int dozens2 = (number2 % 100) / 10;
        int units1 = (number1 % 100) % 10;
        int units2 = (number2 % 100) % 10;
        if ((hundreds1 != hundreds2) && (dozens1 != dozens2) && (units1 != units2)) {
            System.out.println("Все цифры в разрядах разные\n");
        } else {
            System.out.println("Первое число = " + number1 + "\n" +
                    "Второе число = " + number2);
            if (hundreds1 == hundreds2) {
                System.out.println("Одинаковая цифра - " + hundreds1 + " в разряде сотен (2)");
            }
            if (dozens1 == dozens2) {
                System.out.println("Одинаковая цифра - " + dozens1 + " в разряде десятков (1)");
            }
            if (units1 == units2) {
                System.out.println("Одинаковая цифра - " + units1 + " в разряде единиц (0)\n");
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
        double interest;
        if (deposit < 100_000) {
            interest = 5;
        } else if (deposit >= 100_000 && deposit <= 300_000) {
            interest = 7;
        } else {
            interest = 10;
        }
        System.out.println("Сумма вклада = " + deposit + "\n" + 
                "Начисленный % = " + (deposit / 100 * interest) + "\n" + 
                "Итоговая сумма с % = " + (deposit + (deposit / 100 * interest)) + "\n");

        System.out.println("#7. Определение оценки по предметам");
        int historyRate = 59;
        int codingRate = 92;
        int historyMark;
        int codingMark;
        double averageRate;
        double averageMark;
        if (historyRate > 91) {
            historyMark = 5;
        } else if (historyRate > 73) {
            historyMark = 4;
        } else if (historyRate > 60) {
            historyMark = 3;
        } else {
            historyMark = 2;
        }
        if (codingRate > 91) {
            codingMark = 5;
        } else if (codingRate > 73) {
            codingMark = 4;
        } else if (codingRate > 60) {
            codingMark = 3;
        } else {
            codingMark = 2;
        }
        averageRate = (double) (historyRate + codingRate) / 2;
        averageMark = (double) (historyMark + codingMark) / 2;
        System.out.println("История - " + historyMark + "\n" +
                "Программирование - " + codingMark + "\n" +
                "Средний бал оценок по предметам - " + averageMark + "\n" +
                "Средний % по предметам - " + averageRate + "\n");

        System.out.println("#8. Расчет прибыли за год");
        int rent = 5000;
        int income = 13000;
        int cost = 9000;
        int profit = income - rent - cost;
        System.out.print("Прибыль за год: ");
        if (profit < 0) {
            System.out.print(profit);
        } else {
            System.out.print("+" + profit);
        }
        System.out.println(" руб.\n");

        System.out.println("#9. Подсчет количества банкнот");
        int requiredSum = 567;
        int hundredsRequired = requiredSum / 100;
        int dozensRequired = (requiredSum % 100) / 10;
        int unitsRequired = (requiredSum % 100) % 10;
        int hundredsInAtm = 10;
        int dozensInAtm = 5;
        int unitsInAtm = 50;
        int total = 0;
        if (((hundredsInAtm * 100) + (dozensInAtm * 10) + unitsInAtm) < requiredSum) {
            System.out.println("В банкомате не достаточно купюр для выдачи суммы " + requiredSum + "\n");
        } else {
            System.out.println("Будет выдано:");
            if (hundredsInAtm >= hundredsRequired) {
                total += hundredsRequired * 100;
                System.out.println(hundredsRequired + " банкнот номиналом 100");
            } else {
                System.out.println(hundredsInAtm + " банкнот номиналом 100");
                total += hundredsInAtm * 100;
                dozensRequired += (hundredsRequired - hundredsInAtm) * 10;
            }
            if (dozensInAtm >= dozensRequired) {
                total += dozensRequired * 10;
                System.out.println(dozensRequired + " банкнот номиналом 10");
            } else {
                System.out.println(dozensInAtm + " банкнот номиналом 10");
                total += dozensInAtm * 10;
                unitsRequired += (dozensRequired - dozensInAtm) * 10;
            }
            total += unitsRequired;
            System.out.println(unitsRequired + " банкнот номиналом 1\n" + 
                    "Всего выдано на сумму " + total);
        }
    }
}