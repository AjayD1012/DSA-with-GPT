package DSA.Loops;

import java.util.Scanner;

public class Program16ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();

        int reverse = 0;
        int digit;

        while (number!= 0){
            digit = number %10;
            reverse =reverse *10+digit;
            number = number/10;
            System.out.println(reverse);
        }
        System.out.println("Reversed number is :"+reverse);
    }

}
