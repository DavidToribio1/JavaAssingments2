import java.util.Scanner;

public class Demo {
	
	static void describeApplication() {
		
		System.out.println("This program will ask for a radius and will calculate”\r\n"
				+ "“the circumference or the area of a circle with that radius,\r\n"
				+ "based on your selection.” “Then it will repeat the process");
	}

	public static void main(String[] args) {
		
		char answer;
		char option;
		int radius;
		
		Scanner input = new Scanner(System.in);
		
		
		describeApplication();
		System.out.println("Please enter your radius");
		do {
			
		
		radius = input.nextInt();
		CircleDoWhile circle = new CircleDoWhile(radius);
		
		System.out.println("What would you like to calculate? (Type a for area , c for circumfernce");
		option = input.next().toLowerCase().charAt(0);
	
		if(option == 'a') {
			
			 System.out.println("Area " + circle.area());
		}
		else if (option == 'c') {
			System.out.println("Circumference: " + circle.circumference());
		}
		
		else {
			System.out.println("Not a valid option");
		}
		
		
	} while(option != 'y' &&  option != 'n');
	
	System.out.println("Do you want to continue? (y/n)");
	
	
}
}
