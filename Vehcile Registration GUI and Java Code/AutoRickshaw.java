
/**
 * Write a description of class AutoRickshaw here.
 *
 * @author (Aashish Bhattarai)
 * @version (a version number or a date)
 */
public class AutoRickshaw extends Vehicle
{
    //private attributes are written
    private int Engine_Displacement;
    private String Torque;
    private int Number_of_Seats;
    private int Fuel_Tank_Capacity;
    private String Ground_Clearance;
    private int Charge_Amount;
    private String Booked_Date;
    private boolean isBooked;

    //constructor is initialized with parameters
    public AutoRickshaw(int Vehicle_ID, String Vehicle_name, String Vehicle_Weight, String Vehicle_Color,String Vehicle_Speed, int Engine_Displacement,
    String Torque,int Fuel_Tank_Capacity, String Ground_Clearance){

        //call is made to the superclass constructor
        super(Vehicle_ID, Vehicle_name, Vehicle_Color, Vehicle_Weight);

        //Assigning the values in the constructor
        Vehicle_Speed = Vehicle_Speed;
        Vehicle_Color = Vehicle_Color;
        this.Engine_Displacement = Engine_Displacement;
        this.Torque = Torque;
        this.Fuel_Tank_Capacity = Fuel_Tank_Capacity;
        this.Ground_Clearance = Ground_Clearance;

        //calling the method to set the speed of vehicle and vehicle color within constructor
        super.setVehicle_Color(Vehicle_Color);
        super.setVehicle_Speed(Vehicle_Speed);

        this.isBooked = false;

    }
    //accessor methods for each attributes
    public int getEngine_Displacement(){
        return this.Engine_Displacement;
    }

    public String getTorque(){
        return this.Torque;    
    }

    public int getNumber_of_Seats(){
        return this.Number_of_Seats;
    }

    public int getFuel_Tank_Capacity(){
        return this.Fuel_Tank_Capacity; 
    }

    public String getGround_Clearance(){
        return this.Ground_Clearance;
    }

    public int getCharge_Amount(){
        return this.Charge_Amount;
    }

    public String getBooked_Date(){
        return this.Booked_Date;
    }

    public boolean getIsBooked(){
        return this.isBooked;
    }

    //setter methods for charge amount and no. of seats
    public void setCharge_Amount(int Charge_Amount){
        this.Charge_Amount = Charge_Amount;
    }

    public void setNumber_of_Seats(int Number_of_Seats){
        this.Number_of_Seats = Number_of_Seats;  
    }

    //method for booking autorickshaw
    public void book(String Booked_Date, int Charge_Amount, int Number_of_Seats){
        if(isBooked==true){
            System.out.println("The AutoRickshaw is already booked");
            System.out.println("Status:" + isBooked);
        } else
        {
            this.isBooked = true;
            setCharge_Amount(Charge_Amount);
            setNumber_of_Seats(Number_of_Seats);
            this.Booked_Date = Booked_Date;
        }
    }

    //display method having same signature as that in Vehicle class
    public void display(){
        super.display();
        if(isBooked==true){
            System.out.println("The Engine Displacement is  "+ Engine_Displacement);
            System.out.println("The Torque is  "+ Torque);
            System.out.println("The Fuel Tank Capacity is  "+ Fuel_Tank_Capacity);
            System.out.println("The Ground Clearance is  "+ Ground_Clearance);
            System.out.println("The Booked Date is  "+ Booked_Date);
            System.out.println("The Charge Amount is  "+ Charge_Amount);
            System.out.println("The number of seats are "+ Number_of_Seats);
        }
    }
}