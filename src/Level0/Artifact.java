package Level0;
// В этом классе есть примеры конструкторов
public class Artifact {
    int number;
    String culture;
    int epoch;
    static int count = 0;

    public Artifact (String culture, int epoch) {
        count++;
        this.number = count;
        this.culture = culture;
        this.epoch = epoch;
    }

    public Artifact () {
        count++;
        this.number = count;
    }

    public Artifact (String culture) {
        count++;
        this.number = count;
        this.culture = culture;
    }

    public static void main(String[] args) {
        Artifact artifact1 = new Artifact();
        Artifact artifact2 = new Artifact();
        Artifact artifact3 = new Artifact("Ацтеки");
        Artifact artifact4 = new Artifact("Греки");
        Artifact artifact5 = new Artifact("Рим", 12);
        Artifact artifact6 = new Artifact("Росы", 14);


        System.out.println(artifact1.number);
        System.out.println(artifact2.number);
        System.out.println(artifact3.number);
        System.out.println(artifact4.number + " " + artifact4.culture);
        System.out.println(artifact5.number + " " + artifact5.culture);
        System.out.println(artifact6.number + " " + artifact6.culture + " " + artifact6.epoch);
    }
}
