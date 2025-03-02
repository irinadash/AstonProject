//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        isSumInBetween();
        printSign(5);
        isNegative(-1);
        printStringMultipleTimes("banana", 5);
        isLeap(2000);
        arrayReplace();
        //fillingArr();
        multiplyArr();

    }


    public static void printThreeWords() {
        System.out.println("Задание 1:");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        System.out.println("Задание 2:");
        int a = 5;
        int b = -10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        System.out.println("Задание 3:");
        int value = 150;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        System.out.println("Задание 4:");

        int a = 5;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void isSumInBetween() {
        System.out.println("Задание 5:");
        int a = 9;
        int b = 1;
        int c = a + b;
        System.out.println(c >= 10 && c <= 20);
    }

    public static void printSign(int number) {
        System.out.println("Задание 6:");
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int number) {
        System.out.println("Задание 7:");
        System.out.println(number < 0);
        return false;
    }

    public static void printStringMultipleTimes(String str, int times) {
        System.out.println("Задание 8:");
        for (int i = 0; i < times; i++) {
            System.out.print(str + " ");
        }
    }

    public static boolean isLeap(int year) {
        System.out.println(" ");
        System.out.println("Задание 9:");
        System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
        return false;
    }

    public static void arrayReplace() {
        System.out.println("Задание 10:");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
            System.out.print(arr[i]);
        }
    }

    public static void fillingArr() {
        System.out.println("Задание 11:");
        int[] arr = new int[100];
        for (int i = 1; i <= 101; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }

    public static void multiplyArr() {
        System.out.println("Задание 12:");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i]);
        }
    }
}