package DSA.Loops;

import java.util.Scanner;

public class Program18ProductOfdigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();

        int product = 1;
        int digit;

        while (num!=0){

            digit = num%10;
            product = product *digit;
            num = num/10;
        }
        System.out.println("The product of all digits in a numer is :"+ product);
    }
}
