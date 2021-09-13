package starting;
public class ArmstrongNumber {
	/*
 	153 --> 1 5 3
 			1*1*1* + 5*5*5 + 3*3*3
 			1	+ 125 + 27
 			153
 			Therefore, Armstrong Number is a number that is equal to the sum of cubes of its digits.
*/
  public static void main(String args[])
  {
	  int n=153;
	  int temp=n;
	  int r,sum=0;
   
  	while(n>0)
  	{
    	r=n%10;
    	n=n/10;
    	sum=sum+r*r*r;
  	}
  	if(temp==sum)
  	{
    	System.out.println("Number is Armstrong");
  	}
  	else
  		System.out.println("Number is not Armstrong");
  }
}