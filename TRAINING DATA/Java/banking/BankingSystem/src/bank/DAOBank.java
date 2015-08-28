package bank;


import java.sql.Connection;
import java.util.List;

public interface DAOBank {
	public Connection createConnection();

	public double getBalanceQuery(int accNo);
	public void withdrawQuery(int accNo, double amt);
	public void depositQuery(int accNo, double amt);
	public void insertTransactionQuery(AccountOperation accOp);
}
