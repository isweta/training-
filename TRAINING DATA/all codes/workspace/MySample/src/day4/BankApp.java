package day4;

public class BankApp {
	public static void main(String[] args) {
		BankAccount bk = new BankAccount();
		bk.depositMoney(5000.0);
		System.out.println("original balance:" + bk.checkBalance());

		bk.withdrawMoney(6000.0);
		System.out.println("balance after trying to withdraw 6000 :"
				+ bk.checkBalance());
		bk.withdrawMoney(200);
		System.out.println("balance after trying to withdraw 200 :"
				+ bk.checkBalance());
		bk.withdrawMoney(-5);
		System.out.println("balance after trying to withdraw -5 :"
				+ bk.checkBalance());
		
		System.out.println(bk.checkBalance());
	}
}

class BankAccount {

	double balance;

	public void depositMoney(double depositAmount) {
		balance += depositAmount;
	}

	public void withdrawMoney(double withdrawAmount) {
		try {
			if (balance < withdrawAmount)
				throw new InsufficientBalanceException();
			if (withdrawAmount < 0)
				throw new NegativeAmountException();// no need to handle
													// unchecked exception, but will terminate app
			balance -= withdrawAmount;
		} catch (InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		} 

	}

	public double checkBalance() {
		return balance;
	}

}

// checked
class InsufficientBalanceException extends Exception {

	public InsufficientBalanceException() {
		super("Withdrawal failed: Insufficient Balance in Account");
	}
}

// unchecked
class NegativeAmountException extends RuntimeException {
	public NegativeAmountException() {
		super("Amount entered less than zero");
	}
}