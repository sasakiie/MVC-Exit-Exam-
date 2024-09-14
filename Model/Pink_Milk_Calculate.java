package Model;

public class Pink_Milk_Calculate implements MilkCalculator {
    @Override
    public double calculateMilk(int years , int months){
        return 30 - months;
    }
}
