package DSA.Loops;

import java.util.Scanner;

public class Program20PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        // perfect number means sum of divisors is == number

        int sum = 0;

        for (int i =1; i<num; i++)
        {
            if (num % i ==0){
                sum = sum+i;
            }

        }
        if (sum  == num){
            System.out.println("It is a PERFECT number");
        }else System.out.println("It is not a PERFECT number");

    }
}
