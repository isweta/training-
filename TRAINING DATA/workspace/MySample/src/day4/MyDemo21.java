package day4;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

//specifying the type--generics

public class MyDemo21 {

	public static void main(String[] args) {

		Set<String> mySet = new HashSet<String>();
		mySet.add("Raju");
		mySet.add("Raghav");
		mySet.add("Raju");

		System.out.println(mySet);

		Iterator<String> it = mySet.iterator();
		while (it.hasNext()) {
			String name =  it.next();
			System.out.println(name);
		}

	}
}
