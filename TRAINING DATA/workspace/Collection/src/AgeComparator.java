import java.util.Comparator;


public class AgeComparator implements Comparator {
	
	@Override
	public int compare(Object emp1, Object emp2) {
		if(((Employee)emp1 ).getAge() >   ((Employee)emp2).getAge() )
			return 1;//o1 is greater
		if(((Employee)emp1 ).getAge()==   ((Employee)emp2).getAge() )
			return 0; //o1 and o2 are equal
		
		return -1;// o2 is greater
	}
	

}
