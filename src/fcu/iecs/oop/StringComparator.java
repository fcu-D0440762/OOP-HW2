package fcu.iecs.oop;
import java.util.Scanner;
public class StringComparator {

	public static void main(String[] args) {
		
		String str1, str2 ;
		boolean index;
		do{
		System.out.println("Enter a string 1 :") ;
		Scanner scanner1 = new Scanner(System.in);
		str1 = scanner1.nextLine();
		
		System.out.println("Enter a string 2 :") ;
		Scanner scanner2 = new Scanner(System.in) ;
		str2 = scanner2.nextLine() ;
		
		
		index = !(str1.toUpperCase()).equals(str2.toUpperCase());
		}while(index);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
