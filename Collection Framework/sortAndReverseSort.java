//Program to demonstrate sorting and reverse sorting of collections
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortAndReverseSort {
    public static void main(String[] args) {
        List<String> things = new ArrayList<>();

        things.add("books");
        things.add("clothes");
        things.add("water");

        Collections.addAll(things, "shoes", "bags", "snacks");

        System.out.println("The things for picnic are:");
        System.out.println(things);

        things.remove(2);

        System.out.println("\nAfter removing a thing:");
        for (int i = 0; i < things.size(); i++) {
            System.out.print(things.get(i) + " ");
        }

        System.out.println("\n\nThings in asecnding order:");
        Collections.sort(things);
        for (int i = 0; i < things.size(); i++) {
            System.out.print(things.get(i) + " ");
        }

        System.out.println("\n\nThings in descending order:");
        Collections.sort(things, Collections.reverseOrder());
        for (int i = 0; i < things.size(); i++) {
            System.out.print(things.get(i) + " ");
        }
    }
}