import java.util.Scanner;

public class VariableSwap {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of A");
		a=scan.nextInt();
		System.out.println("Enter the value of B");
		b=scan.nextInt();
		System.out.println("Before swaping the value of a="+a +" b="+b);
		c=a;
		a=b;
		b=c;
		System.out.println("After swaping the value of a="+a +" b="+b);
		
	}

}
