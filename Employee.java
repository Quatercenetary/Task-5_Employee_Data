//package MyC;
import java.util.*;

public class Employee {
    String name, address;
    int year, salary;
    public Employee(String name, String address, int year, int salary) {
        this.name = name;
        this.year = year;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getSalary() {
        return  salary;
    }

    public String getAddress() {
        return address;
    }

    public String toTable(){
        return (this.name+"\t\t "+this.year+"\t\t"+this.salary+"\t\t"+this.address);
    }

    public static void main(String[] strarr){
        System.out.println("Name\t   Year of joining\tSalary\t\t   Address");
        Employee Emp1 = new Employee("Robert", "64C- WallsStreet", 1994, 160160);
        Employee Emp2 = new Employee("Sam", "68D- WallsStreet", 2000, 100100);
        Employee Emp3 = new Employee("John", "26B- WallsStreet", 1999, 110110);
        System.out.println(Emp1.toTable());
        System.out.println(Emp2.toTable());
        System.out.println(Emp3.toTable());
    }
}
