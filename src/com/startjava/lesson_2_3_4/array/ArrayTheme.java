package com.startjava.lesson_2_3_4.array;

public class ArrayTheme {

    public static void main(String[] args) {
        System.out.println("#1. Реверс значений массива");
        int[] intArray = {7, 1, 4, 2, 6, 5, 3};
        System.out.print("Массив до изменения: ");
        printIntArray(intArray);
        for (int i = 0; i < intArray.length / 2; i++) {
            intArray[i] += intArray[intArray.length - 1 - i];
            intArray[intArray.length - 1 - i] = intArray[i] - intArray[intArray.length - 1 - i];
            intArray[i] -= intArray[intArray.length - 1 - i];
        }
        System.out.print("\nМассив после изменения: ");
        printIntArray(intArray);

        System.out.println("\n\n#2. Вывод произведения элементов массива");
        intArray = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = 1;
        for (int i = 1; i < intArray.length - 1; i++) {
            result *= intArray[i];
            System.out.print(intArray[i] + ((intArray[i] < intArray.length - 2) ? " * " : " = " + result));
        }
        System.out.print("\nЭлемент со значением " + intArray[0] + " находится под индексом: 0");
        System.out.print("\nЭлемент со значением " + intArray[9] + " находится под индексом: 9");

        System.out.println("\n\n#3. Удаление элементов массива");
        float[] floatArray = new float[15];
        for (int i = 0; i < floatArray.length; i++) {
            floatArray[i] = (float) Math.random();
        }
        int middleCellIndex = floatArray.length / 2;
        System.out.println("Исходный массив:");
        printFloatArray(floatArray, 0, middleCellIndex);
        printFloatArray(floatArray, 8, floatArray.length - 1);
        int zeroedCellsCount = 0;
        for (int i = 0; i < floatArray.length; i++) {
            if (floatArray[i] > floatArray[middleCellIndex]) {
                floatArray[i] = 0f;
                zeroedCellsCount++;
            }
        }
        System.out.println("Массив после удаления:");
        printFloatArray(floatArray, 0, middleCellIndex);
        printFloatArray(floatArray, 8, floatArray.length - 1);
        System.out.print("Количество обнуленных ячеек: " + zeroedCellsCount);

        System.out.println("\n\n#4. Вывод элементов массива лесенкой в обратном порядке");
        char[] charArray = new char[26];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (i + 65);
        }
        for (int i = 0; i < charArray.length; i++) {
            for (int j = charArray.length - 1; j >= charArray.length - 1 - i; j--) {
                System.out.print(charArray[j]);
            }
            System.out.println("");
        }

        System.out.println("\n#5. Генерация уникальных чисел");
        intArray = new int[30];
        int temp;
        for (int i = 0; i < intArray.length; i++) {
            do {
                temp = (int) (60 + Math.random() * 40);
            } while (checkNumber(intArray, temp));
            intArray[i] = temp;
        }
        sortArray(intArray);
        printIntArrayByTen(intArray);

        System.out.println("\n#6. Копирование не пустых строк");
        String[] stringArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int copyArraySize = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (!stringArray[i].isBlank()) {
                copyArraySize++;
            }
        }
        String[] copyArray = new String[copyArraySize];
        int sourcePointer = 0;
        int destPointer = 0;
        int stringsCount = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (!stringArray[i].isBlank()) {
                stringsCount++;
            }
            if (stringArray[i].isBlank() && (stringsCount != 0)) {
                sourcePointer = i - stringsCount;
                System.arraycopy(stringArray, sourcePointer, copyArray, destPointer, stringsCount);
                destPointer += stringsCount;
                stringsCount = 0;
            }
        }
        printStringArray(stringArray);
        printStringArray(copyArray);
    }

    private static void printIntArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
    }

    private static void printFloatArray(float[] array, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.printf("%8.3f", array[i]);
        }
        System.out.println("");
    }

    private static boolean checkNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }
        return false;
    }

    private static void sortArray(int[] array) {
        boolean isSwapped;
        do {
            isSwapped = false;
            for (int i = 0; i < array.length - 1; i++) {
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
        int printedNumbersCount = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%4d", array[i]);
            printedNumbersCount++;
            if (printedNumbersCount == 10) {
                printedNumbersCount = 0;
                System.out.println("");
            }
        }
    }

    private static void printStringArray(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print("'" + array[i] + "', ");
        }
        System.out.println("'" + array[array.length - 1] + "'");
    }
}