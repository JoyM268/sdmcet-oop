//Program to demonstrate use of hashmaps and its methods
import java.util.HashMap;

class hashMapEx {
    public static void main(String[] args) {
        //Creation of HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();

        //Add elements to the HashMap
        hashMap.put(10, "XYZ");
        hashMap.put(8, "PQR");
        hashMap.put(1, "ABC");

        //Access elements in the HashMap
        System.out.println(hashMap.get(1));
        // Output: ABC

        //Remove an element from the HashMap
        hashMap.remove(8);

        // Check if an element is present in the HashMap
        System.out.println(hashMap.containsKey(8));
        // Output: false

        // Get the size of the HashMap
        System.out.println(hashMap.size());
        // Output: 2
    }
}