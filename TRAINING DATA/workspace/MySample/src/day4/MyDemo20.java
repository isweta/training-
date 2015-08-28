package day4;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

//iterator

public class MyDemo20 {

	public static void main(String[] args) {

		Set mySet = new HashSet();
		mySet.add("Raju");
		mySet.add("Raghav");
		mySet.add("Raju");
		

		System.out.println(mySet);

		Iterator it = mySet.iterator();
		while (it.hasNext()) {
			String name = (String) it.next();
			System.out.println(name);
		}

	}
}
