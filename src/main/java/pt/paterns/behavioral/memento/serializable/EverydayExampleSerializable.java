package pt.paterns.behavioral.memento.serializable;

import java.io.*;

public class EverydayExampleSerializable {

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("James Carl");
        employee.setAddress("123 Empty Street");
        employee.setPhone("0354 - 745 - 568");

        serialize(employee);

        Employee newEmployee = deserialize();

        System.out.println(newEmployee.getName());
    }

    private static void serialize(Employee employee) {
        String filepath = "employee.ser";

        try (
                FileOutputStream fileOutputStream = new FileOutputStream(filepath);
                ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream)
        ) {
            outputStream.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Employee deserialize() {
        Employee emp = null;

        try (
                FileInputStream fileInputStream = new FileInputStream("employee.ser");
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {
            emp = (Employee) objectInputStream.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

        return emp;
    }

}
