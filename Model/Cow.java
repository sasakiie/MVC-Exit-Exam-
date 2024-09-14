package Model;

public class Cow {
    private String id;
    private String CowType;
    private int years;
    private int months;
    private MilkCalculator milkCalculator;

    public Cow(String id , String CowType , int years , int months){
        this.id = id;
        this.CowType = CowType;
        this.years = years;
        this.months = months;
        setMilkCalculator();
    }

    public String getId(){
        return id;
    }

    public String getType(){
        return CowType;
    }

    public int getYears(){
        return years;
    }

    public int getMonths(){
        return months;
    }

    public int getTotalMonths(){
        return years * 12 + months;
    }

    private void setMilkCalculator(){
        switch (CowType.toLowerCase()) {
            case "white":
                milkCalculator = new White_Milk_Calculate();
                break;
            case "brown" : 
                milkCalculator = new Brown_Milk_Calculate();
                break;
            case "pink" :
                milkCalculator = new Pink_Milk_Calculate();
                break;
            default:
                milkCalculator = null;
        }
    }

    public double calculateMilk(){
        if (milkCalculator != null) {
            return milkCalculator.calculateMilk(years , months);
        }
        return 0 ;
    }

}
