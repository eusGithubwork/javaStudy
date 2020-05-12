//solution given by : surbhi Garg
// 0026 Program to add 5 and 7 without using (+,-) operator.

public class Code{
    public static void main(String []args){
        int a=5;
        int b=7;
        int sum;
        int carry;
        System.out.println("1st no.   : 5");
        System.out.println("2nd no. : 7");

        sum = a^b;
        carry = a&b;
        carry = carry<<1;
        a=sum;
        b=carry;

        sum = a^b;
        carry = a&b;
        carry = carry<<1;
        a=sum;
        b=carry;

        sum = a^b;
        carry = a&b;
        carry = carry<<1;
        a=sum;
        b=carry;
        
        System.out.println("sum = "+sum);
    }
}