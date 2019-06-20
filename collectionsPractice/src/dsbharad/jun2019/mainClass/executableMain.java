package dsbharad.jun2019.mainClass;

import java.util.ConcurrentModificationException;

import dsbharad.jun2019.practiceClasses.concModException;

public class executableMain {

	public static void main(String[] args) {
		try {
			System.out.println(
					"Lesson to be learnt: while iterating over a collection which is not thread safe, we should not modify the collection itself");
			concModException.produceException();
		} catch (ConcurrentModificationException cmex) {
			System.out.println("Found the concurrent modification exception.");
			cmex.printStackTrace();
		} finally {
			System.out.println(
					"====================================================================================================================");
			System.out.println("Fail-fast iterator can throw ConcurrentModificationException in two scenarios :");
			System.out.println(
					"\t Single Threaded Environment: After the creation of the iterator , structure is modified at any time by any method other than iterator's own remove method.");
			System.out.println(
					"\t Multiple Threaded Environment : If one thread is modifying the structure of the collection while other thread is iterating over it .");
			System.out.println(
					"====================================================================================================================");
		}
		System.out.println(
				"Lesson to be learnt: while iterating over a collection which is thread safe, we can modify the collection itself because it's iterator is failSafe.");
		concModException.makeChanesWhileIterating();
		System.out.println(
				"Lesson to be learnt: while iterating over a collection which is not thread safe, we can modify the collection (removal of an element to be precise) by using the behaviour of iterator.");
		concModException.removeElementsWithoutException();

	}

}
