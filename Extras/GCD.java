//Program to find GCD of two numbers
public class GCD {
    public static void main(String[] args) {
        int m = 60, n = 24; //Given two numbers
        System.out.println("The GCD of " + m + " and " + n + " is " + gcd(m, n));
    }

    static int gcd(int m, int n){
        while(n != 0){
            int temp = m % n;
            m = n;
            n = temp; 
        }
        return m;
    }
}
