import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
	//create a hashmap
		
		HashMap<String, String> capitalCities = new HashMap<String, String>();

		capitalCities.put("Dover", "Delaware");
		capitalCities.put("New York", "New York");
		
		System.out.println(capitalCities);
		
		capitalCities.put("alexHi", "fre");
		
		System.out.println(capitalCities);
		
		System.out.println(capitalCities.get("alexHi"));
		
		capitalCities.remove("alexHi");
		
		System.out.println(capitalCities);
		
	}

}
