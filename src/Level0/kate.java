package Level0;

public class kate {

    public static int min4(int a, int b, int c, int d) {
        //напишите тут ваш код
        int min_min2_1 = min2(a, b);
        int min_min2_2 = min2(c, d);

        if (min_min2_1 <= min_min2_2)  {
            return min_min2_1;
        }
        else return min_min2_2;
    }

    public static int min2(int a, int b) {
        //напишите тут ваш код

        if (a <= b)
            return a;
        else
            return b;

    }

    public static void main(String[] args) throws Exception {
        System.out.println(min2(-20, -10));
        System.out.println(min4(-40, -10, -30, 40));
        System.out.println(min4(-20, -40, -30, 40));
        System.out.println(min4(-20, -10, -40, 40));
        System.out.println(min4(-20, -10, -30, -40));
    }
}