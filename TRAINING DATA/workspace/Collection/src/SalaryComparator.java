import java.util.Comparator;


public class SalaryComparator implements Comparator{

	@Override
	public int compare(Object emp1, Object emp2) {
		if(((Employee)emp1 ).getSalary() >   ((Employee)emp2).getSalary() )
			return 1;//o1 is greater
		if(((Employee)emp1 ).getSalary()==   ((Employee)emp2).getSalary() )
			return 0; //o1 and o2 are equal
		
		return -1;// o2 is greater
	}
	
}