package bank;

import javax.ejb.Local;

@Local
public interface CreditBeanLocal {
	String check(String cardno);
}
