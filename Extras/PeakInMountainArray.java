//Program to find the peak element in a mountain array(bitonic array)
public class PeakInMountainArray{
    public static void main(String[] args) {
        int[] arr = {-8, 1, 2, 3, 4, 5, 2, -2, -3}; //Contents of the mountain array
        int peakIndex = peakElementIndex(arr);       
        if(peakIndex == -1){
            System.out.println("There is no peak element");
        }else{
            System.out.println("The peak element in the mountain array is " + arr[peakIndex]);
        }
    }

    static int peakElementIndex(int[] arr){
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
}
