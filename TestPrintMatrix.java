import java.util.Scanner;
public class TestPrintMatrix{
	public static void printMatrix(int n){
		for (int i = 1; i <= n; i ++){
			for (int k = 1; k < n; k ++){
				double r = Math.random();
		        int j = (int) Math.round(r);
		        String m = String.valueOf(j) + " ";
				System.out.print(m);
			}
			double r = Math.random();
		    int j = (int) Math.round(r);
		    String m = String.valueOf(j) + " ";
			System.out.println(m);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter n: ");
		Scanner input = new Scanner(System.in);
   	    int number = input.nextInt();
		printMatrix(number);
	}
}