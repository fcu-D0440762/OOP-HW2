package fcu.iecs.oop;
import java.util.Scanner;
public class CheckOddEven {

	public static void main(String[] args) {
		
		int n ;
		
		System.out.println("Enter a integer:") ;
		Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt() ;
        
        if ((n % 2)==0){
        	System.out.println("The input integer is Even Number.") ;	
        }else{
        	System.out.println("The input integer is Odd Number.") ;
        	
        }
        	
       
        		
		
	}

}
