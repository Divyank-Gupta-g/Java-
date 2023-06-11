//Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car". Using super function.

class vehicle{
    public void drive(){
        System.out.println("Repairing a vehicle.");
    }
}

class car extends vehicle{
    public void drive(){
        super.drive();
        System.out.println("Repairing a car.");
    }
}

public class repair{
    public static void main(String[] args){
        car c = new car();

        c.drive();
    }
}