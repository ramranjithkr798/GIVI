import java.util.Scanner;

public class SumOfFourVariables {

	public static void main(String args[]) {
		int a,b,c,d;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of A");
		a=scan.nextInt();
		System.out.println("Enter the value of B");
		b=scan.nextInt();
		System.out.println("Enter the value of C");
		c=scan.nextInt();
		System.out.println("Enter the value of D");
		d=scan.nextInt();
		if((a+b)>(c+d))
			System.out.println("The Sum a+b"+(a+b)+" is grater then c+d"+(c+d));
		else
			System.out.println("The Sum a+b = "+(a+b)+" is less then c+d = "+(c+d));
	}
	
}
