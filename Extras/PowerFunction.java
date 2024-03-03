//Program to implement the power function pow(x, n) where x is a base of double type and n is the power of integer type
public class PowerFunction {
    public static void main(String[] args) {
        double x = 2.000; //Given base
        int n = 100; //Given exponent
        System.out.println("pow(" + x + ", " + n + ") = " + pow(x, n));
    }    

    static double pow(double x, int n){
        if(n == Integer.MIN_VALUE){
            x *= x;
            n /= 2;
        }
        if(n < 0){
            n = -n;
            x = 1/x;
        }
        double ans = 1;
        while(n > 0){
            if(n % 2 == 1){
                ans *= x;
            }
            x *= x;
            n /= 2;
        }
        return ans;
    }
}