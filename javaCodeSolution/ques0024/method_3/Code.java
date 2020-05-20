//  solution given by : surbhi Garg
//  0024	Program to swap 2 num without using third variable and in single statement.

import java.util.Scanner;

public class Code{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        int a;
        int b;

        System.out.print("Enter the 1st no. a: ");
        a = sc.nextInt();
        System.out.print("Enter the 2nd no. b: ");
        b= sc.nextInt();

        System.out.println("Before Swap :");
        System.out.println("a : "+a+"       b : "+b);

        a=a^b^(b=a);

        System.out.println("After Swap :");
        System.out.println("a : "+a+"       b : "+b);
    }
}