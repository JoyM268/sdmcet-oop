//Write a generic function to print array of elements which belong to varying datatypes
public class genericArrprint{
    static <T> void printArr(T []arr){
        for(T e : arr){
            System.out.println(e);
        }
    }   
    
    public static void main(String[] args) {
        Integer[] a1 = {1, 3, 5};
        Character[] c1 = {'c', 's', 'e'};
        
        System.out.println("Integers are:");
        printArr(a1);
        System.out.println("Characters are:");
        printArr(c1);
    }
}