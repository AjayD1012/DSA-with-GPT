package DSA.Loops;

import java.util.Scanner;

public class Program12factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
// using for  loop
        int fact = 1; // Always start with one

        for (int i =1; i<=num; i++){

            fact = fact * i;
        }
        System.out.println("Factorial of "+num +" Is "+fact);
    }
}
