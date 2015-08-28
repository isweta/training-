package day4;

import java.util.ArrayList;
import java.util.List;

public class addAll {
	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(5);
		l1.add(6);
		l1.add(1);
		l1.add(4);
		l1.add(3);
		List<Integer> l2 = new ArrayList<Integer>();
		l2.addAll(l1);
		System.out.println(l2);

	}

}
