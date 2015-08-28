import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;




public class TreeMapDemo {
	public static void main(String[] args) {
		Map<String, Long> phoneBook=new TreeMap<String,Long>();
		phoneBook.put("sweta",65677788L);
		phoneBook.put("ashok",6788L);
		phoneBook.put("anil",678908L);
		phoneBook.put("amar",673535388L);
		phoneBook.put("ashok",6788L);
		//
		Set<String> phoneKeys=phoneBook.keySet();
		//Iterate through the keys and get values from the map
		Iterator keyIter=phoneKeys.iterator();
		while(keyIter.hasNext()){
			String key=(String)keyIter.next();
			System.out.println(key+"->"+phoneBook.get(key));
		}
		
	}

}
