package starting;
// sum of 2 consucutive numbers
public class FabonacciSeries {
		public static void main(String[] args) {
			int k,a=1,b=1;
			k=0;
			System.out.println("1 ");
			while(k<10)
			{
				k=a+b;
				System.out.println(k+" ");
				a=b;
				b=k;
			}
		}
	}

