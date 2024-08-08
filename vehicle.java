
package vu.classproject;

public class vehicle {
    public  String make;
    public String color;
    public int seats;
    
    public vehicle(String make,String color,int seats){
        this.color = color;
        this.make =make;
        this.seats = seats;
}
    public void showVehicleDetails(){
        System.out.println("Vehicle Details");
        System.out.println("The vehicle Make is :" + make);
        System.out.println("The vehicle Color is :" + color);
        System.out.println("The vehicle has :" + seats + " Seats");
    }
    
}
