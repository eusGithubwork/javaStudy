// @eshutkarsharma
// 0060(j)
//     **
//    ****
//   ******
//  ********
// **********
// **********
//  ********
//   ******
//    ****
//     **
import java.util.Scanner;

public class Code {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n;
      System.out.print("Entre n : ");
      n = sc.nextInt();

      for(int i=1; i<=n*2; i++)
      {
        int x = i>n?n-(i-n-1):i;
        
        for(int j=1; j<=n+x; j++)
          if(n-x<j)
            System.out.print("*");
          else
            System.out.print(" ");

        System.out.println();
      }
    }
} 