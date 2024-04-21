//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    private static boolean containsDuplicates(int[] nums){
        Set<Integer>set = new HashSet<>();
        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 8, 1, 5, 3};
        if(containsDuplicates(nums)){
            System.out.println("The array contains duplicates");
        }else{
            System.out.println("The array does not contain duplicates");
        }

    }
}