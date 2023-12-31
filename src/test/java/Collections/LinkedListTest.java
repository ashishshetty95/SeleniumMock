package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import org.testng.annotations.Test;

public class LinkedListTest {
	@Test
	public void linkedListTest() {
		LinkedList ll = new LinkedList();
		ll.add("String");
		ll.add(10);
		ll.add(55.55);
		ll.add(null);
		ll.add(false);
		ll.add(55.55);
		ll.add(null);
		ll.add(false);
		
		Iterator li=ll.descendingIterator();
		
		
		for(Object l:ll) {
			System.out.println(l);
		}
	}
}
