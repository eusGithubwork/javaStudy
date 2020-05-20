//	@eshutkarsharma
// 	0010	Program to find the circumference of circle.

import java.util.Scanner;
public class Code{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		float radius, circum;
		System.out.print("Enter radius of circle : ");
		radius = sc.nextFloat();
		circum = 2*3.14f*radius;
		System.out.print("circumference of circle : "+circum);
	}
}