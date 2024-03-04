//Program to find factors of a given number
public class Factors {
    public static void main(String[] args) {
        int num  = 36; //Given number
        printFactors(num);
    }

    static void printFactors(int num){
        for(int i = 1; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                if(num / i == i){
                    System.out.print(i + " ");    
                }else{
                    System.out.print(i + " " + num/i + " ");
                }
            }
        }
        System.out.println();
    }
}
