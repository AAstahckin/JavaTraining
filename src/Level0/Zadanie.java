package Level0;

import java.util.Scanner;

public class Zadanie {
    public static void main (String[] args) {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input a: ");
            int number1 = in.nextInt();
            test02(number1);
            System.out.println("Давай попробуем ещё!");
        }
//        Scanner in = new Scanner(System.in);
//        System.out.println("Input a: ");
//        int number1 = in.nextInt();
//        System.out.println("Input b: ");
//        int number2 = in.nextInt();
//        System.out.println("Input c: ");
//        int number3 = in.nextInt();
//        System.out.println("Ваше уравнение: " + number1 + "*x*x + " + number2 + "*x + " + number3 + " = 0");
//        test1(number1, number2, number3);
    }

    public static int test1 (int a, int b, int c) {
        double x1, x2;
        double sqrt_d;
        int d = b * b - 4 * a * c;
        sqrt_d = Math.sqrt(d);
        if (d > 0) {
            x1 = (-b + sqrt_d) / (2 * a);
            x2 = (-b - sqrt_d) / (2 * a);

            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
        else if (d < 0) {
            System.out.println("Нет корней!");
        }
        else if (d == 0) {
            x1 = (-b + sqrt_d) / (2 * a);
            System.out.println("x1 = x2: " + x1);
        }


        return 0;
    }

    public static int test02 (int number) {
        int a = number / 10000;
        int b = (number % 10000) / 1000;
        int d = (number % 100) / 10;
        int e = number % 10;

        if (a == e && b == d)
            System.out.println(number + " Ваше число является палиндром!");
        else
            System.out.println(number + " Ваше число НЕ является палиндром!");
        return 0;
    }

}
