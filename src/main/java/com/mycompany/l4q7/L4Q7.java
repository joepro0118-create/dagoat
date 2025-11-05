/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l4q7;

import java.util.Scanner;

/**
 *
 * @author Joe
 */
public class L4Q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        int p = sc.nextInt();
        System.out.println("Enter interest %: ");
        double i= sc.nextDouble();
       
        System.out.println("Enter total number of month(s): ");
        int N = sc.nextInt();
        System.out.println("Month\t\tMonthly Payment\t\tPrincipal\t\tInterest\t\tUnpaid Balance\t\tTotal Interest");
        int  n = 1;
        double M = (p*i/((double)12*100))/(1-(Math.pow(1+i/((double)12*100), -N)));
        String M_print = String.format("%.2f", M);
        
        double total = 0;
        while (n <= N){
            double c = M * (Math.pow(1+ i/(12*100),-(1+N-n)));
            double L = M-c;
            double R = L/(i/(12*100)) - c;
            total = total + L;
            
            String c_print = String.format("%.2f", c);
            String L_print = String.format("%.2f", L);
            String R_print = String.format("%.2f", R);
            String total_print = String.format("%.2f", total);
            
            System.out.println(n +"\t\t"+ M_print + "\t\t\t" + c_print+ "\t\t\t" +L_print+ "\t\t\t" +R_print+"\t\t\t"+total_print );
            n++;
        }
    }
}
