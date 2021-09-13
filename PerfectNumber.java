package starting;
// a positive integer that is equal to the sum of its proper divisors.
//sum of its factors is equal to given number
public class PerfectNumber {
	public static void main(String[] args) {
		
		int n=9;
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
				sum += i;
		}
		if(n==sum)
			System.out.println("Its a  Perfect Number");
		else
			System.out.println(" Its not a Perfect Number");
	}
}

                                                                            