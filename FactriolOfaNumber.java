package starting;
// multiple of all factors of given number
public class FactriolOfaNumber {
		 public static void main(String args[]){  
		  int i,factriol=1;  
		  int number=5;   //It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      factriol=factriol*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+factriol);    
		 }  
		} 
