package calculator;

import java.util.Scanner;

public class Addition 
{
	public static void addition()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("\n\nEnter First Number : ");
		int x=in.nextInt();
		System.out.println("\n\nEnter Second Number");
		int y=in.nextInt();
		System.out.println("\nAns: "+(x+y));
		in.close();
		
	}
	
	public static void main(String[] args)
	{
		System.out.println("\n\t\tCalcualtor");
		addition();
		System.out.println("End of the Program");
		
	}

}
