package Level0.testTimeMachine.testCat;
//Изменим класс TimeMachine, чтобы машина умела работать с объектами Cat;
public class TimeMachine11 {
    public void goToFuture(Cat cat) {
         cat.age += 10;
    }

    public void goToPast(Cat cat) {
        cat.age -= 10;
    }
    //Методы теперь меняют не просто переданное число, а поле age конкретного объекта Cat.

    public static void main(String[] args) {

        TimeMachine11 timeMachine = new TimeMachine11();

        Cat barsik = new Cat(5);

        System.out.println("Сколько лет Барсику в самом начале работы программы?");
        System.out.println(barsik.age);

        timeMachine.goToFuture(barsik);
        System.out.println("А теперь?");
        System.out.println(barsik.age);

        System.out.println("Елки-палки! Барсик постарел на 10 лет! Живо гони назад!");
        timeMachine.goToPast(barsik);
        System.out.println("Получилось? Мы вернули коту его изначальный возраст?");
        System.out.println(barsik.age);
    }
    /**
     * В отличие от примера с примитивами, в случае с объектами в метод передается ссылка на объект.
     * В методы goToFuture(barsik) и goToPast(barsik) была передана ссылка на наш исходный объект barsik.
     *
     * Поэтому когда внутри методов мы меняем barsik.age, мы обращаемся к той самой области памяти, где хранится наш объект.
     *
     * Это ссылка на того самого Барсика, которого мы создали в самом начале.
     *
     * Это и называется "передачей по ссылке"!
     */

}
