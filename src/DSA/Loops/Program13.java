package DSA.Loops;

import java.util.Scanner;

public class Program13 {

    // Total digits in a number
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int count =0;
        while (num !=0){
            num = num /10;
            count++;
        }
        System.out.println(count);
    }
}
