package day4;
import java.util.ArrayList;
import java.util.List;

//arraylist

public class MyDemo16 {

		public static void main(String[] args) {
			
			List list=new ArrayList();
			list.add("Raju");
			list.add("Raghav");
			list.add("Raju");
			list.add(5);
			System.out.println(list);
			System.out.println(list.get(1));
		}
}
