import java.util.Scanner;

public class OddOrEven {
	public static void main(String args[])
	{
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		num=scan.nextInt();
		if(num%2==0)
			System.out.println("The Number "+num+" is even");
		else
			System.out.println("The Number "+num+" is odd");
	}
}
