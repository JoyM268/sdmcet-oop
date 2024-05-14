//Program to demonstrate add, remove and print in arraylist
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class addRemovePrint{
    public static void main(String[] args) {
        List<String> things = new ArrayList<>();

        //Add single element in arraylist at a time
        things.add("books");
        things.add("clothes");
        things.add("water");

        //Add multiple elements into arraylist
        Collections.addAll(things, "shoes", "bags", "snacks");

        System.out.println("The things for picnic are:");
        //Print arraylist directly
        System.out.println(things);

        //remove element at a given index of list
        things.remove(2);

        //Print using for loop
        System.out.println("After removing a thing:");
        for (int i = 0; i < things.size(); i++) {
            System.out.print(things.get(i) + " ");
        }
    }
}