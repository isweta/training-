package day4;

import java.util.List;
import java.util.Vector;

public class VecAdd {

	public static void main(String[] args) {
		List<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(6);
		v.add(1);
		v.add(4);
		v.add(3);
		populate(v);
		System.out.println(v);

	}

	public static void populate(List<Integer> v) {
		v.add(1, 23);
		v.add(4, 36);

	}

}
