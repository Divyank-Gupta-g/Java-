//Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.

import java.util.*;

class Person{
    String fn;
    String ln;

    public Person(String fn, String ln){
        this.fn = fn;
        this.ln = ln;
    }

    public String getFirstName(){
        return fn;
    }

    public String getLastName(){
        return ln;
    }
}

class Employee extends Person{
    int Emp_ID;
    String job;

    public Employee(String fn, String ln, int Emp_ID, String job){
        super(fn, ln);
        this.Emp_ID = Emp_ID;
        this.job = job;
    }

    public int getEmp_id(){
        return Emp_ID;
    }

    public String getLastName(){
        return super.getLastName() + ", " + job;
    }
}

public class empl{
    public static void main(String[] args){
        Employee e1 = new Employee("Amar", "Singh", 123, "Sales");
        Employee e2 = new Employee("Alex", "Kumar", 321, "HR");

        System.out.println(e1.getFirstName() + " " + e1.getLastName() + " (" + e1.getEmp_id() + ")");
        System.out.println(e2.getFirstName() + " " + e2.getLastName() + " (" + e2.getEmp_id() + ")");
    }
}
