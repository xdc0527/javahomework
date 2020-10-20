import java.util.Scanner;
public class Compound{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the monthly saving amount: ");
		double money = input.nextDouble();
		double balance = 0;
		for (int n = 1; n <= 6; n++){
			balance = (balance + money) * 1.003125;
            System.out.println("After " + n + " month, the account value is " + balance);
		}
	}
}