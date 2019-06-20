package dsbharad.jun2019.mainClass;

import java.util.ConcurrentModificationException;

import dsbharad.jun2019.practiceClasses.concModException;

public class executableMain {

	public static void main(String[] args) {
		try {
		concModException.produceException();
		} catch (ConcurrentModificationException cmex) {
			System.out.println("Found the concurrent modification exception.");
			cmex.printStackTrace();
		}
		concModException.makeChanesWhileIterating();
		
	}

}
