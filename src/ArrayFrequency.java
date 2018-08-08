

public class ArrayFrequency {

	public static void main(String[] args) {

		int[] array = { 1, 3, 1 };
		int[] frequencies = new int[array.length];
		// int frequency = 1;
		int m;
		int n;

		for (m = 0; m < array.length - 1; m++) {
			for (n = 1; n < array.length; n++) {
				if (array[m] == array[n]) {
					frequencies[m]++;
					System.out.println(array[n] + " occurs " + n + " times.");
				}
				else {


				}

			}
	}
		// for (int j = 0; j < frequencies.length; j++) {
		// System.out.println(frequencies[j]);
		// }

}

}
