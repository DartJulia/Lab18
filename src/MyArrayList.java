

import java.util.Arrays;

public class MyArrayList implements MyList {

	String[] array = new String[4];

	int length = 0;

	private boolean isFull() {
		return length == array.length;
	}

	private void doubleLength() {

		// make a new copy of the array this is twice as long
		array = Arrays.copyOf(array, array.length * 2);

	}

	@Override
	public void addAtBeginning(String data) {
		if (isFull()) {
			doubleLength();
		}
		// loop backwards and shift all the items over to make room for the new one
		for (int i = length; i > 0; i--) {
			array[i] = array[i - 1];
		}
		// set first element and increment length
		array[0] = data;
		length++;
	}

	@Override
	public void removeFromBeginning() {
		// you will do this
		for (int i = 0; i < length - 1; i++) {
			array[i] = array[i + 1];

		}
		length--;

	}

	@Override
	public void addAtEnd(String data) {
		if (isFull()) {
			// if the array is out of space, double the size
			doubleLength();
		}
		// set next item in the array and increment
		array[length] = data;
		length++;

	}

	@Override
	public void removeFromEnd() {
		// clear last slot and decrement the length
		array[length - 1] = null;
		length--;

	}

	@Override
	public String get(int index) {

		return array[index];
	}

	@Override
	public int size() {

		return length;
	}

	@Override
	public String toString() {
		// user string builder to save memory when a lot of strings are being added to
		// list
		StringBuilder sb = new StringBuilder("[ ");
		for (int i = 0; i < length; i++) {
			sb.append(array[i]);
			if (i != length - 1) {
				sb.append(", ");
			}
		}
		sb.append(" ]");
		return sb.toString();
	}

	@Override
	public boolean removeAt(int index) {
		array[index] = array[index + 1];
		length--;

		if (index > length) {
		return false;
		}
		return true;
	}

	@Override
	public boolean insertAt(int index, String data) {
		if (index > length) {
			return false;
		}
		if (isFull()) {
			doubleLength();
		}
		String current = array[index];
		array[index + 1] = current;
		array[index] = data;

		length++;

		return false;
	}

}
