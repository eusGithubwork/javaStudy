//solution given by : surbhi Garg

// 0030    Program to find min number out of 3 number.

import java.util.Scanner;

public class Code{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);

        int a;
        int b;
        int c;
        int min;

        System.out.print("Enter the 1st no. : ");
        a= sc.nextInt();
        System.out.print("Enter the 2nd no. : ");
        b= sc.nextInt();
        System.out.print("Enter the 3rd no. : ");
        c= sc.nextInt();
        
        min=a<b?a:b;
        min=min<c?min:c;

        System.out.println("min. no. is "+min);
    }
}