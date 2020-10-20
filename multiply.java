import java.util.Scanner;
public class multiply{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 1000: ");
		int number = input.nextInt();
        int new_number = (number % 10) * (number / 100) * (number % 100 / 10);
		System.out.println("The multiplication of all digits in " + number + " is " + new_number);
	}
}