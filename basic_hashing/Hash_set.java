import java.util.HashSet;
import java.util.Iterator;
public class Hash_set{
	public static void main(String[] args){
		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		set.add(2);
		set.add(390);

		if(set.contains(2)){
			System.out.println("Set conitains 2");
		}
		if(set.contains(9)){
			System.out.println("Set does not contain 9");
		}

		set.remove(1);
		if(!set.contains(1)){
			System.out.println("1 is deleted");
		}

		System.out.println("Size of set is:" + set.size());

		System.out.println(set);

		Iterator it = set.iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}



