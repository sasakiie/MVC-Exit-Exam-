package Model;

public class White_Milk_Calculate implements MilkCalculator {
    @Override
    public double calculateMilk(int years , int months){
        int totalMonths = years * 12 + months;

        return 120 - totalMonths;
    }
}
