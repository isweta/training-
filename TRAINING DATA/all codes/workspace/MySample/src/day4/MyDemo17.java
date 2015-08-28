package day4;

import java.util.Vector;
import java.util.List;

//vector-- usage same as array list---the only difference being the fact that vectors are synchronised
public class MyDemo17 {

	public static void main(String[] args) {

		List list = new Vector();
		list.add("Raju");
		list.add("Raghav");
		list.add("Raju");
		list.add(5);
		System.out.println(list);
		System.out.println(list.get(1));
	}
}
