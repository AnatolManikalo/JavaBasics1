package Fourth;
import java.util.Scanner;

public class Fourth {

	public static void main(String[] args) {
		double a,b,c,d;
		Scanner conin = new Scanner(System.in);
		System.out.println("Введите длину первого катета: ");
		while (!conin.hasNextDouble()) {
			conin.next();
		}
a=conin.nextDouble();

System.out.println("Введите длину второго катета: ");
while (!conin.hasNextDouble()) {
	conin.next();
}
b=conin.nextDouble();
c= Math.sqrt(a*a+b*b);
d= 0.5 * a * b;
System.out.println("Длина гипотенузы = " + c + "; Площадь треугольника = " + d);
	}

}
