import java.util.HashMap;

public class HashMapFrequency {

	public static void main(String[] args) {
		int[] array = { 1, 3, 1, 4, 4 };
		HashMap<Integer, Integer> frequencies = new HashMap<>();
		int m;
		int n;

		for (m = 0; m < array.length - 1; m++) {
			for (n = 1; n < array.length - 1; n++) {
				if (array[m] == array[n]) {
					frequencies.put(m, array[n]);
					System.out.println(frequencies.get(m) + " occurs " + n + " times.");
				}

			}
		}

	}

}
