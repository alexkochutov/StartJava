package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("#1. Реверс значений массива");
        int[] intArray = {7, 1, 4, 2, 6, 5, 3};
        System.out.print("Массив до изменения: ");
        printIntArray(intArray);
        int length = intArray.length - 1;
        for (int i = 0; i <= length / 2; i++, length--) {
            int buffer = intArray[i];
            intArray[i] = intArray[length];
            intArray[length] = buffer;
        }
        System.out.print("\nМассив после изменения: ");
        printIntArray(intArray);

        System.out.println("\n\n#2. Вывод произведения элементов массива");
        intArray = new int[10];
        length = intArray.length;
        for (int i = 0; i < length; i++) {
            intArray[i] = i;
        }
        int result = 1;
        for (int i = 1; i < length - 1; i++) {
            result *= intArray[i];
            System.out.print(intArray[i] + ((i < length - 2) ? " * " : " = " + result));
        }
        System.out.print("\nЭлемент со значением " + intArray[0] + " находится под индексом: 0");
        System.out.print("\nЭлемент со значением " + intArray[9] + " находится под индексом: 9");

        System.out.println("\n\n#3. Удаление элементов массива");
        float[] floatArray = new float[15];
        length = floatArray.length;
        for (int i = 0; i < length; i++) {
            floatArray[i] = (float) Math.random();
        }
        float middleCellNumber = floatArray[length / 2];
        System.out.println("Исходный массив:");
        printFloatArray(floatArray);
        int zeroedCellsCount = 0;
        for (int i = 0; i < length; i++) {
            if (floatArray[i] > middleCellNumber) {
                floatArray[i] = 0f;
                zeroedCellsCount++;
            }
        }
        System.out.println("Массив после удаления:");
        printFloatArray(floatArray);
        System.out.print("Количество обнуленных ячеек: " + zeroedCellsCount);

        System.out.println("\n\n#4. Вывод элементов массива лесенкой в обратном порядке");
        char[] alphabet = new char[26];
        length = alphabet.length;
        for (int i = 0; i < length; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for (int i = 0; i < length; i++) {
            for (int j = length - 1; j >= length - 1 - i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n#5. Генерация уникальных чисел");
        intArray = new int[30];
        length = intArray.length;
        for (int i = 0; i < length; i++) {
            int randomNum;
            do {
                randomNum = (int) (60 + Math.random() * 40);
            } while (!isUnique(intArray, randomNum));
            intArray[i] = randomNum;
        }
        sortArray(intArray);
        printIntArrayByTen(intArray);

        System.out.println("\n#6. Копирование не пустых строк");
        String[] srcStrings = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        length = srcStrings.length;
        int countNotBlankStrings = 0;
        for (String string : srcStrings) {
            if (!string.isBlank()) {
                countNotBlankStrings++;
            }
        }
        String[] destStrings = new String[countNotBlankStrings];
        int sourcePointer = 0;
        int destPointer = 0;
        int stringsCount = 0;
        for (int i = 0; i < length; i++) {
            if (srcStrings[i].isBlank()) {
                if ((stringsCount != 0)) {
                    sourcePointer = i - stringsCount;
                    System.arraycopy(srcStrings, sourcePointer, destStrings, destPointer, stringsCount);
                    destPointer += stringsCount;
                    stringsCount = 0;
                }
            } else {
                stringsCount++;
            }
        }
        printStringArray(srcStrings);
        printStringArray(destStrings);
    }

    private static void printIntArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
    }

    private static void printFloatArray(float[] array) {
        int length = array.length;
        for (int i = 0; i < length; i++) {
            System.out.printf("%8.3f", array[i]);
            if (i == length / 2) {
                System.out.println();
            }
        }
        System.out.println();
    }

    private static boolean isUnique(int[] array, int number) {
        for (int item : array) {
            if (item == number) {
                return false;
            }
        }
        return true;
    }

    private static void sortArray(int[] array) {
        int length = array.length;
        boolean isSwapped;
        do {
            isSwapped = false;
            for (int i = 0; i < length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    array[i] += array[i + 1];
                    array[i + 1] = array[i] - array[i + 1];
                    array[i] -= array[i + 1];
                    isSwapped = true;
                }
            }
        } while (isSwapped);
    }

    private static void printIntArrayByTen(int[] array) {
        int length = array.length;
        int printedNumbersCount = 0;
        for (int i = 0; i < length; i++) {
            System.out.printf("%4d", array[i]);
            printedNumbersCount++;
            if (printedNumbersCount == 10) {
                printedNumbersCount = 0;
                System.out.println("");
            }
        }
    }

    private static void printStringArray(String[] array) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            System.out.print("'" + array[i] + "', ");
        }
        System.out.println("'" + array[length - 1] + "'");
    }
}