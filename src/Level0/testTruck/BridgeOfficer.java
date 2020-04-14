package Level0.testTruck;

import java.util.Scanner;

/**
 * Метод checkTruck принимает на вход один параметр — объект грузовика Truck, и определяет, пропустит ли офицер грузовик на мост или нет.
 * Внутри метода логика достаточно проста: если вес грузовика превышает максимально допустимый, метод возвращает false.
 *
 * Если вес меньше либо равен максимальному, можно проезжать, и метод возвращает true.
 */
public class BridgeOfficer {

    int maxWeight;

    public BridgeOfficer(int normalVolume) {
        this.maxWeight = normalVolume;

    }

    public boolean checkTruck(Truck truck) {
        if (truck.weight > maxWeight) {
            System.out.println("Нельзя!");
            return false;
        }
        else {
            System.out.println("Можно!");
            return true;
        }
    }

    /**
     * Так же работает и программа. Она вызывает метод, передает туда данные и в конце получает результат.
     * Вот метод main() для нашей программы BridgeOfficer:
     */
    public static void main(String[] args) {

        /**
         * Вот тут создаем Scanner, это для того что бы можно было не указывать в переменных значения грузовика
         * и оборачиваем в цикл while (true).
         */
        Scanner in = new Scanner(System.in);
        while (true) {
            Truck first = new Truck();
            System.out.println("Вес грузовика номер один: ");
            first.weight = in.nextInt(); // Тут обращаемся к объекту Truck first = new Truck();
            Truck second = new Truck();
            System.out.println("Вес грузовика номер два: ");
            second.weight = in.nextInt();// Тут обращаемся к объекту Truck second = new Truck();
/**
 * Программа вызвала метод officer.checkTruck(first), метод все посчитал и вернул программе результат — true,
 * а программа сохранила его в переменной boolean canFirstTruckGo. Теперь может делать с ним что хочет
 * (как и ты с деньгами, которые получил от бухгалтера).
 *
 * В конечном итоге код
 *
 * boolean canFirstTruckGo = officer.checkTruck(first);
 *
 *
 * сводится к
 *
 * boolean canFirstTruckGo = true;
 *
 *
 * Очень важный момент: оператор return не только возвращает результат работы метода, но и завершает его работу!
 * Весь код, который написан после return, не будет выполнен!
 */
            BridgeOfficer officer = new BridgeOfficer(15000); //Указываем максимальную разрешенную массу
            System.out.println(first.weight + " Грузовик номер 1! Могу я проехать, офицер?");
            boolean canFirstTruckGo = officer.checkTruck(first); //создаем переменную canFirstTruckGo туда запишем работу метода checkTruck
            System.out.println(canFirstTruckGo);
            System.out.println();
            System.out.println(second.weight + " Грузовик номер 2! А мне можно?");
            boolean canSecondTruckGo = officer.checkTruck(second); //создаем переменную canFirstTruckGo туда запишем работу метода checkTruck
            System.out.println(canSecondTruckGo);
        }
    }
}
