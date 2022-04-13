/*
 * Given a range (value of N) and we have to print all ODD numbers from 1 to N
 *  using while loop. Logic: Then, within the loop, we are checking the condition
 *   to check whether number is ODD or not, the condition is (number%2 != 0) 
 *   – it returns true if number is not divisible by 2.
 */



public class forloops {

	public static void main(String[] args) {
		
		
		int i;
		int beginValue = 10;

		int endValue = 50;
		int tableValue = 5;
		
		for(i=beginValue; i<=endValue; i=i+tableValue);
		{
		System.out.println(i + " ");
		}
		
		
		double n = 1.2;
		
		while(n != 5.6)
		{
		 System.out.println(Math.sqrt(n));
		 n = n + 1.1;
		}
		
		int number=1;  
		System.out.print("List of odd numbers from 1 to "+number+": ");  
		while(number<=15) {    
		if (number%2 !=0)
		
		System.out.print(number + " ");  
		
		number++;
		
	
	}
		

}
}