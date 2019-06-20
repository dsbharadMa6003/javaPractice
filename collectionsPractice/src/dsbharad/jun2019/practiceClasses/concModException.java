package dsbharad.jun2019.practiceClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class concModException {

	public static void produceException() {
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><>");
		ArrayList<String> myCol = new ArrayList<String>();
		myCol.add("one");
		myCol.add("one");
		Iterator failFastIterator = myCol.iterator();
		while (failFastIterator.hasNext()) {
			System.out.println("Starting to iterate...");
			failFastIterator.next();
			myCol.add("three");
			System.out.println("End of an iteration.");
		}
	}

	public static void makeChanesWhileIterating() {
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><>");
		CopyOnWriteArrayList<String> myCol = new CopyOnWriteArrayList<String>();
		myCol.add("a");
		myCol.add("a");
		myCol.add("a");
		Iterator failSafeIterator = myCol.iterator();
		while (failSafeIterator.hasNext()) {
			System.out.println("starting an iteration...");
			myCol.add("three");
			System.out.println("size of collection is " + myCol.size());
			System.out.println("end opf an iteration.");
			if (myCol.size() > 10) {
				break;
			}
		}
		failSafeIterator = myCol.iterator();
		while (failSafeIterator.hasNext()) {
			System.out.println("element is ... " + failSafeIterator.next());
		}
	}
	
	public static void removeElementsWithoutException() {
		System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><>");
		ArrayList myCol = new ArrayList();
		myCol.add("one");
		myCol.add(1);
		myCol.add(true);
		myCol.add(25);
		
		Iterator failFastIterator = myCol.iterator();
		while(failFastIterator.hasNext()) {
			Object item = failFastIterator.next();
			System.out.println("iterating over..."+item);
			if(item.equals(true)) {
				failFastIterator.remove();
			}
		}
		failFastIterator = myCol.iterator();
		while(failFastIterator.hasNext()) {
			System.out.println("item is "+failFastIterator.next());
		}
	}
}
