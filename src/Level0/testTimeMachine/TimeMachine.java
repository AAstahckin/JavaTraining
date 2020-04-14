package Level0.testTimeMachine;

public class TimeMachine {
    int currentYear;

    public void goToFuture(int currentYear) {

        currentYear = currentYear +10;

    }

    public void goToPast(int currentYear) {
        System.out.println("Значение currentYear внутри метода goToPast (в начале) = " + currentYear);
        currentYear = currentYear -10;
        System.out.println("Значение currentYear внутри метода goToPast (в конце) = " + currentYear);

    }

    public static void main(String[] args) {
        //Создаем объект timeMachine.
        TimeMachine timeMachine = new TimeMachine();
        //Оюъявляем переменную currentYear(Текущий год) присваиваем ей значение 2020
        int currentYear = 2020;


        System.out.println("Какой сейчас год?");
        //Выводим текущий год
        System.out.println(currentYear);
        //Вызываем метод goToPast для объекта timeMachine timeMachine.goToPast
        timeMachine.goToPast(currentYear);
        System.out.println("А сейчас?");
        System.out.println(currentYear);

    }
    /**
     * Это наглядно показывает, что та переменная, которая была передана в метод goToPast(), явлется лишь копией currentYear.
     * И изменение копии никак не повлияло на значение "оригинала".
     *
     * "Передача по ссылке" носит прямо противоположный смысл.
     */
}
