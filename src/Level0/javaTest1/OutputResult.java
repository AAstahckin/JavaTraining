package Level0.javaTest1;


import java.util.Scanner;

public class OutputResult {
    public static void main(String[] args) {

        Calculation name = new Calculation();
        name.name = "Алексей";

        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введи свою зарплату: ");
            name.theSalaryGross = in.nextInt();
            System.out.println(name.name + " " + "Зарплата до вычета: " + name.theSalaryGross);
            System.out.println("Зарплата после вычета: " + Calculation.moneyCalculation(name.theSalaryGross));
            System.out.println("Премия за квартал: " + Calculation.monthlyBonusCalculation(name.theSalaryGross));
            System.out.println("Премия в месяц : " + Calculation.moneyCalculationThePrize(name.theSalaryGross));
            System.out.println("Ти молодец :)");
        }
    }



}
