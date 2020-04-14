package Level0.testProgram;

public class Person {
    String name;
    int age;

    /**
     * Если необходимо, что при создании объекта производилась какая-то логика, например,
     * чтобы поля класса получали какие-то определенные значения, то можно определить в классе свои конструкторы.
     * Например:
     */
    Person()
    {
        this("Undefined1", 18);
        age = 18;
    }

    Person(String n)
    {
        name = n;
        age = 28;
    }

    Person(String n, int a)
    {
        name = n;
        age = a;
    }

    void displayInfo() {
        System.out.printf("Name: %s \tAge: %d\n", name, age);
    }
}
