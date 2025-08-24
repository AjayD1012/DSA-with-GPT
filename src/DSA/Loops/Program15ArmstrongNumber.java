package DSA.Loops;

import java.util.Scanner;

public class Program15ArmstrongNumber {
    public static void main(String[] args) {
        // 153 = 1+125+27 = 153

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int original_number = number; // perserving the original number value

        int sum =0;
        int digit ;

        while (number!=0){
            digit = number %10;
            sum = sum + (digit*digit*digit);
            number = number/10;

        }

        if (sum == original_number){
            System.out.println("This is Armstrong Number");
        }
        else System.out.println("Not a Armstrong number");



    }
}
