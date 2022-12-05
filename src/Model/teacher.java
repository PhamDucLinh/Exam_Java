package Model;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class teacher extends Person{
    Scanner scanner = new Scanner(System.in);
    private double salary;
    private int numberWorkDay;

    public teacher(double salary, int numberWorkDay) {
        this.salary = salary;
        this.numberWorkDay = numberWorkDay;
    }

    public teacher(int id, String name, String phone, String address, double salary, int numberWorkDay) {
        super(id, name, phone, address);
        this.salary = salary;
        this.numberWorkDay = numberWorkDay;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getNumberWorkDay() {
        return numberWorkDay;
    }

    public void setNumberWorkDay(int numberWorkDay) {
        this.numberWorkDay = numberWorkDay;
    }



    @Override
    public void Input(List<Person> personList) {
        System.out.println("Enter id: ");
        super.setId(scanner.nextInt());
        System.out.println("Enter your name: ");
        super.setName(scanner.next());
        System.out.println("Enter your phone number: ");
        super.setPhone(scanner.next());
        System.out.println("Enter your address: ");
        super.setAddress(scanner.next());
        System.out.println("Enter your salary: ");
        this.setSalary(scanner.nextInt());
        System.out.println("Enter your working day: ");
        this.setSalary(scanner.nextInt());
    }

    @Override
    public String toString() {
        return super.toString() ;
    }

    public teacher(){
        super();
    }

    public String getSalary1( ){
        return "Salary: "+ numberWorkDay*800000;
    }


}
