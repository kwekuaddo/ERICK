
import java.util.Scanner;
public class Q2 {
	
	public static void main(String[] args) {
	

		       @SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);

		       System.out.print("Enter a positive integer: ");

		       int num = scan.nextInt();

		       while (num < 0){

		           System.out.println("Please only enter positive numbers!");

		           num = scan.nextInt();

		       }

		       

		       for (int i = 0; i <= 10; i++){

		           System.out.println(num*i);

		       }

		       

		   }

		   
	}



