
public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("John Smith", 1);
		BankAccount account2 = new BankAccount("Jane Meyer", 2, 100.50);
		
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
		
		account1.deposit(12);
		account2.withdraw(50);
		
		System.out.println(account1.getBalance());
		System.out.println(account2.getBalance());
		
		System.out.println(account1.toString());
		System.out.println(account2.toString());

	}

}
