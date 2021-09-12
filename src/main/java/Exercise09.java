/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Magdalena Sobrino-Almanzar
 */

import java.util.Scanner;
import java.lang.*;

public class Exercise09 {

        public static void main(String[] args){

            double conversionFactor = 350;
            int length = 0, width = 0;
            int squareFeet;
            double gallons;
            Scanner scnr = new Scanner(System.in);

            System.out.println("What is the length of the room in feet?");
            length = scnr.nextInt();
            System.out.println("What is the width of the room in feet?");
            width = scnr.nextInt();

            squareFeet = length * width;

            gallons = squareFeet / conversionFactor;

            System.out.println("You will need to purchase " + (int) Math.ceil(gallons) + " gallons of paint to cover " + squareFeet + " square feet.");

            
            System.exit(0);
        }//end of main
    }//end of program




