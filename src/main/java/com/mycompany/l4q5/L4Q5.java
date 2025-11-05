/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.l4q5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Joe
 */
public class L4Q5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("2 player dice game if one of the player get more than a 100 point, they win");
        int decider = 0;
        int counter1 = 0 , counter2 = 0;
        int random1, random2;
        int max = 6 , min = 1;
        boolean smtg = true ;
        while (decider != 1){
            System.out.print("player 1 please press 0 to roll your dice: ");
            int enter = sc.nextInt();
            if (enter != 0) {
                smtg = false;
            }
            while ( smtg == false){
                System.out.print("Try again: ");
                enter = sc.nextInt();
                if (enter == 0){
                    smtg = true;
                }
            }
            random1 = random.nextInt(max - min + 1)+ min;
            counter1 += random1;
            System.out.println("You get : "+random1);
            System.out.println("Your score now is "+ counter1);
            System.out.println("");
            
            if(counter1 >= 10){
                System.out.println("");
                System.out.println("Player 1 win");
                decider = 1;
                continue;
            }
            
            
            
            System.out.print("player 2 please press 0 to roll your dice: ");
            enter = sc.nextInt();
            if (enter != 0) {
                smtg = false;
            }
            while ( smtg == false){
                System.out.print("Try again: ");
                enter = sc.nextInt();
                if (enter == 0){
                    smtg = true;
                }
            }
            random2 = random.nextInt(max - min +1)+ min;
            counter2 += random2;
            System.out.println("You get : "+random2);
            System.out.println("Your score now is "+ counter2);
            System.out.println("");
            
            if(counter2 >= 10){
                System.out.println("");
                System.out.println("Player 2 win");
                decider = 1;
                
                
            }
            System.out.println("hel");
                
            } 
            
            
    }
        
}

