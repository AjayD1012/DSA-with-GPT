package DSA.Loops;

import java.util.Scanner;

public class Program19StrongNumber {
    // Strong number means addition of factorial of each digit total equals to the original number
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();
        int originalnumber = num;
         int sum=0;
        int digit ;

        while (num!=0){
            digit = num %10;

            // factorial
            int fact =1;
            for (int i =1; i<=digit; i++){
                fact = fact * i;
            }
            sum = sum+fact;
              num = num/10;
        }
            if (sum == originalnumber){
                System.out.println("Its a Strong number");
            }else System.out.println("It is not a Strong number...");


    }
}
