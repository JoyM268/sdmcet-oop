//Find square root of a given perfect square using binary search
public class SquareRootBinarySearch {
    public static void main(String[] args) {
        int perfectSquare = 400; //Given perfect square
        System.out.println("The square root of " + perfectSquare + " is " + squareRoot(perfectSquare));
    }

    static int squareRoot(int perfectSquare){
        int start = 0, end = perfectSquare;
        while(start <= end){
            int mid = start + (end - start)/2;
            int square = mid * mid;
            if(square == perfectSquare){
                return mid;
            } if(square < perfectSquare){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
