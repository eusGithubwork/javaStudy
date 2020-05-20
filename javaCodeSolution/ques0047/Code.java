//  @eshutkarsharma
//  0047 Program to find maximum between two numbers using switch case.
import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num1, num2, choice;

      System.out.print("Enter the num1 : ");
      num1 = sc.nextInt();

      System.out.print("Enter the num2 : ");
      num2 = sc.nextInt();

      choice = num1>num2?0:(num1<num2?1:2);
      
      switch(choice)
      {
        case 0:
          System.out.println("Num 1 is Max "+num1);
          break;
        case 1:
          System.out.println("Num 2 is Max "+num2);
          break;
        case 2:
          System.out.println("Both Number are equal");
          break;
      }
    }
}