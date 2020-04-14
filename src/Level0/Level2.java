package Level0;

/*
* Допиши код в методе print, чтобы он выводил на экран каждую переданную в него строку 4 раза. Каждый раз с новой строки.
Например, при таком вызове:
print("Java opens many opportunities!");
*
* Требования:

    Программа должна выводить текст на экран.
    Метод main не должен вызывать System.out.println или System.out.print.
    Метод print должен выводить текст на экран.
    Метод main должен вызвать метод print класса Solution ровно три раза.
    Метод print должен выводить на экран переданную строку 4 раза. Каждый раз с новой строки.
* */
public class Level2  {
        public static void main(String[] args) {

         int m = 5;
         int n = 6;

         System.out.println("M=" +m+ " N=" + n);
         swap(m, n);


            System.out.println(convertCelsiusToFahrenheit(41));
//           String s = "Java opens many opportunities!";
//           print(s);
//           print(s);
//           print(s);
//            test1();
            //test2();
            //test5();
//            test6();
//            GetText citata = new GetText();
//            citata.text = "Будешь плохо кодить, придет Java и съест твою память";
//            System.out.println(citata.text);
            //напишите тут ваш код



            Person person = new Person();
            House house = new House();
            Cat cat = new Cat();
            Dog dog = new Dog();
            Fish fish = new Fish();

            String s1, s2, s3;
            String a1, a2, a3;
            int b1, b2, b3;

            cat.year = 2;
            b1 = person.year = 23;
            person.name = "катя";
            a1 = house.town = "Москва";
            s1 = person.name;
            cat.owner = person.name;

            dog.year = 5;
            b2 = person.year = 25;
            person.name = "олег";
            a2 = house.town = "Пенза";
            s2 = person.name;
            dog.owner = person.name;

            fish.year = 2;
            b3 = person.year = 90;
            person.name = "зоя";
            a3 = house.town = "Ленино";
            s3 = person.name;
            fish.owner = person.name;

            System.out.println("Хозяин кота?: " + s1 + "   |    Хозяин собаки?: " + s2 +  "   |    Хозяин рыбки?: " + s3);
            System.out.println("Возраст кота?: " + cat.year + "   |    Возраст собаки?: " + dog.year +  "   |    Возраст рыбки?: " + fish.year);
            System.out.println("Где живёт?: " + s1 + " в " + a1 + "   |    Где живёт?: " + s2 + " в " + a2 + "   |    Где живёт?: " + s3 + " в " + a3);
            System.out.println("Сколько лет " + s1 + "?: " + b1 + "     |    Сколько лет " + s2 + "?: " + b2 + "     |    Сколько лет " + s3 + "?: " + b3  );
        }
    private static void swap (int a, int b)
    {
        int c = a;
        a = b;
        b = c;
        System.out.println("M=" +a+ " N=" + b);

    }


    public static class Cat {
        public String owner;
        public int year;
    }

    public static class Dog {
        public String owner;
        public int year;
    }

    public static class Fish {
        public String owner;
        public int year;
    }

    public static class Person {
        public String name;
        public int year;
    }

    public static class House {
            public String town;
    }

    public static class GetText {
        public String text;
    }

    public static void print(String s) {

        System.out.println(s);

        //напишите тут ваш код
    }
    /*
* В методе public static void hackSalary(int a) увеличь зарплату на 100 и выведи на экран надпись: "Твоя зарплата составляет: <a+100> долларов в месяц."
Где <a+100> - это зарплата увеличенная на 100.
Пример вывода на экран для а = 700:
*
* String s;
String s = null;

	Эквивалентные записи.

Person person;          Создали переменную person, её значение null.
person = new Person();  Занесли в неё адрес новосозданного объекта.
person = null;          Присвоили переменной ссылку null.
=================================================================================================================
Cat cat = new Cat();        Создали объект Cat, занесли его ссылку в переменную cat. cat.owner равен null.
cat.owner = new Person();   Занесли в cat.owner ссылку на новосозданный объект Person.cat.owner.name пока ещё null.
cat.owner.name = "God";     cat.owner.name присвоили имя – God.
    * */

    public  static void test1 () {
        hackSalary(700);
    }

    public static void hackSalary(int a) {
        a = a + 100;
        System.out.println("Твоя зарплата составляет: " + a +  " долларов в месяц.");

        // напишите тут ваш код

    }

    /*
    * Выведи на экран длину окружности, рассчитанную по формуле: L = 2 * Pi * radius.
Результат - дробное число (тип double).
В качестве значения Pi используй значение 3.14.*/
    public static void test2 () {
        printCircleLength(5);
    }

    public static void printCircleLength(int radius) {
        double Pi = 3.14;
        double L = 2 * Pi * radius;
        System.out.println(L);
        //напишите тут ваш код
    }


    public static double convertCelsiusToFahrenheit(int celsius) {
        //напишите тут ваш код
        double a9 = 9;
        double a5 = 5;
        double A = a9 / a5;
        double B = A * celsius;
        double TF = B + 32;
//        double S = 9%5;
//        System.out.println(S);


        return TF;
    }


    /*В методе main создай объект Man, сохрани ссылку на него в переменную man.
Создай также объект Woman и сохрани ссылку на него в переменную woman.

Подсказка: для создания объекта Woman и занесения его ссылки в переменную woman используй конструкцию:
ТипПеременной имяПеременной = new ТипСоздаваемогоОбъекта();
В man.wife сохрани ссылку на ранее созданный объект Woman.
В woman.husband сохрани ссылку на ранее созданный объект Man (подсказка: woman.husband = man;).
Требования:
    В методе main создай объект Man и сразу сохрани ссылку на него в переменную man.
    В методе main создай объект Woman и сразу сохрани ссылку на него в переменную woman.
    В методе main сохрани ссылку на ранее созданный объект Woman в man.wife.
    В методе main сохрани ссылку на ранее созданный объект Man в woman.husband.
    Класс Man должен содержать 3 переменные
    Класс Woman должен содержать 3 переменные
*/
    public static void test3 () {
        Man man = new Man();
        Woman woman = new Woman();
        man.wife = woman;
        woman.husband = man;
        //напишите тут ваш код
    }

    public static class Man {
        public int age;
        public int height;
        public Woman wife;
    }

    public static class Woman {
        public int age;
        public int height;
        public Man husband;
    }
    //======================================================
    public static void test4 () {
        Car car = new Car();
//        Color color = new Color();
        String s = car.model;
        String s2 = car.color;
        System.out.println(s + " " + s2);
    }

    public static void test5 () {
        Car car = new Car();
        String s = car.model;
        String s2 = car.color;
        int s3 = car.speed;
        String s4 = s + " " + s2 + " " + s3;
        System.out.println(s4);
    }

    public static class Car {
        public int speed = 180;
        public String model = "katya";
        public String color = "green";


    }

    public static void test6 () {
        boolean isLess = (5 > 6);
        System.out.println(isLess);
    }



}




