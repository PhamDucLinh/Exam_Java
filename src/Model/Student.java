package Model;

import java.util.List;
import java.util.Scanner;

public class Student extends Person {
    private String batch;
    private double mark1;
    private double mark2;

    Scanner scanner = new Scanner(System.in);


    public Student(String batch, double mark1, double mark2) {
        this.batch = batch;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public Student(int id, String name, String phone, String address, String batch, double mark1, double mark2) {
        super(id, name, phone, address);
        this.batch = batch;
        this.mark1 = mark1;
        this.mark2 = mark2;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getMark1() {
        return mark1;
    }

    public void setMark1(double mark1) {
        this.mark1 = mark1;
    }

    public double getMark2() {
        return mark2;
    }

    public void setMark2(double mark2) {
        this.mark2 = mark2;
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
        System.out.println("Enter batch: ");
        this.setBatch(scanner.next());
        System.out.println("Enter mark 1: ");
        this.setMark1(scanner.nextInt());
        System.out.println("Enter mark 2: ");
        this.setMark2(scanner.nextInt());
    }


    @Override
    public String toString() {
        return
                super.toString()+
                "batch='" + batch + '\'' +
                ", mark1=" + mark1 +
                ", mark2=" + mark2
                ;
    }
    public Student(){
        super();
    }

    public String AVG(){
        return "AvgMark: "+ ((mark1 + mark2)/2);
    }
}
