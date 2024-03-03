//Given a non-empty array of integers, every element appears twice except for one. Find that single one.
public class SingleNumberBitwise {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 6, 1}; //Contents of the array
        int singleNumber = findSingleNumber(arr);
        System.out.println("The single number in the array is: " + singleNumber);
    }

    static int findSingleNumber(int[] arr){
        int singleNumber = 0;
        for(int element : arr){
            singleNumber ^= element;
        }
        return singleNumber;
    }
}
