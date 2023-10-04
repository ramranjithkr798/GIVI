import java.util.Scanner;

public class StringLoop {

	public static void main(String[] args) {
		
		int num;
		String str;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		num=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the String");
		str=scan.nextLine();
		for (int i=1;i<=num;i++)
			System.out.println(str);
	}

}
