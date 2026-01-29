package classwork_8;

public class Account {
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
