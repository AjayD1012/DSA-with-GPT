package DSA.controlflow;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        // If-else using odd even program

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        if (num % 2 ==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
