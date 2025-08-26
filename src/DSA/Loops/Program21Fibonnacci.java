package DSA.Loops;

import java.util.Scanner;

public class Program21Fibonnacci {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter limit of series");
        int n = sc.nextInt();

         int first = 0;
         int second = 1;
         int next ;
         for (int i = 0; i<=n; i++){
             System.out.println(first+" ");

             next = first + second;
             first = second;
             second = next;
         }

    }
}
