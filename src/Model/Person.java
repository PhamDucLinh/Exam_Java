package Model;

import java.util.List;

public abstract class Person {
    private int id;
    private  String name;
    private String phone;
    private String address;

    public Person() {
    }

    public Person(int id, String name, String phone, String address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public abstract void Input(List<Person> personList);

    public String toString(){
        return "Id: "+this.id + " Name: "+ this.name+" Phone number: "+this.phone+" Address: "+this.address;
    }
}
