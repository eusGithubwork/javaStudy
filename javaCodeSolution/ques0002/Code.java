//	@eshutkarsharma
// 	0002	Program to make all primitive datatype variable
// 	and read value in variable 
// 	and display to console.

import java.util.Scanner;
public class Code{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		byte byteNum;
		short shortNum;
		int intNum;
		long longNum;
		float floatNum;
		double doubleNum;
		char ch;
		boolean flag;

		System.out.print("Enter byteNum : ");
		byteNum = sc.nextByte();

		System.out.print("Enter shortNum : ");
		shortNum = sc.nextShort();

		System.out.print("Enter intNum : ");
		intNum = sc.nextInt();

		System.out.print("Enter longNum : ");
		longNum = sc.nextLong();

		System.out.print("Enter floatNum : ");
		floatNum = sc.nextFloat();

		System.out.print("Enter doubleNum : ");
		doubleNum = sc.nextDouble();

		System.out.print("Enter boolean value : ");
		flag = sc.nextBoolean();

		System.out.print("Enter char value : ");
		ch = sc.next().charAt(0);

		System.out.print("byteNum : "+byteNum+"\n");
		System.out.print("shortNum : "+shortNum+"\n");
		System.out.print("intNum : "+intNum+"\n");
		System.out.print("longNum : "+longNum+"\n");
		System.out.print("floatNum : "+floatNum+"\n");
		System.out.print("doubleNum : "+doubleNum+"\n");
		System.out.print("char value : "+ch+"\n");
		System.out.print("flag value : "+flag+"\n");
	}
}