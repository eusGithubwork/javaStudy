//	@eshutkarsharma
// 	0021	Program to swap 2 num using third variable

public class Code{
	public static void main(String []args)
	{
		int x=10;
		int y=20;
		int t;
		System.out.print("Value Before Swap:\n");
		System.out.print("x = "+x+"		y = "+y+"\n");

		t=x;
		x=y;
		y=t;

		System.out.print("Value After Swap:\n");
		System.out.print("x = "+x+"		y = "+y+"\n");
	}
}