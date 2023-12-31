package Collections;

import java.util.Map.Entry;

import org.testng.annotations.Test;

public class LinkedHashMap {
	@Test
	public void linkedHashMap() {
		java.util.LinkedHashMap<Object, String> lhm = new java.util.LinkedHashMap<Object, String>();
		lhm.put(10, "Ashish");//Duplicate keys are not allowed, but values are allowed
		lhm.put(5, "Rakesh");
		lhm.put(null, null);//Allows only one null key
		lhm.put(3, null);
		lhm.put(null, "Nikhil");
		lhm.put(2, "hemanth");
		lhm.put(1, "Gopi");
		lhm.put(4, "Abhijit");
		lhm.put(7, "Ashish");
		lhm.put(6, "Ashish2");
		lhm.put(8, "Ashish2");
		lhm.put(9, "Ashish2");
		
		for(Entry<Object, String> k:lhm.entrySet()) {
			System.out.println(k.getKey()+"  "+k.getValue());
		}
	}
}
