package ru.geekbrains.islyamov.artjom;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(15, 12);
        printColor(100);
        compareNumbers(12, 8);
    }
    public static void printThreeWords() {
        System.out.println("ORANGE");
        System.out.println("BANANA");
        System.out.println("APPLE");
    }
    public static void checkSumSign(int a, int b) {
//        int a = 8; int b = 10;инициализировать можно как в теле метода так и за пределами тела метода

        if ((a + b) >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }

    }
}
