package bank;

import javax.ejb.Remote;

@Remote
public interface CreditRemote {
	String check(String cardno);
}
