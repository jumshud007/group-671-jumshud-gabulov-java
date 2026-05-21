package homework_18;

public class PiggyBank {
	private double balance;
	boolean isBroken;

	void addMoney(double amount) {
		balance += amount;
	}

	double breakOpen() {
		balance = 0;
		isBroken = true;
		return balance;
	}
    
	void getBalance() {
		if(balance != 0) {System.out.println(balance);}
	}
}
