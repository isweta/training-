package day4;
import java.util.Set;
import java.util.HashSet;


//set----order of insertion and duplicates not maintained

public class Mydemo18 {

		public static void main(String[] args) {
			
			Set mySet=new HashSet();
			mySet.add("Raju");
			mySet.add("Raghav");
			mySet.add("Raju");
			mySet.add(5);
			System.out.println(mySet);
			
		
		}
}
