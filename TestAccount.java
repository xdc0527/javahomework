public class TestAccount{
	public static void main(String[] args) {
		Account a = new Account(1122, 20000, 4.5);
        a.withDraw(2500);
        a.deposit(3000);
		System.out.println("The account balance is " + a.getBalance() + " dollars");
		System.out.println("The monthly interest is " + a.getMonthlyInterest() + " dollars");
		System.out.println("The date the account created was " + a.getDateCreated());
	}
}