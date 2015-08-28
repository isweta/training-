package bank;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Credit2
 */
@Stateless
@LocalBean
public class Credit2 implements Credit2Local {

    /**
     * Default constructor. 
     */
    public Credit2() {
        // TODO Auto-generated constructor stub
    }
    
    public String check(String cardno) {
        if (cardno.length()==10)
 		return "valid";
 	else
 		return "invalid";
     }

}
