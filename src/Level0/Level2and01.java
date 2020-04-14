package Level0;

import java.util.Scanner;

public class Level2and01 {
    public static void main (String[] args) {
//        String name = "Лёша";
//        String surname = "Асташкин";
//        String name1 = "Катя";
//        String surname1 = "Федосеева";
//        int a1 = 5;
//        int b1 = 5;
//        int a2 = 25;
//        int b2 = 100;
//        int a3 = 110;
//        int b3 = 130;
        int result;
       // int number = 1234;
        //int number1 = 123;

        Scanner in = new Scanner(System.in);
        System.out.println("Input a number 1: ");
        int number1 = in.nextInt();
        System.out.println("Input a number 2: ");
        int number2 = in.nextInt();
        test01(number1, number2);

//        Scanner in = new Scanner(System.in);
//        System.out.print("Input a number: ");
//           int number1 = in.nextInt();
//           min(number1);
//        max(number1);


//        while (true) {
//            System.out.print("Input a number: ");
//            int num = in.nextInt();
//            test(num);
//        }
//        while (true) {
//        System.out.print("Введите первое число: ");
//        int a = in.nextInt();
//        System.out.print("Введите второе число: ");
//        int b = in.nextInt();
//         min(a, b);
//        //System.out.println(result);
//        }

//        System.out.println(name + " " + surname);
//        System.out.println(name1 + " " + surname1);
//        swap(name, surname);
//        swap(name1, surname1);
//        sum(a1, b1);
//        sum(a2, b2);
//        sum(a3, b3);

    }

    private static void swap (String a, String b) {
        String temp =  a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);

    }

    private static void sum (int a, int b) {
        int c = a + b;
        System.out.println(c);

    }

//    public class MethodCall
//    {
//
//        public static int mi1n(int c, int d)
//        {
//            int m2;
//            if (c < d)
//                m2 = c;
//            else
//                m2 = d;
//
//            return m2;
//        }
//    }

    private static void test (int number) {
        int a = number / 1000;
        int b = (number % 1000) / 100;
        int c = (number % 100) / 10;
        int d = number % 10;
        int sum = d * 1000 + c * 100 + b * 10 + a;
        System.out.println(sum);

    }

    public static int min(int c, int d)
    {
        int m2;
        if (c > d) {
            //m2 = c;
            System.out.println("второе меньше первого");
        }

        else if (c < d) {
            //m2 = d;
            System.out.println("первое меньше второго");

        }

        else if (c == d) {
            //m2 = d;
            System.out.println("Числа равны");

        }
        return 0;

    }

//    public static int sum1 (int number2) {
//        int a = number2 / 100;
//        int b = (number2 % 100) / 10;
//        int c = number2 % 10;
//        int sum = a + b + c;
//        return sum;
//    }

    public static int min (int number3) {
        int min;
        int a = number3 / 100;
        int b = (number3 % 100) / 10;
        int c = number3 % 10;

        if (a < c && a < b) {
            min = a;
            System.out.println(min);
        }
        else if (c < b && c < a) {
            min = c;
            System.out.println(min);
        }
        else if (b < c && b < a) {
            min = b;
            System.out.println(min);
        }
        return  0;
    }

    public static int max (int number3) {
        int max;
        int a = number3 / 100;
        int b = (number3 % 100) / 10;
        int c = number3 % 10;

        if (a > c && a > b) {
            max = a;
            System.out.println(max);
        }
        else if (c > b && c > a) {
            max = c;
            System.out.println(max);
        }
        else if (b > c && b > a) {
            max = c;
            System.out.println(max);
        }
        return 0;
    }

    public static int test01 (int aa, int bb) {
        int pow;
         if (aa + bb > 10) {
             pow = aa * aa + bb * bb;
             System.out.println(pow);
         }
         else System.out.println("Сумма чисел меньше 10!");


        return 0;
    }


}
