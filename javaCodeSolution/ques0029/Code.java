//  solution given by : surbhi Garg
//  0029 Program to find min number out of 2 number.

import java.util.Scanner;

public class Code{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        int a;
        int b;
        int c;
      
        System.out.print("Enter the 1st no. : ");
        a= sc.nextInt();
        System.out.print("Enter the 2nd no. : ");
        b= sc.nextInt();
        
        c=a<b?a:b;
       
        System.out.println("min. no. is "+c);
    }
}