import java.util.Iterator;
import java.util.List;

public class TestDAO {

	public static void main(String[] args) {
		// listCharacters();
		DAOHarryPotterCharacters dhp = new DAOHarryPotterCharacters();

		// -------return all gryffindors------------
		
		 List<HpCharacter> list=dhp.searchBy("House","Gryffindor");
		 for(Iterator<HpCharacter> it=list.iterator(); it.hasNext();){
		 System.out.println(it.next()); }
		 

		// -------return all family members------------
		/*
		 * List<HpCharacter> list=dhp.searchBy("Status","Family");
		 * for(Iterator<HpCharacter> it=list.iterator(); it.hasNext();){
		 * System.out.println(it.next()); }
		 */

		/*
		 * List<HpCharacter> list = dhp.searchByGroupBy("Dies", "No", "House");
		 * for (Iterator<HpCharacter> it = list.iterator(); it.hasNext();) {
		 * System.out.println(it.next()); }
		 */
		
		List<HpCharacter> list =dhp.returnQuery("select * from harrypotter where dies='No' order by house");
			String prevHouse="";
			for (Iterator<HpCharacter> it = list.iterator(); it.hasNext();) {
				HpCharacter currChar=it.next();
				String currHouse=currChar.house;
				if(!currHouse.equals(prevHouse)){         
					prevHouse=currHouse;
					System.out.println("----------House "+ currHouse+"----------");
				}
				System.out.println(currChar);
		}
				   

		/*
		 * //-----all-who die---------- List<HpCharacter> list =
		 * dhp.returnQuery(
		 * "select * from harrypotter where dies='No' and role='Faculty' order by name"
		 * ); for (Iterator<HpCharacter> it = list.iterator(); it.hasNext();) {
		 * System.out.println(it.next()); }
		 */

	}

	public static void listCharacters() {
		DAOHarryPotterCharacters dhp = new DAOHarryPotterCharacters();
		List<HpCharacter> list = dhp.listCharacters();
		for (Iterator<HpCharacter> it = list.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
	}

	public static void testInsert() {
		DAOHarryPotterCharacters dhp = new DAOHarryPotterCharacters();
		HpCharacter newChar = new HpCharacter("Albus Severus", "Gryffindor",
				"Student", "Family", "No");
		int insertStatus = dhp.insert(newChar);
		if (insertStatus == 0)
			System.out.println("Record not inserted");
		else
			System.out.println("Record inserted Succesfully");
	}

	public static void getAllGryffindors()
	{
		String query=
		DAOHarryPotterCharacters dhp=new DAOHarryPotterCharacters();
		List<HpCharacter> list=dhp.returnQuery(query);
		for(Iterator<HpCharacter> it=list.iterator(); it.hasNext();){
			System.out.println(it.next());
		}
	}
}
