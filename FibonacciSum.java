public class FibonacciSum
{
	public static void main(String[] args) {
		System.out.println("suitable test cases:");
		System.out.println("1.Basic Test Case: input n = 5");
		System.out.println("Sum of Fibonacci numbers up to 5: "+ calculateSum(5));
		System.out.println("2.Zero Input: input n = 0");
		System.out.println("Sum of Fibonacci numbers up to 0: "+ calculateSum(0));
		System.out.println("3.Negative Input: input n = -3");
		System.out.println("Sum of Fibonacci numbers up to -3: "+ calculateSum(-3));
		System.out.println("4.Extreme Case: n = Integer.MAX_VALUE - 1");
		System.out.println("Sum of Fibonacci numbers up to Integer.MAX_VALUE - 1 : "+ calculateSum(Integer.MAX_VALUE - 1));
	}
	public static long calculateSum(int limit) {
	   	if(limit < 2){
	       return 0;
	   	}
	   	long sum = 1;
		long next = 0;
		long n1 = 0;
		long n2 = 1;

		for(int i =0; i<limit-2; i++){
			next = n1 + n2;
			n1 = n2;
			n2 = next;
			sum = sum + n2;
		}
        return sum;
    }
}