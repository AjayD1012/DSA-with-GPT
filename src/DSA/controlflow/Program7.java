package DSA.controlflow;

import java.util.Scanner;

public class Program7 {
//    Grade program using if else

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of student out of 100");
        int marks = sc.nextInt();
        
        if (marks >= 90){
            System.out.println("A");
        } else if (marks <=89 && marks >=75) {
            System.out.println("B");
        } else if (marks <=74 && marks >=50) {
            System.out.println("C");
        } else if (marks >=35 && marks <=49) {
            System.out.println("D");
        } else if (marks<35) {
            System.out.println("Fail");

        }
    }
}
