// @eshutkarsharma
// 0046 Program to check whether a number is even or odd using switch case.
import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Enter the number : ");
        num = sc.nextInt();

        switch(num%2)
        {
          case 0:
            System.out.println("Number is Even");
            break;
          default:
            System.out.println("Number is Odd");
        }
    }
}