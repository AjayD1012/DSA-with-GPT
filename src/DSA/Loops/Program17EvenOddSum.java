package DSA.Loops;

import java.util.Scanner;

public class Program17EvenOddSum {

    // In this program we add even and odd digits sepereately of a given number
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        int evenSum =0;
        int oddSum =0;
        int digit;

        while (num!=0)
        {
            digit = num %10;
            if (digit % 2==0){
                evenSum = evenSum+digit;

            } else if (digit % 2 !=0) {
                oddSum = oddSum + digit;
            }
            num=num/10;
        }
        System.out.println("Sum of even digits :"+evenSum);
        System.out.println("Sum of odd digits"+oddSum);
    }
}
