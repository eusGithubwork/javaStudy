// @eshutkarsharma
// 0059 Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... n
import java.util.Scanner;

public class Code {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int nth, a, b, c;
      a=0;
      b=1;
      System.out.print("Entre n : ");
      nth = sc.nextInt();

      for(int i=1; i<=nth; i++)
      {
        System.out.print(a+"\t");
        c=a+b;
        a=b;
        b=c;
      }
    }
} 