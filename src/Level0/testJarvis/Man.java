package Level0.testJarvis;

public class Man {


    public static void sayYourAge(String greeting, int age) {
        System.out.println(greeting + " " + age);
    }

    public static void main(String[] args) {
        sayYourAge("Мой возраст", 33);
        //Если написать sayYourAge(33, "Мой возраст"); БУДЕТ ОШИБКА так как указывать необходимо как в метоже sayYourAge
        //Сначала Стрига потом числовое String, int. Ни как иначе.
        /**
         * Конструкторы тоже являются методами! И их тоже можно перегружать. (Создать несколько конструкторов с разным набором аргументов)
         * И для них тоже принципиально важен парядок передачи аргументов.
         */

    }


}
