package Level0;

import java.util.Scanner;

public class Les2Ex1 {
    public static void main (String[] args)
    {
        String love = "Катя я тебя люблю";
//        System.out.println(love);
//        test();
//        System.out.println(pi());
//        test2();
//        test3();
//        test4();
//        int e = test4();
//        System.out.println(e);
//
//        double result = test5();
//        System.out.println(result);
//        test6();
//        test10();
//        test11();
//        test12();
//        test13();
        a = new Scanner(System.in).nextInt();
        int b = sqr(a);
        System.out.println(b);
    }

    public static void test ()
    {
        System.out.println("Меня зовут Амиго.\n");
        System.out.println("Робот друг человека");
    }
    public static double pi()
    {
        return 3.14;
    }

    public static void test2 () {
        System.out.println(1);
        System.out.println("Amigo");
        System.out.println("Risha & Amigo");

    }
    public static void test3 () {
        System.out.print("Amigo ");
        System.out.print("The ");
        System.out.print("Best");
    }

    public static int test4 () {
        int a = 3;
        int b = 4;
        int c = 3;
        int d = a + b + c;
        return d;
    }
    public static double test5 () {
        double a = 3;
        double b = 4;
        double c = 3;
        double e = 2;
        double d = c * (a + b) / e;
        return d;
    }
    public static void test6 () {
        String katan = "Катя";
        int x = 15;
        String maya = "Май";
        System.out.println(katan + " " + x + " " + maya);
    }

    public static void test7 () {
        int ab = 3126;
        int aa = 8;
        int ac = ab - aa;
        System.out.println(ac);
    }
    /*
    Внеси изменения в программу, чтобы переменная name имела значение Amigo.
     */
    public static void test8() {
        String name = "Amigo";
        String text = "Hello, " + name + "!";
        System.out.println(text);
    }
    /*
В методе main расставь правильно знаки плюс и минус, чтобы значение переменной result получилось равным 20.
Знаки нужно расставить только в строчке, в которой объявляется переменная result.
Порядок следования переменных в этой строке изменять нельзя.
Перед каждой переменной должен стоять знак либо плюс, либо минус.
*/
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

    public static void test9() {

        int result = -a + b - c + d;

        System.out.println(result);
    }
/*
Иправить ошибку в програме. Нужно чтобы программа выводила на экран число 100
int a = 56;
        int b = 30;
        int c = 14;
        System.out.print(a + b + "c");
 */
    public static void test10 () {
        int a = 56;
        int b = 30;
        int c = 14;
        System.out.print(a + b + c);
    }

    /*Закомментируй те переменные, которые нигде не используются. Программа должна компилироваться.
    int a = 10;
        int b = 15;
        double c = b + 38;
        int d = a + 12;
        double e = 12.3;
        String s = "s" + a;
        String s1 = a + "b";
        String s2 = "a";
        String s3 = s1 + "a";
        String s4 = s3 + "b";
        System.out.println(c + s4 + s);
     */
    public static void test11 () {
        int a = 10;
        int b = 15;
        double c = b + 38;
        //int d = a + 12;
        //double e = 12.3;
        String s = "s" + a;
        String s1 = a + "b";
        //String s2 = "a";
        String s3 = s1 + "a";
        String s4 = s3 + "b";
        System.out.println(c + s4 + s);
    }

    public static void test12 () {
        int a, b, c;
        String s1, s2;
        System.out.println("Введите два числа");
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        c = a + b;
        System.out.println("Сумма ваших чисел равна " + c);
    }

    public static void test13 () {
        int a,b,c,d;
        System.out.println("Введите два чила");
        a = new Scanner(System.in).nextInt();
        b = new Scanner(System.in).nextInt();
        d = new Scanner(System.in).nextInt();
        c = (a + b) * d;
        System.out.println("Сумма ваших чисел равна " + c);

    }
    public static int sqr(int a)
    {
        return a * a;
    }
    /*
    Напиши программу, которая выводит на экран надпись: "Хочешь - решай задачи, не хочешь - решай нехотя" 16 раз.
    */
    public static void test14 () {
        String a = "Хочешь - решай задачи, не хочешь - решай нехотя";
        for (int i = 0; i < 16; i++) {
            System.out.println(a);
        }
    }

}
