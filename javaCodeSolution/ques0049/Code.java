// @eshutkarsharma
// 0049 Program to create Simple Calculator using switch case.
import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, result;
        char op_ch;

        System.out.print("Enter the num1 : ");
        num1 = sc.nextInt();

        System.out.print("Enter the num2 : ");
        num2 = sc.nextInt();

        System.out.print("Enter the operation (+ - * / %) : ");
        op_ch = sc.next().charAt(0);

        switch(op_ch){
          case '+':
            result = num1 + num2;
            System.out.print(num1+" "+op_ch+" "+num2+" = "+result);
            break;
          case '-':
            result = num1 - num2;
            System.out.print(num1+" "+op_ch+" "+num2+" = "+result);
            break;
          case '*':
            result = num1 * num2;
            System.out.print(num1+" "+op_ch+" "+num2+" = "+result);
            break;
          case '/':
            result = num1 - num2;
            System.out.print(num1+" "+op_ch+" "+num2+" = "+result);
            break;
          case '%':
            result = num1 - num2;
            System.out.print(num1+" "+op_ch+" "+num2+" = "+result);
            break;
          default:
            System.out.print("Invalid Operator");
        }
    }
}