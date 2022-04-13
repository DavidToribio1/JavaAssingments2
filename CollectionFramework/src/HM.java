import java.util.ArrayList;
import java.util.HashSet;

public class HM {

	public static void main(String[] args) {

		//create an arraylist of strings
		//Create hashset with that arraylist
		//create a hashmap
		//iterate over it

		ArrayList<String> tvshows = new ArrayList<String>();

		tvshows.add("Prison Break");
		tvshows.add("Veep");
		tvshows.add("Friends");
		tvshows.add("Veep");
		
		System.out.println(tvshows);
	
		//create hashset with that arraylist
		HashSet<String> uniqueTvShows = new HashSet<String>(tvshows);
		
		System.out.println(uniqueTvShows);
	
	
	}

}
