package pt.paterns.behavioral.memento.serializable;

import java.io.Serializable;

// Originator
public class Employee implements Serializable {

    private String name;
    private String address;
    private String phone;

    public Employee() {
        // Empty constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " : " + phone;
    }

}
