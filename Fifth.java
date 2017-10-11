package Fifth;
import java.util.Scanner;
public class Fifth {

	public static void main(String[] args) {
		int a,b,c,d,e;
		Scanner sum = new Scanner(System.in);
		System.out.println("Enter the first number");
		while (!sum.hasNextInt()) {
			sum.next();
	}
		a=sum.nextInt();
		System.out.println("Enter the second number");
		while (!sum.hasNextInt()) {
			sum.next();
	}
		b=sum.nextInt();
		System.out.println("Enter the third number");
		while (!sum.hasNextInt()) {
			sum.next();
	}
		c=sum.nextInt();
		System.out.println("Enter the fourth number");
		while (!sum.hasNextInt()) {
			sum.next();
	}
		d=sum.nextInt();
		e=a+b+c+d;
		System.out.println("The total is: " + e);

}




}