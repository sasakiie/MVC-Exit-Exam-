package Model;

public class Brown_Milk_Calculate implements MilkCalculator {
    @Override
    public double calculateMilk(int years , int months){
        return 40 - years;
    }
}
