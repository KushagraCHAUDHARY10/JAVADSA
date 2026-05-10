import java.util.*;

public class Hash_map{
	public static void main(String[] args){
		HashMap<String, Integer> map = new HashMap<>();

		map.put("India", 120);
		map.put("US", 80);
		map.put("China", 150);

		System.out.println(map);

		map.put("China", 180);
		System.out.println();
		if(map.containsKey("China")){
			System.out.println("China exist");
		}
		else{
			System.out.println("Doesn't");
		}

		System.out.println(map.get("China"));
		System.out.println(map.get("UK"));
		System.out.println();

		//int arr[] = {12, 13, 15};
		//for(int val : arr){
		//	System.out.print(val+ " ");
		//}

		for(Map.Entry<String, Integer> e : map.entrySet()){
			System.out.println(e.getKey());
			System.out.println(e.getValue());
		}

		System.out.println();
		Set<String> keys = map.keySet();
		for(String key : keys){
			System.out.println(key+ " " + map.get(key));
		}
		System.out.println();
		map.remove("China");
		System.out.println(map);

	}
}