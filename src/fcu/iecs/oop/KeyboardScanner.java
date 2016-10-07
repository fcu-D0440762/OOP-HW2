package fcu.iecs.oop;
import java.util.Scanner;
public class KeyboardScanner {

	public static void main(String[] args) {
		
		
		int num_1 ;
		float num_2 ;
		double num_3 ;
		String str1 ;
		
		System.out.println("Enter a integer:") ;
		Scanner scanner = new Scanner(System.in);
		num_1 = scanner.nextInt() ;	
	    System.out.println("Enter a float point number:") ;
	    Scanner scanner2 = new Scanner(System.in);
	    num_2 = scanner2.nextFloat() ;
	    System.out.println("Enter a you name :") ;
	    Scanner scanner3 = new Scanner(System.in);
	    str1 = scanner3.nextLine() ;
	    
	    num_3 = num_1 * num_2 ;
	    System.out.printf("hi %s the multiplication of %d and %f is %e",str1,num_1,num_2,num_3);
		// TODO Auto-generated method stub

	}

}
