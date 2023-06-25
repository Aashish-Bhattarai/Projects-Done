
/**
 * Write a description of class Vehicle here.
 *
 * @author (Aashish Bhattarai)
 * @version (a version number or a date)
 */
public class Vehicle
{
    //private attributes are written
    private int Vehicle_ID;
    private String Vehicle_name;
    private String Vehicle_Weight;
    private String Vehicle_Color;
    private String Vehicle_Speed;

    //constructor is initialized with parameters
    public Vehicle( int Vehicle_ID, String Vehicle_name, String Vehicle_Color, String Vehicle_Weight ){
        this.Vehicle_ID = Vehicle_ID;
        this.Vehicle_name = Vehicle_name;
        this.Vehicle_Color = Vehicle_Color;
        this.Vehicle_Weight = Vehicle_Weight;
    }

    //accessor methods for each attributes
    public int getVehicle_ID(){
        return this.Vehicle_ID;
    }

    public String getVehicle_name(){
        return this.Vehicle_name;
    }

    public String getVehicle_Weight(){
        return this.Vehicle_Weight;
    }

    public String getVehicle_Color(){
        return this.Vehicle_Color;
    }

    public String getVehicle_Speed(){
        return this.Vehicle_Speed;
    }

    //setter methods for Vehicle_Speed and Vehicle_Color
    public void setVehicle_Speed(String Vehicle_Speed){
        this.Vehicle_Speed = Vehicle_Speed;
    }

    public void setVehicle_Color(String Vehicle_Color){
        this.Vehicle_Color = Vehicle_Color;
    }

    //creating display method 
    public void display(){
        System.out.println("The vehicle id is  " + Vehicle_ID);
        System.out.println("The name of vehicle is  " + Vehicle_name); 
        if (Vehicle_Weight.equals ("")){
            System.out.println("The vehicle weight is empty");
        } else{
            System.out.println("The weight of vehicle is  " + Vehicle_Weight);
        
        }
        System.out.println("The color of vehicle is  " + Vehicle_Color);
        System.out.println("The speed of Vehicle is  " + Vehicle_Speed);
    }
}