package Collections;

import java.util.HashSet;

import org.testng.annotations.Test;

public class HashSetTest {
	@Test
	public void hashSet() {
		HashSet hs = new HashSet();
		hs.add("String");
		hs.add("String");
		hs.add(10);
		hs.add(10);
		hs.add(55.55);
		hs.add(true);
		hs.add(null);
		hs.add(null);
		
		for(Object hset:hs) {
			System.out.println(hset);
		}
	}
}
