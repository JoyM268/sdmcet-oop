/* Create a interface AdvancedArithmetic which contains a method signature int divisor_sum(int n). Write a class called My Calculator which implements the 
interface  divisor_sum function just takes an integer as input and return the sum of all its divisors.*/
interface AdvancedArithmetic{
	int divisor_sum(int n);
}

class myCalculator implements AdvancedArithmetic{
	public int divisor_sum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				sum += i;
			}else {
				continue;
			}
		}
		return sum;
	}
}