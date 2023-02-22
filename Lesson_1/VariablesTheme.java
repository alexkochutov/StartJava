public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("#1. Вывод значений переменных на консоль");
        byte coreCount = 4;
        short cpuRate = 3800;
        int memorySize = 32000;
        long diskSize = 250_000_000_000L;
        float screenSize = 15.6F;
        double cost = 150_000.50;
        boolean isOld = true;
        char cpuLogo = 'I';
        System.out.println("Количество ядер - " + coreCount + " ядра;\n" + 
                "Частота процессора - " + cpuRate + " Мегагерц;\n" + 
                "Размер оперативной памяти - " + memorySize + " Мегабайт;\n" +
                "Размер диска -" + diskSize + " Байт;\n" +
                "Диагональ экрана -" + screenSize + " дюймов;\n" +
                "Стоимость - " + cost + " рублей;\n" +
                "Последняя модель -" + isOld + ";\n" +
                "Логотип процессора - " + cpuLogo + ";\n");

        System.out.println("#2. Расчет стоимости товара со скидкой");
        int penCost = 100;
        int bookCost = 200;
        int costGoods = penCost + bookCost;
        double discont = (costGoods / 100) * 11;
        double discountCost = costGoods - discont;
        System.out.println("Общая стоимость товаров без скидки = " + costGoods + "\n" +
                "Сумма скидки = " + discont + "\n" +
                "Общая стоимость товаров со скидкой = " + discountCost + "\n");

        System.out.println("#3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a\n" +
                "   J   a a  v   v  a a\n" +
                "J  J  aaaaa  V V  aaaaa\n" +
                " JJ  a     a  V  a     a\n");

        System.out.println("#4. Вывод min и max значений целых числовых типов");
        byte byteMax = 127;
        short shortMax = 32767;
        int intMax = 2_147_483_647;
        long longMax = 9_223_372_036_854_775_807L;
        System.out.println(byteMax + "\n" + ++byteMax + "\n" + --byteMax + "\n" +
                shortMax + "\n" + ++shortMax + "\n" + --shortMax + "\n" +
                intMax + "\n" + ++intMax + "\n" + --intMax + "\n" +
                longMax + "\n" + ++longMax + "\n" + --longMax + "\n");

        System.out.println("#5. Перестановка значений переменных");
        int number1 = 2;
        int number2 = 5;
        int buffer = number1;
        System.out.println("С помощью третьей переменной:\n" + 
                "до перестановки number1 = " + number1 + " и number2 = " + number2);
        number1 = number2;
        number2 = buffer;
        System.out.println("после перестановки number1 = " + number1 + " и number2 = " + number2 + "\n" +
                "С помощью арифметических операций:\n" + 
                "до перестановки number1 = " + number1 + " и number2 = " + number2);
        number2 += number1;
        number1 = number2 - number1;
        number2 -= number1;
        System.out.println("после перестановки number1 = " + number1 + " и number2 = " + number2 + "\n" +
                "С помощью побитовой операции:\n" + 
                "до перестановки number1 = " + number1 + " и number2 = " + number2);
        number1 ^= number2;
        number2 ^= number1;
        number1 ^= number2;
        System.out.println("после перестановки number1 = " + number1 + " и number2 = " + number2 + "\n");

        System.out.println("#6. Вывод символов и их кодов");
        char hash = '#';
        char and = '&';
        char at = '@';
        char caret = '^';
        char underline = '_';
        System.out.println((int) hash + " - " + hash + "\n" +
                (int) and + " - " + and + "\n" +
                (int) at + " - " + at + "\n" +
                (int) caret + " - " + caret + "\n" +
                (int) underline + " - " + underline + "\n");

        System.out.println("#7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char underscore = '_';
        char openedBracket = '(';
        char closedBracket = ')';
        System.out.println("    " + slash + backSlash + "\n" +
                "   " + slash + "  " + backSlash + "\n" +
                "  " + slash + underscore + openedBracket + " " + closedBracket + backSlash + "\n" +
                " " + slash + "      " + backSlash + "\n" +
                slash + underscore + underscore + underscore + underscore + slash + backSlash +
                underscore + underscore + backSlash + "\n");

        System.out.println("#8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int ones = number % 10;
        System.out.println("Число " + number + " содержит\n" +
                hundreds + " сотен\n" +
                tens + " десятков\n" +
                ones + " единиц\n" +
                "Сумма цифр = " + (hundreds + tens + ones) + "\n" +
                "Произведение = " + hundreds * tens * ones + "\n");

        System.out.println("#9. Вывод времени");
        int time = 86399;
        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}