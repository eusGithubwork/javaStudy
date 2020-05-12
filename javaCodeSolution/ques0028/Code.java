//solution given by : surbhi Garg
// 0028	Program to find max number out of 3 number.

import java.util.Scanner;
public class Code{
    public static void main(String []args){
    Scanner sc=new Scanner(System.in);

    int a;
    int b;
    int c;
    int max;

    System.out.print("Enter the 1st no.: ");
    a= sc.nextInt();
    System.out.print("Enter the 2nd no. :  ");
    b= sc.nextInt();
    System.out.print("Enter the 3rd no. :  ");
    c= sc.nextInt();

    max = a>b?a:b;
    max = max>c?max:c;

    System.out.println("max. no. is "+max);
    }
}