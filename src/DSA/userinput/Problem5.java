package DSA.userinput;

import java.util.Scanner;

//User input
public class Problem5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x");
        int x = sc.nextInt();

        System.out.println("Enter value of y");
        int y = sc.nextInt();

        System.out.println("Sum: "+ (x+y));
        System.out.println("Difference: "+ (x-y));
        System.out.println("Product: "+ (x*y));
        System.out.println("Quotient: "+ (x/y));
        System.out.println("Remainder : "+ (x%y));

        sc.close();
    }
}
