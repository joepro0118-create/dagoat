package com.mycompany.l4q5;

import java.util.Scanner;

public class finallybruh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("You want to enter how many number?: ");
        int num = sc.nextInt();
        int even = 0;
        int odd = 0;
        for (int i = 0; i < num; i++) {
            System.out.println("Enter number: ");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                even++;
            }else
                odd++;

        }
        System.out.println("You entered " + even +" even number");
        System.out.println("You entered " + odd +" odd number");
    }
}
