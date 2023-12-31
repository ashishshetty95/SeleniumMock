package Collections;

import java.util.Map.Entry;
import java.util.TreeMap;

import org.testng.annotations.Test;

public class TreeMapTest {
	@Test
	public void treeMap() {
		TreeMap<Object, String> tree = new TreeMap<Object, String>();
		tree.put(10, "Ashish");//Duplicate keys are not allowed, but values are allowed
		tree.put(5, "Rakesh");
		//tree.put(null, null);//Doesn't allow null key
		tree.put(3, null);
		//tree.put(null, "Nikhil");//Doesn't allow null key
		tree.put(2, "hemanth");
		tree.put(1, "Gopi");
		tree.put(4, "Abhijit");
		tree.put(1, "Ashish");
		tree.put(6, "Ashish2");
		tree.put(2, "Ashish2");
		tree.put(3, "Ashish2");
		
		for(Entry<Object, String> t:tree.entrySet()) {
			System.out.println(t.getKey()+" "+t.getValue());
		}
	}
}
