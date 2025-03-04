package febuary.task;

import java.util.Scanner;

public class task7_interviewQA
{
    /*
    * FizzBuzz Problem
    *write a program that print number from 1 to 100
    * However,for multiples of 3,print "Fizz" instead of the number,
    * and for multiples of 5, print "Buzz",
    * for number that all multiples of both 3 and 5
    * print "FizzBuzz"
     */

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Entere the number ");
        int num=sc.nextInt();

        for(int i=1;i<=100;i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println("FizzBuzz");
            }
            else if(i%3==0)
            {
                System.out.println("Fizz");
            }
            else if(i%5==0)
            {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

}
