package dsbharad.jun2019.practiceClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class concModException {

	public static void produceException() {
		ArrayList<String> myCol= new ArrayList<String>();
		myCol.add("one");
		myCol.add("one");
		Iterator failFastIterator= myCol.iterator();
		while(failFastIterator.hasNext()) {
			System.out.println("Starting to iterate...");
			failFastIterator.next();
			myCol.add("three");
			System.out.println("End of an iteration.");
		}
	}
	
	public static void makeChanesWhileIterating() {
		CopyOnWriteArrayList<String> myCol= new CopyOnWriteArrayList<String>();
		myCol.add("a");
		myCol.add("a");
		myCol.add("a");
		Iterator failSafeIterator = myCol.iterator();
		while(failSafeIterator.hasNext()) {
			System.out.println("starting an iteration...");
			myCol.add("three");
			System.out.println("size of collection is "+myCol.size());
			System.out.println("end opf an iteration.");
			if(myCol.size()>10) {
				break;
			}
		}
		failSafeIterator = myCol.iterator();
		while(failSafeIterator.hasNext()) {
			System.out.println("element is ... "+failSafeIterator.next());
		}
		
	}
}
