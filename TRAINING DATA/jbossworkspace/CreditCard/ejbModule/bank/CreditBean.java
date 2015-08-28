package bank;

import javax.ejb.Local;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CreditCard
 */

import javax.ejb.Stateless;
@Stateless
public class CreditBean implements CreditRemote {

    public String check(String cardno) {
       if (cardno.length()==10)
		return "valid";
	else
		return "invalid";
    }
       
}