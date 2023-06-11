//Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

import java.util.*;

class employee{

    int salary;
  
    public employee(int salary){
        this.salary = salary;
    }

    public void work(){
        System.out.println("Employee is working.");
    }

    public int getsalary(){
        return salary;
    }
}

class HRMnanager extends employee{
    public HRManager(int salary){
        super(salary);
    }

    public void work(){
        System.out.println("Managing employee.");
    }

    public void addemployee(){
        System.out.println("Adding new employee.");
    }
}

public class emp{
    public static void main(String[] args){
        employee e = new employee(30000);
        HRManager hr = new HRMnanager(50000);

        e.work();
        System.out.println("Employee salary: " + e.getsalary());

        hr.work();
        System.out.println("HRManager salary: " + hr.getsalary());
        hr.addemployee();
    }
}
        