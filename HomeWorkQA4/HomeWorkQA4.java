import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkQA4 {
    public static void main(String[] args) {
//         unicodeTask1();
//        getSum(4.5554);
//        System.out.println(cubeOfNumber(80));
//        System.out.println(add(5, 5));
//        System.out.println(subtract(5,5));
//        System.out.println(multiply(5,5));
//        System.out.println(divide(5,-1));
    }

    //Task 1
    static public void unicodeTask1() {
        char[] array = {8364, 8682, 10141};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // Task 2
    public static int getSum(int a) {
        return a;
    }

    public static int getSum(int a, int b) {
        return a + b;
    }

    public static double getSum(double a, double b) {
        return a + b;
    }

    public static double getSum(double a) {
        return a;
    }

    public static String getSum(String a) {
        return a;
    }


    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    public static int[] getSum(int... a) {
        int[] array = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            array[i] = a[i];
        }
        return array;
    }

    public static int getSum() {
        return 13;
    }

    //Task 3
    public static int cubeOfNumber(int number) {
        return number * number * number;
    }

    // Task 4
    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}