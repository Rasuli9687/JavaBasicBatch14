package reviewclass04;

public class ForLoopDemo03 {

	public static void main(String[] args) {

		// i want to print this pattern 10 8 6 4 2 0

		for (int i = 10; i >= 0; i = i - 2) {
			System.out.println(i);
		}

		for (int i = 10; i != 0; i -= 2) {
			System.out.println(i);
		}

		for (int i = 9; i >= 1; i -= 4) {
			System.out.println(i);

		}
		for (int i = 10; i >= -10; i = i - 1) {
			System.out.print(" " + i);
		}

	}

}
