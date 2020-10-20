import java.util.Scanner;
public class TestReverse{
   public static void reverse(int number){
       String s = String.valueOf(number);
       String s1 = "";
       for (int i = 1; i <= s.length(); i ++){
       	  s1 = s1 + s.charAt(s.length() - i);
       }
       System.out.println("The reversed Integer is " + s1);
   }
   public static void main(String[] args) {
   	    Scanner input = new Scanner(System.in);
   	    System.out.println("Enter an Integer: ");
   	    int number = input.nextInt();
		reverse(number);
   }
}