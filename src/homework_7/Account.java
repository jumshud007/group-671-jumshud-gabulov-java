package homework_7;

public class Account {
    // 2
	String owner;
	double balance;
	public void deposite(double amountt) {
		balance = amountt;
	};
	double sum = 0;
	public void withdraw(double amount) {
    if( balance >= amount ) {sum = balance - amount;}
    else {System.out.println("Недостаточно средств");}
	}
	public void getbalance() {
		System.out.println("Ваш баланс :" + sum);
	}
}

