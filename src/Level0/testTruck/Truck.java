package Level0.testTruck;

/**
 * У нас есть класс обозначающий грузовик — Truck.
 *
 */
public class Truck {
    /**
     * Есть параметры обозначающие характеристики автомобиля
     */
    int length;
    int width;
    int height;
    int weight;


    public int getVolume() {
/**
* Есть метод вычесляющий объём грузовика (умножаем длину, ширину и высоту).
* */
        int volume = length * weight * height;

        /**
         * Для того, чтобы вернуть результат метода в Java используется ключевое слово return.
         */
        return volume;
    }

}
