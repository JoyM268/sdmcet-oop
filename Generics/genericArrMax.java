/* Write a generic function to print maximum element in the array.
Note: 
Since generic method of comparision of objects works on any datatype we cannot apply the comparision operators like <, >, == , !=, <= and >= 
Instead java has a single handy tool called comparable interface that has a function called 'compareTo' which returns 
i] = 0, if the 2 objects are equal.
ii] > 0, if the first object is larger than second.
iii] < 0, if the first object is smaller than the second. */
public class genericArrMax{
    static <T extends Comparable<T>> T maxElement(T []arr){
        T max = arr[0];
        for(T e : arr){
            if(e.compareTo(max) > 0){
                max = e; 
            }
        }
        return max;
    }   
    
    public static void main(String[] args) {

        Integer[] a1 = {1, 3, 5};
        Character[] c1 = {'c', 's', 'e'};
        
        System.out.println("Largest integer is: " + maxElement(a1));
        System.out.println("Largest characters in:" + maxElement(c1));
    }
}