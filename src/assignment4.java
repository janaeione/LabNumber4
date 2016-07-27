import java.util.Scanner;

public class assignment4 {
	
	public static void main (String args[]){

		int x, y, fact=1;
		
		Scanner sc = new Scanner (System.in);
	System.out.println("Enter an Integer from 1 to 10 to Calculate Factorial");
	
	x = sc.nextInt();
	
	if (x < 1){
	}
	else {
		
		for (y = 1 ; y <= x ; y++ )
			fact = fact*y;
		
		System.out.println("Factorial of "+x+" is = "+fact);
	}
	
}
}
