package bank;

import javax.ejb.Local;

@Local
public interface Credit2Local {
	String check(String cardno);
}