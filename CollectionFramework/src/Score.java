import java.util.ArrayList;
import java.util.ListIterator;

public class Score {
	
	public static void main(String[] args) {
		
		//ArrayList of integers
		ArrayList<Integer> scores = new ArrayList<Integer>();
		
		System.out.println(scores.size()); //Arrays we used, length attrivute,String.length()
		
		scores.add(2); //AutoBoxing //adding integer 2 into the arraylist
		
		scores.add(5);
		
		scores.add(2);
		
		scores.add(3);
		
		scores.add(0,56); //Insert element 56 at index 0
	
		System.out.println(scores.size());
		
		int[] scoresArray = new int [5];
		
		System.out.println(scoresArray.length);
		
		//Integer a = new Integer(5);
		
		//scores.remove(a); //Remove element from that index
		//scores.remove(Object);
		
		//System.out.println(scores.size); //Arraylist are dynamic
		
		//for-each loop
		//for (TypeThatArrayListHolds varaibaleName : arrayListName)
		
		for(Integer a : scores) {
			
			System.out.println(a);
		}
			//do-while,while,for loop range, for-each each element in array or arraylist
	
		
		for(int i=0; i<= scores.size() -1;i++) {
			
			System.out.println(scores.get(i));
		}
		
		System.out.println(scores.isEmpty()); //false
		
		
		ArrayList<String> students = new ArrayList<String>();
		
		System.out.println("Strings ArrayList -------------");
		students.add("Shakeah");
		students.add("Pooja");
		students.add("Sam");
		
		System.out.println(students.size()); //3
		
		System.out.println(students.isEmpty()); //false

		students.set(1, "Renha");
		
		students.remove("Sam");
		
		System.out.println(students.size());
		
		System.out.println(students.get(0)); //.get will get element at index
		
		System.out.println(students.get(1));
		
		System.out.println("List iterator example");
		System.out.println(scores);
		ListIterator<Integer> iterate = scores.listIterator();
		
		while(iterate.hasNext()) {
			Integer a = iterate.next();
			System.out.println("Current element is " + a);
			if(a % 2 ==0) {
				iterate.remove();
			}
			else {
				iterate.add(100);
			}
		}
			System.out.println(scores);
		
	}

}
