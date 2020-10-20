import java.util.Scanner;
public class TestDiagonal{
	public static double sumMajorDiagonal(double[][] m){
		double sum = 0.0;
		for (int j = 0; j < 4; j ++){
			sum += m[j][j];
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("Enter a 4-by-4 matrix row by row: ");
		double[][] numbers = new double[4][4];
		for (int n = 0; n < 4; n ++){
            Scanner input = new Scanner(System.in);	        
            for (int i = 0; i < 4; i ++){
			    double number = input.nextDouble();
   	            numbers[n][i] = number;
		    }
		}	
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal(numbers));
	}
}