package math.problems;

import java.util.Scanner;

public class Factorial {

    //   Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
    //   Write a java program to find Factorial of a given number using Recursion as well as Iteration.

    public static long fact(long n){
        if (n==1) {
            return 1;

        }
            else{
                return n*fact(n-1);
            }
        }


    public static void main(String[] args) {
     long number;
     long fact=1;
     long  fact1;

Scanner sc=new Scanner(System.in);
        System.out.println("enter an integer");
        number=sc.nextInt();
        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("\n the factorial of "+number+ " is"+" "+number+"!"+"="+fact);


        fact1=Factorial.fact(number);
        System.out.println("factorial with recursion method is "+fact1);

    }
}
