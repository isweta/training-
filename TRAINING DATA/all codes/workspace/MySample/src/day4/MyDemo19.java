package day4;
import java.util.Set;
import java.util.TreeSet;

//treeset----all values same type so that sorting is possible

public class MyDemo19 {

		public static void main(String[] args) {
			
			Set mySet=new TreeSet();
			mySet.add("Sachin");
			mySet.add("Raju");
			mySet.add("Raghav");
			mySet.add("Raju");
			
			//mySet.add(5); this line throws exception
			/*Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
			at java.lang.Integer.compareTo(Unknown Source)
			at java.util.TreeMap.put(Unknown Source)
			at java.util.TreeSet.add(Unknown Source)
			at day4.MyDemo19.main(MyDemo19.java:15)*/

			System.out.println(mySet);
		
		}
}
