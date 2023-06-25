/**
 * Write a description of class ElectricScooter here.
 *
 * @author (Aashish Bhattarai)
 * @version (a version number or a date)
 */
public class ElectricScooter extends Vehicle
{
    //private attributes are written
    private int Range;
    private int Battery_Capacity;
    private int Price;
    private String Charging_Time;
    private String Brand;
    private String Mileage;
    private boolean hasPurchased;
    private boolean hasSold;

    public ElectricScooter(int Vehicle_ID, String Vehicle_name, String Vehicle_Weight, String Vehicle_Color, String Vehicle_Speed, 
    int Battery_Capacity){
        //calling Superclass Constructor                     
        super (Vehicle_ID, Vehicle_name, Vehicle_Color, Vehicle_Weight);

        //calling setter method;
        super.setVehicle_Speed(Vehicle_Speed);
        super.setVehicle_Color(Vehicle_Color);

        //values are initialized
        this.Battery_Capacity = Battery_Capacity;
        Range = 0;
        Price = 0;
        Brand = "";
        Charging_Time = "";
        hasPurchased = false;
        hasSold = false;

    }

    //accessor method for each attribute
    public int getRange(){
        return this.Range;
    }

    public int getBattery_Capacity(){
        return this.Battery_Capacity;
    }

    public int getPrice(){
        return this.Price;
    }

    public String getCharging_Time(){
        return this.Charging_Time;
    }

    public String getBrand(){
        return this.Brand;
    }

    public String getMileage(){
        return this.Mileage;
    }

    public boolean getHasPurchased(){
        return this.hasPurchased;
    }

    public boolean getHasSold(){
        return this.hasSold;
    }

    //setter method for brand
    public void setBrand(String Brand){
        if(hasPurchased != true){
            this.Brand = Brand;  
        }else{
            System.out.println("The electric scooter is already purchased and therefore not possible to change the brand  ");
        }
    }

    //method to purchase an electric scooter
    public void purchase( String Brand, int Price, String Charging_Time, String Mileage, int Range){
        if(hasPurchased == false){
            setBrand(Brand);
            this.Price = Price;
            this.Charging_Time = Charging_Time;
            this.Mileage = Mileage;
            this.Range = Range;
            this.hasPurchased = true;
        }
        else {
            System.out.println("The electric scooter is already purchased  ");
        }
    }

    //method to sell an electric scooter
    public void sell(int Price){
        if(hasSold == false){
            this.Price = Price;
            this.Charging_Time = "";
            this.Mileage = "";
            this.Battery_Capacity = 0;
            this.Range = 0;
            this.hasSold = true;
            this.hasPurchased = false;
        } else {
            System.out.println("The electric scooter is already sold");
        }
    }

    //method for displaying
    public void display(){
        super.display();
        if(hasPurchased==true){
            //The following output will be displayed if hasPurchased is set to true
            System.out.println("The brand of scooter is  " + Brand);
            System.out.println("The battery capacity of scooter is  " + Battery_Capacity);
            System.out.println("The mileage of scooter is " + Mileage);
            System.out.println("The Range of scooter is  " + Range);
            System.out.println("The Recharge time of Scooter is  " + Charging_Time);
        }
    }
}
