//Program to implement karatsuba multiplication
import java.math.BigInteger;

public class Karatsuba {
    private static BigInteger karatsuba(BigInteger x, BigInteger y){    
        int max = Math.max(x.toString().length(), y.toString().length());
        if(max == 1){
            return x.multiply(y);
        }
        int middle = (int)Math.ceil(max/2.0);
        BigInteger a, b, c, d;
        if(max > x.toString().length()){
            a = BigInteger.ZERO;
            b = x;
        }else{
            a = new BigInteger(x.toString().substring(0, middle));
            b = new BigInteger(x.toString().substring(middle));
        }
        if(max > y.toString().length()){
            c = BigInteger.ZERO;
            d = y;
        }else{
            c = new BigInteger(y.toString().substring(0, middle));
            d = new BigInteger(y.toString().substring(middle));
        }
        BigInteger ac = karatsuba(a, c);
        BigInteger bd = karatsuba(b, d);
        BigInteger abcd = karatsuba(a.add(b), c.add(d)).subtract(ac).subtract(bd);
        int pow = max/2;
        pow = pow * 2;
        return ac.multiply(BigInteger.TEN.pow(pow)).add(abcd.multiply(BigInteger.TEN.pow(pow/2))).add(bd);
    }

    public static void main(String[] args) {
        BigInteger a = new BigInteger("2718281828459045235360287471352662497757247093699959574966967627");
        BigInteger b = new BigInteger("3141592653589793238462643383279502884197169399375105820974944592");
        System.out.println(karatsuba(a, b));
    }
}
