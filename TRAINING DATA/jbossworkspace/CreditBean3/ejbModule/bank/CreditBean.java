package bank;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CreditBean
 */
@Stateless
@LocalBean
public class CreditBean implements CreditBeanLocal {

    /**
     * Default constructor. 
     */
    public CreditBean() {
        // TODO Auto-generated constructor stub
    }
    public String check(String cardno) {
        if (cardno.length()==10)
 		return "valid";
 	else
 		return "invalid";
     }

}
