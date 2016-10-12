package fcu.iecs.oop;
import java.util.Scanner;
public class PrintNumberInWord {

	public static void main(String[] args) {
		
		System.out.println("Enter a integer:") ;
		int n ;
		
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt() ;
	
		switch(n) {
		
		case 1 :
			if(n == 1){
				System.out.println("The input integer is ¡§ONE¡¨.") ;
			}
			break ;
		case 2 :
			if(n == 2){
				System.out.println("The input integer is ¡§TWO¡¨.") ;
			}
			break ;
		case 3 :	
			if(n == 3){
				System.out.println("The input integer is ¡§THREE¡¨.") ;
			}
			break ;
		case 4 :
			if(n == 4){
				System.out.println("The input integer is ¡§FOUR¡¨.") ;
			}
			break ;
		case 5 :
			if(n == 5){
				System.out.println("The input integer is ¡§FIVE¡¨.") ;
			}
			break ;
		case 6 :
			if(n == 6){
				System.out.println("The input integer is ¡§SIX¡¨.") ;
			}
			break ;
		case 7 :
			if(n == 7){
				System.out.println("The input integer is ¡§SEVEN¡¨.") ;
			}
			break ;	
		case 8 :
			if(n == 8){
				System.out.println("The input integer is ¡§EIGHT¡¨.") ;
			}
			break ;	
		case 9 :
			if(n == 9){
				System.out.println("The input integer is ¡§NINE¡¨.") ;
			}
			break ;	
		case 10 :
			if(n == 10){
				System.out.println("The input integer is ¡§TEN¡¨.") ;
			}
			break ;
		default :
			System.out.println("The input integer is ¡§OTHER¡¨.") ;
			
		}

	}

}


