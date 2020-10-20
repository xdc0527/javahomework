import java.util.Scanner;
public class FindSmallest{
	public static int indexOfSmallestElement(double[] array){
		int i_min = 0;
		double min = array[0];
		for (int i = 1; i < array.length; i ++){
			if (array[i] < min){
				min = array[i];
				i_min = i;
			}
		}
		return i_min; 
	}
	public static void main(String[] args) {
		System.out.println("Enter ten numbers: ");
		double[] numbers = new double[10];
		for (int n = 0; n < numbers.length; n ++){
            Scanner input = new Scanner(System.in);
   	        double number = input.nextDouble();
            numbers[n] = number;
		}
		System.out.println("The index of the smallest element is " + indexOfSmallestElement(numbers));		
	}
}