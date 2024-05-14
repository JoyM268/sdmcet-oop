/* Write a java program to create a collection of n different employees with each employee has id, name and address, 
apply sort algorithm to sort all elements */
import java.util.ArrayList;
import java.util.Collections;

class employee implements Comparable<employee>{
    int id;
    String name;
    String address;

    employee(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println("ID: " + this.id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }

    public int compareTo(employee e){
        return this.id - e.id;
    }
}

public class genericEmployee {
    public static void main(String[] args) {
        ArrayList<employee> emp = new ArrayList<>();

        employee e1 = new employee(4, "abc", "dshjdh");
        employee e2 = new employee(1, "efg", "dsjdkd");
        employee e3 = new employee(2, "hij", "kdjsdj");

        //Collections.addAll(emp, e1, e2, e3);
        
        emp.add(e1);
        emp.add(e2);
        emp.add(e3);
        
        System.out.println("Employee details before sorting:");
        for(employee e : emp){
            e.display();
            System.out.println();
        }

        Collections.sort(emp);

        System.out.println("Employee details after sorting:");
        for(employee e : emp){
            e.display();
            System.out.println();
        }
    }    
}