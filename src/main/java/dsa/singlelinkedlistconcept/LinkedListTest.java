package dsa.singlelinkedlistconcept;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void test1() {

		LinkedList_Single ls = new LinkedList_Single();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		System.out.println("size -->"+ls.size());
		ls.print();

		ls.removeFirst();
		System.out.println("size -->"+ls.size());
		ls.print();

		System.out.println("get value -->"+ls.get(7));
		ls.print();

		ls.set(4,6);
		ls.print();

		ls.remove(5);
		ls.print();
		ls.removeLast();
		ls.print();

	}
}

