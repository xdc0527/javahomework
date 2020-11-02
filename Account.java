import java.util.Date;
public class Account{
	private int id;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;

	public Account(){
		this.balance = balance;
        this.annualInterestRate = annualInterestRate;
	}

	public Account(int n, double x, double i){
		this.id = n;
		this.balance = x;
		this.annualInterestRate = i;
		this.dateCreated = new Date();
	}

	public String getDateCreated(){
		return dateCreated.toString();
	}

	public double getMonthlyInterestRate(){
		return annualInterestRate / 1200;
	}

	public double getMonthlyInterest(){
        double b = this.balance;
        double i = this.getMonthlyInterestRate();
		return b * i;
	}

	public void withDraw(double x){
		this.balance -= x;
	}

	public void deposit(double x){
		this.balance += x;
	}

	public double getBalance(){
		return this.balance;
	}
}