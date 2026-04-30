package classwork_21;

public class BankAccount {

	double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance = balance - amount;
		} else {
			System.out.println("Недостаточно средств!");
		}
	}

	public void getBalance() {
		System.out.println(balance);
	}
}
