//Write a java program that uses generic sort method to sort elements of any reference type
public class Q2_b{
    static <T> void display(T []arr){
        for(T e : arr){
            System.out.println(e);
        }
    }   
    
    static <T extends Comparable<T>> void arrSort(T []arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j].compareTo(arr[j + 1]) > 0){
                    T temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }   
    
    public static void main(String[] args) {

        Integer[] a1 = {5, 6, 2, 1};
        System.out.println("Int Array before sort:");
        display(a1);       
        arrSort(a1);
        System.out.println("Int Array after sort:");
        display(a1);
    }
}