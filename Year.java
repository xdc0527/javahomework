import java.util.Scanner;
public class Year{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		int minutes = input.nextInt();
        int year = minutes / 60 / 24 / 365;
        int day = minutes / 60 / 24 - 365 * year;
		System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days");
	}
}