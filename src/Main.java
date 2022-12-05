import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        task1_2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1_2() {
        System.out.println("Задача 1, 2");
        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print(integers[i]);
            if (i < integers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] doubles = {1.57, 7.654, 9.986};
        for (int j = 0; j < 3; j++) {
            System.out.print(doubles[j]);
            if (j < doubles.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        char[] chars = {'a', 'b', 'c', 'd'};
        for (int k = 0; k < 4; k++) {
            System.out.print(chars[k]);
            if (k < chars.length - 1) {
                System.out.print(", ");
            }
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        for (int i = 2; i >= 0; i--) {
            System.out.print(integers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] doubles = {1.57, 7.654, 9.986};
        for (int j = 2; j >= 0; j--) {
            System.out.print(doubles[j]);
            if (j > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        char[] chars = {'a', 'b', 'c', 'd'};
        for (int k = 3; k >= 0; k--) {
            System.out.print(chars[k]);
            if (k > 0) {
                System.out.print(", ");
            }
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] integers = new int[3];
        integers[0] = 1;
        integers[1] = 2;
        integers[2] = 3;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 != 0) {
                integers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(integers));
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task5() {
        System.out.println("Задача 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task6() {
        System.out.println("Задача 2");
        int[] arr = generateRandomArray();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Mаксимальная сумма трат за день составила " + max + " рублей ");
    }

    public static void task7() {
        System.out.println("Задача 3");
        int[] arr = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / arr.length + " рублей");
    }

    public static void task8() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = 10; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}