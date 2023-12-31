package Collections;

import java.util.HashMap;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class HashMapTest {
	@Test
	public void hashMapTest() {
		HashMap<Object, String> hm = new HashMap<Object, String>();
		hm.put(10, "Ashish");//Duplicate keys are not allowed, but values are allowed
		hm.put(5, "Rakesh");
		hm.put(null, null);//Allows only one null key
		hm.put(3, null);
		hm.put(null, "Nikhil");
		hm.put(2, "hemanth");
		hm.put(1, "Gopi");
		hm.put(4, "Abhijit");
		hm.put(7, "Ashish");
		hm.put(6, "Ashish2");
		hm.put(8, "Ashish2");
		hm.put(9, "Ashish2");
		
		for(Entry<Object, String> es:hm.entrySet()) {
			System.out.println(es.getKey()+" "+es.getValue());
		}
			
	}
}
