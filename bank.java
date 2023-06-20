
public class bank {
	
	static int currentAmount = 5000;
	
	public static void greetings () {
		System.out.println("Welcome to the ATM");
	}
	
	public  void deposit (int amount) {
		currentAmount = currentAmount+amount;
		System.out.println("amount deposite Succesfully, remaining balance : "+currentAmount);
		
	}
	public static void withdraw (int amount) {
		currentAmount = currentAmount-amount;
		System.out.println("amount withdrawn Succesfully, remaining balance : "+currentAmount);
	}
	public static void main (String[] args) {
		greetings();
		bank Bank = new bank();
		Bank.deposit(500);
		withdraw(2000);
	}

}
