package com.mycompany.l4q5;

import java.util.Scanner;

public class finallybruh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("You want to enter how many number?: ");
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;
        int sum1=0 , sum2=0;
        for (int i = 0; i < num; i++) {
            System.out.println("Enter number: ");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                even++;
                sum1 += number;
            }else{
                odd++;
                sum2 += number;
            }


        }
        System.out.println("You entered " + even +" even number with the sum of " + sum1);
        System.out.println("You entered " + odd +" odd number with the sum of " + sum2);
    }
}
