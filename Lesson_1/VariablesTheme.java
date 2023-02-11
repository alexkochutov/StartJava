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
        System.out.println("Количетво ядер - " + coreCount + " ядра;\n" + 
                "Частота процессора - " + cpuRate + " МегаГерц;\n" + 
                "Размер оперативной памяти - " + memorySize + " МегаБайт;\n" +
                "Размер диска -" + diskSize + " Байт;\n" +
                "Диагональ экрана -" + screenSize + " дюймов;\n" +
                "Стоимость - " + cost + " рублей;\n" +
                "Последняя модель -" + isOld + ";\n" +
                "Логотип процессора - " + cpuLogo + ";\n");

        System.out.println("#2. Расчет стоимости товара со скидкой");
        int penCost = 100;
        int bookCost = 200;
        int summaryCost = penCost + bookCost;
        double discont = (summaryCost / 100) * 11;
        double total = summaryCost - discont;
        System.out.println("Общая стоимость товаров без скидки = " + summaryCost + "\n" +
                "Сумма скидки = " + discont + "\n" +
                "Общая стоимость товаров со скидкой = " + total + "\n");

        System.out.println("#3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a\n" +
                "   J   a a  v   v  a a\n" +
                "J  J  aaaaa  V V  aaaaa\n" +
                " JJ  a     a  V  a     a\n");

        System.out.println("#4. Вывод min и max значений целых числовых типов");
        byte byteVar = 127;
        short shortVar = 32767;
        int intVar = 2_147_483_647;
        long longVar = 9_223_372_036_854_775_807L;
        System.out.println(byteVar + "\n" + ++byteVar + "\n" + --byteVar + "\n" +
                shortVar + "\n" + ++shortVar + "\n" + --shortVar + "\n" +
                intVar + "\n" + ++intVar + "\n" + --intVar + "\n" +
                longVar + "\n" + ++longVar + "\n" + --longVar + "\n");

        System.out.println("#5. Перестановка значений переменных");
        int firstNumber = 2;
        int secondNumber = 5;
        int buffer = 0;
        System.out.println("С помощью третьей переменной:\n" + 
                "до перестановки firstNumber = " + firstNumber + " и secondNumber = " + secondNumber);
        buffer = firstNumber;
        firstNumber = secondNumber;
        secondNumber = buffer;
        System.out.println("после перестановки firstNumber = " + firstNumber + " и secondNumber = " + secondNumber + "\n" +
                "С помощью арифметических операций:\n" + 
                "до перестановки firstNumber = " + firstNumber + " и secondNumber = " + secondNumber);
        secondNumber = secondNumber + firstNumber;
        firstNumber = secondNumber - firstNumber;
        secondNumber = secondNumber - firstNumber;
        System.out.println("после перестановки firstNumber = " + firstNumber + " и secondNumber = " + secondNumber + "\n" +
                "С помощью побитовой операции:\n" + 
                "до перестановки firstNumber = " + firstNumber + " и secondNumber = " + secondNumber);
        firstNumber = firstNumber ^ secondNumber;
        secondNumber = secondNumber ^ firstNumber;
        firstNumber = firstNumber ^ secondNumber;
        System.out.println("после перестановки firstNumber = " + firstNumber + " и secondNumber = " + secondNumber + "\n");

        System.out.println("#6. Вывод символов и их кодов");
        char hash = '#';
        char and = '&';
        char at = '@';
        char caret = '^';
        char under = '_';
        System.out.println((int)hash + " - " + hash + "\n" +
                (int) and + " - " + and + "\n" +
                (int) at + " - " + at + "\n" +
                (int) caret + " - " + caret + "\n" +
                (int) under + " - " + under + "\n");

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
                slash + underscore + underscore + underscore + underscore + slash + backSlash + underscore + underscore + backSlash + "\n");

        System.out.println("#8. Вывод количества сотен, десятков и единиц числа");
        int number = 123;
        int hundreds = number / 100;
        int dozens = (number % 100) / 10;
        int units = (number % 100) % 10;
        System.out.println("Число " + number + " содержит\n" +
                hundreds + " сотен\n" +
                dozens + " десятков\n" +
                units + " единиц\n" +
                "Сумма цифр = " + (hundreds + dozens + units) + "\n" +
                "Произведение = " + hundreds * dozens * units + "\n");

        System.out.println("#9. Вывод времени");
        int time = 86399;
        int hours = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = (time % 3600) % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}