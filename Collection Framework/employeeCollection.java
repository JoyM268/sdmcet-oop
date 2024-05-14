//Program to demonstrate creating of collection of user defined class
import java.util.ArrayList;

class Employee {
    int id;
    String name;
    String address;

    public Employee(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("Id: " + id);
        System.out.println("EmpName: " + name);
        System.out.println("EmpAddres: " + address);
    }
}

class employeeCollection {

    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        Employee emp1 = new Employee(1, "ABC", "Dharwad");
        Employee emp2 = new Employee(2, "DEF", "Hubli");
        Employee emp3 = new Employee(3, "XYZ", "Belgaum");
        Employee emp4 = new Employee(4, "PQR", "Haveri");

        //Adding the objects into ArrayList
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);

        //Display the objects of an ArrayList using for-each
        System.out.println("----Employee objects---");
        for (Employee emp : empList) {
            emp.display();
            System.out.println();
        }
    }
}