//Program to search a element in the mountain array/Bitonic array (if the element is repeated then return the least index of the element)
public class SearchMountainArray {
    public static void main(String[] args) {
        int[] arr = {}; //Contents of the bitonic array
        int target = 10; //Element to be searched
        int index = search(arr, target);
        if(index == -1){
            System.out.println("Element " + target + " not found");
        }else{
            System.out.println("Element " + target + " found at index " + index);
        }
    }

    static int search(int[] arr, int target){
        int peak = peakIndex(arr);
        if(peak == -1 || target > peak || (target < arr[0] && target < arr[arr.length - 1])){
            return -1;
        }
        int index = binarySearch(arr, 0, peak, target, true);
        if(index != -1){
            return index;
        }
        index = binarySearch(arr, peak, arr.length - 1, target, false);
        return index;
    }

    static int peakIndex(int[] arr){
        int start = 0, end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] < arr[mid + 1]){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return end;
    }

    static int binarySearch(int[] arr, int start, int end, int target, boolean ascending){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }else if(ascending){
                if(target < arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target < arr[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}