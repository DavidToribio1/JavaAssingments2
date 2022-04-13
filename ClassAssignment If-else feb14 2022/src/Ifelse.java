/*
 * 1.  Create a variable called count, if count value is 10 print 
 * "The Count is 10", for any other value print "The count is not 10". 

2. Declare a string variable called carColor and assign 
it a color of your choice. (page number:153, Note: 
instead of using ".equals" use relational operator "==")

3. Declare a boolean variable called raining and set it to either true or false.
 Take another float variable called temperature if raining is true and temperature
  is less than 50 print "take your umbrella" else print " don't take your umbrella.
   (page number: 159) 
 */
public class Ifelse {

	public static void main(String[] args) {

		int count = 10;
		
		if (count == 10) {
			
			System.out.println("The count is 10");
		}
		
		else {
			System.out.println("The count is not 10");
		}
		
		String color = "blue";
		
		if(color == "red") {
			
			System.out.println("This is not my color");
		}
		else if(color == "green") {
			
			System.out.println("This is not my color");
		}
		else if(color == "blue") {
			
			System.out.println("This is my color = " + color);
		}
		else {
			
			System.out.println("You didnt pick the right color");
		}
		
		boolean raining = false;
		float temperature = 45.0f;
		
		if(raining == true || temperature < 50 ) {
			
			System.out.println("Take Your umbrella");
		}
		else if (raining == false)
		{
			System.out.println("leave umbrella");
		}
		
		
		
	}

}
