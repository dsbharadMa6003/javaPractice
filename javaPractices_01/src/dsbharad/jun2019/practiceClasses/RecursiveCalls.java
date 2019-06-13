package dsbharad.jun2019.practiceClasses;

public class RecursiveCalls {

	public static void customMethod(int i) {
		if (i < 10) {
			System.out.println(i);
			RecursiveCalls.customMethod(i + 1);
		} else {
			System.out.println(i);
		}

	}
}
