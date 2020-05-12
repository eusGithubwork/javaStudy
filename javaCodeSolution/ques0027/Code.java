//solution given by : surbhi Garg
// 0027    Program to find max number out of 2 number.
import java.util.Scanner;
public class Code{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        int a;
        int b;
        int max;

        System.out.print("Enter the 1st no. : ");
        a= sc.nextInt();
        System.out.print("Enter the 2nd no. : ");
        b= sc.nextInt();

        max = a>b?a:b;

        System.out.println("max. no. is "+max);
    }
}