

public class ListApp {

	public static void main(String[] args) {
		MyList list = new MyArrayList();
		test(list);
		// list = new MyLinkedList();
		// test(list);

	}

	private static void test(MyList list) {
		list.addAtBeginning("D");
		list.addAtBeginning("C");
		list.addAtBeginning("B");
		list.addAtBeginning("A");
		// System.out.println(list);
		// list.removeFromEnd();
		// list.removeFromBeginning();
		System.out.println(list);
		// list.addAtEnd("E");
		// list.removeAt(2);
		list.insertAt(1, "v");
		System.out.println(list);
		System.out.println(list.size());


	}

}
