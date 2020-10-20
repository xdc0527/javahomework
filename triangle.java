import java.util.Scanner;
public class triangle{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of the sides and height of the Equilateral");
		double side = input.nextDouble();
		System.out.println("triangle: " + side);
		double area = Math.sqrt(3) * side * side / 4;
		System.out.println("The area is " + area);
        double volume = area * side;
		System.out.println("The volume of the Triangular prism is " + volume);
	}
}