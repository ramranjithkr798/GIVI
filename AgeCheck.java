import java.util.Scanner;

public class AgeCheck {
	public static void main(String args[]) {
		int age;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the age");
		age=scan.nextInt();
		if(age>=60)
			System.out.println("The person age is "+age+" hence Senior Citizen.");
		else
			System.out.println("The person age is "+age+" hence not Senior Citizen.");
	}
}
