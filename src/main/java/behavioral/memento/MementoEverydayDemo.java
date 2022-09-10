package behavioral.memento;

import java.io.*;

public class MementoEverydayDemo {
    private static void serialize(Employee employee) {
        try (FileOutputStream fileOut = new FileOutputStream("/tmp/empl.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(employee);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Employee deserialize() {
        Employee employee = null;
        try (FileInputStream fileIn = new FileInputStream("/tmp/empl.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            employee = (Employee) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employee;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Bryan");
        emp.setAddress("111 E Code Street");
        emp.setPhone("888-555-1212");

        serialize(emp);

        Employee newEmp = deserialize();
        System.out.println(newEmp.getName());
    }
}
