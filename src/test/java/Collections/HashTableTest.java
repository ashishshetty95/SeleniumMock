package Collections;

import java.util.Hashtable;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class HashTableTest {
	@Test
	public void hashTable() {
		Hashtable<Object, String> ht = new Hashtable<Object, String>();
		ht.put(10, "Ashish");
		ht.put(5, "Rakesh");
		//ht.put(null, null); doesn't allow null key and null value
		//ht.put(3, null); doesnt allow null value
		//ht.put(null, "Nikhil"); doesn't allow null key
		ht.put(2, "hemanth");
		ht.put(1, "Gopi");
		ht.put(4, "Abhijit");
		ht.put(7, "Ashish");
		ht.put(6, "Ashish2");
		ht.put(8, "Ashish2");
		ht.put(9, "Ashish2");
		for(Entry<Object, String> t:ht.entrySet()) {
			System.out.println(t.getKey()+"  "+t.getValue());
		}
	}
}
