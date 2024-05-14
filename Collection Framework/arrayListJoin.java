//Java program to demonstrate how to join 2 ArrayLists 
import java.util.*;

class arrayListJoin {
    public static void main(String args[]) {

        ArrayList<String> list_1 = new ArrayList<String>();

        list_1.add("DSA");
        list_1.add("OOP");
        list_1.add("ADA");

        //Print the ArrayList 1
        System.out.println("ArrayList 1: " + list_1);

        ArrayList<String> list_2 = new ArrayList<String>();

        list_2.add("DBMS");
        list_2.add("CN");

        //Displaying the ArrayList 2
        System.out.println("ArrayList 2: " + list_2);

        //Using Collection.addAll() method to join two ArrayList
        list_1.addAll(list_2);

        //Print the joined ArrayList
        System.out.println("Joined ArrayLists: " + list_1);
    }
}