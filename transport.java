//Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.

import java.util.*;

abstract class vehicle{
    String make;
    String model;
    int year;
    String fueltype;
    double fuel_eff;

    public vehicle(String make, String model, int year, String fueltype, double fuel_eff){
        this.make = make;
        this.model = model;
        this.year = year;
        this.fueltype = fueltype;
        this.fuel_eff = fuel_eff;
    }

    public String getMake(){ return make; }
    public String getModel(){ return model; }
    public int getYear(){ return year; }
    public String getFueltype(){ return fueltype; }
    public double getFuel_eff(){ return fuel_eff; }

    public abstract double calculateFuel_eff();
    public abstract double calculateDistance();
    public abstract double getMax_speed();
}

class Truck extends vehicle{
    double cap;

    public Truck(String make, String model, int year, String fueltype, double fuel_eff, double cap){
        super(make, model, year, fueltype, fuel_eff);
        this.cap = cap;
    }

    public double getCap(){ return cap; }

    public double calculateFuel_eff(){
        return getFuel_eff()*(1.0/(1.0+(getCap()/1000.0)));
    }

    public double calculateDistance(){
        return calculateFuel_eff()*getFuel_eff();
    }

    public double getMax_Speed(){
        return 80.0;
    }
}

class Car extends vehicle{
    int seat;

    public Car(String make, String model, int year, String fueltype, double fuel_eff, int seat){
        super(make, model, year, fueltype, fuel_eff);
        this.seat = seat;
    }

    public int getSeat(){ return seat; }

    public double calculateFuel_eff(){
        return getFuel_eff()*(1.0/(1.0+(getSeat()/5.0)));
    }

    public double calculateDistance(){
        return calculateFuel_eff()*getFuel_eff();
    }

    public double getMax_Speed(){
        return 120.0;
    }
}

class Bike extends vehicle{
    double enginedisp;

    public Bike(String make, String model, int year, String fueltype, double fuel_eff){
        super(make, model, year, fueltype, fuel_eff);
        //this.enginedisp = enginedisp;
    }

    public int getEnginedisp(){ return enginedisp; }

    public double calculateFuel_eff(){
        return getFuel_eff()*(1.0/(1.0+(getEnginedisp()/1000.0)));
    }

    public double calculateDistance(){
        return calculateFuel_eff()*getFuel_eff();
    }

    public double getMax_Speed(){
        return 100.0;
    }
}

public class transport{
    public static void main(String[] args){
        Truck t = new Truck("TATA", "TATRA 4X4", 2022, "Diesel", 8.112, 4.5);
        Car c = new Car("TATA", "PUNCH", 2023, "Electric", 6.123, 8);
        Bike b = new Bike("Yamaha", "FZ-S", 2021, "Petrol", 2.1);

        System.out.println("Truck MODEL: " + t.getModel());
        System.out.println("Fuel efficiency: " + t.calculateFuel_eff());
        System.out.println("Distance travelled: " + t.calculateDistance());
        System.out.println("Max Speed: " + t.getMax_Speed());

        System.out.println("Car MODEL: " + c.getModel());
        System.out.println("Fuel efficiency: " + c.calculateFuel_eff());
        System.out.println("Distance travelled: " + c.calculateDistance());
        System.out.println("Max Speed: " + c.getMax_Speed());

        System.out.println("Bike MODEL: " + b.getModel());
        System.out.println("Fuel efficiency: " + b.calculateFuel_eff());
        System.out.println("Distance travelled: " + b.calculateDistance());
        System.out.println("Max Speed: " + b.getMax_Speed());
    }
}