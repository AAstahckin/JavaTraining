package Level0.testJarvis;

public class Jarvis {

    public void sayHi(String name) {
        System.out.println("Добрый вечер, " + name + ", как ваши дела?");
    }

    /**
     * Это называется перегрузкой методов. Перегрузка позволяет нашей программе быть более гибкой и учитывать различные варианты работы
     *
     */
    public void sayHi(String firstGuest, String secondGuest) {
        System.out.println("Добрый вечер, " + firstGuest + ", " + secondGuest + ", как ваши дела?");
    }

    /**
     * Запись (String...names) переданная в качестве параметра позволяет нам указать, что в метод передается какое-то количество строк.
     * Мы не оговариваем заранее, сколько их должно быть, поэтому работа нашего метода становится теперь намного более гибкой:
     * Метод перебирает все имена по очереди, для каждого имени и выводит в консоль.
     */
    public void sayHi(String...names) {
        for (String name: names) {
            System.out.println("Добрый вечер, " + name + ", как ваши дела?");
        }
    }

    public static void main(String[] args) {
        Jarvis jarvis = new Jarvis();
        jarvis.sayHi("Тони Старк");
        jarvis.sayHi("Тони Старк", "Капитан Америка");
        jarvis.sayHi("Гадияк Алексей", "Гадияк Никита", "Екатерина Андреевна");
    }
}
