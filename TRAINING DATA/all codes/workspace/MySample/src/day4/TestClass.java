package day4;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class TestClass {
	public static void main(String[] args) {
		ListOfNumbers l1 = new ListOfNumbers();
		l1.writeList();
	}
}

class ListOfNumbers {

	List<Integer> list;

	public ListOfNumbers() {
		list = new Vector<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(i);
		}

	}

	public void writeList() {
		Iterator<Integer> it = list.iterator();
		System.out.println();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}
