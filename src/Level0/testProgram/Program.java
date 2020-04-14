package Level0.testProgram;

public class Program {

    public static void main(String[] args) {
        /**Для создания объекта Person используется выражение new Person().
         * Оператор new выделяет память для объекта Person. И затем вызывается конструктор по умолчанию,
         * который не принимает никаких параметров. В итоге после выполнения данного выражения в памяти будет выделен участок,
         * где будут храниться все данные объекта Person. А переменная tom получит ссылку на созданный объект.
         *
         * Если конструктор не инициализирует значения переменных объекта, то они получают значения по умолчанию.
         * Для переменных числовых типов это число 0, а для типа string и классов - это значение null (то есть фактически отсутствие значения).
         */
        Person tom = new Person(); //Создаем объект
        tom.displayInfo(); // Для объекта tom выполнить функцию displayInfo.

        Person bob = new Person("Боб", 22);
        bob.displayInfo();

        Person alex = new Person("Алекс", 88);
        alex.displayInfo();

        Person evgen = new Person("Женя");
        evgen.displayInfo();

        //Изменяем имя и возраст
        tom.name = "Том";
        tom.age = 28;
        // Для объекта tom выполнить функцию displayInfo.
        tom.displayInfo();



    }

}
