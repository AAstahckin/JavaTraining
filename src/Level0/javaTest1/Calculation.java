package Level0.javaTest1;

public class Calculation {
        int theSalaryGross;
        String name;


        public static double moneyCalculation(double theSalaryGross) {
            double a = 0.87;
            double calculationSalary = theSalaryGross * a;

            return calculationSalary;
        }

    public static double moneyCalculationThePrize(double theSalaryGross) {
        double a = 0.87;
        double b = 0.20;
        double calculationSalary = theSalaryGross * a;
        double thePrize = calculationSalary * b;

        return thePrize;

    }
        public static double monthlyBonusCalculation(double theSalaryGross) {
            double month = moneyCalculationThePrize(theSalaryGross);
            month *= 3;
            return month;
    }
}


