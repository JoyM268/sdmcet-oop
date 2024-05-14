//Program to convert an Array into Collection in Java
import java.util.*;

class arrayToCollection {
    public static void main(String args[]) {
        String students[] = { "Kamlesh", "Abhay", "Abhishek", "Shivansh" };

        //Printing input elements for comparison
        System.out.println("Array input: " + Arrays.toString(students));

        //Converting array into Collection with asList() function
        List<String> studentList = Arrays.asList(students);

        //Print converted elements
        System.out.println("Converted elements: " + studentList);
    }
}