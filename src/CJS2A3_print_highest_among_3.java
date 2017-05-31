import java.util.Scanner;

public class CJS2A3_print_highest_among_3 {

	public static void main(String s[]) {
		Scanner input = new Scanner(System.in);
		double a,b,c; 
		System.out.println("Enter 3 numbers :"); 
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		if (a>b) {
			if (a>c)
				System.out.println(a);
			else
				System.out.println(c);
		}
		else if (b>c) {
			System.out.println(b);
		} else
			System.out.println(c);
		input.close(); // closing the input 
	}

}
