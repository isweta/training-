package day4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class UserDefColl {

	public static void main(String[] args) {
		List<MyClass> list = new ArrayList<MyClass>();
		Scanner s = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Student " + i + ": Enter id, name -");
			list.add(new MyClass(s.nextInt(), s.next()));

		}

		display(list);
	}

	public static void display(List<MyClass> list) {
		Iterator<MyClass> it = list.iterator();
		while (it.hasNext()) {
			MyClass temp = it.next();
			System.out.println("Id: " + temp.id + " Name: " + temp.name);
		}
	}

}

class MyClass {
	int id;
	String name;

	MyClass(int id, String name) {
		this.id = id;
		this.name = name;
	}
}
