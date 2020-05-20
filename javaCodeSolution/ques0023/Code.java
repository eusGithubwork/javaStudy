//	@eshutkarsharma
// 	0023	Program to swap 2 num without using third variable and without using (+ -).

import java.util.Scanner;
public class Code{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int x;
		int y;
		System.out.print("Enter x : ");
		x = sc.nextInt();
		System.out.print("Enter y : ");
		y = sc.nextInt();
		System.out.println("Before Swap :");
		System.out.println("x : "+x+"		y : "+y);

		x = x*y;
		y = x/y;
		x=	x/y;

		System.out.println("After Swap :");
		System.out.println("x : "+x+"		y : "+y);
	}
}