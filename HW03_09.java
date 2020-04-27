/*
Author: Fatima Parada-Taboada
Net id: fnp170130
Program overview: This program calculates the checksum of and ISBN-id using the first 9 digits of the ISBN.
*/ 


import java.util.Scanner;

public class Hw03_09 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int d1,d2,d3,d4,d5,d6,d7,d8,d9,d10;

    System.out.print("Enter the first 9 digits of an ISBN as integer: ");
    int isbn = input.nextInt();

    d1 = isbn / 100000000;
    numsLeft = isbn % 100000000;
    d2 = isbn / 10000000;
    numsLeft = isbn % 10000000;
    d3 = isbn / 1000000;
    numsLeft = isbn % 1000000;
    d4 = isbn / 100000;
    numsLeft = isbn % 100000;
    d5 = isbn / 10000;
    numsLeft = isbn % 10000;
    d6 = isbn / 1000;;
    numsLeft = isbn % 1000;
    d7 = isbn / 100;
    
    numsLeft = isbn % 100;
    d8 = isbn / 10;
    numsLeft = isbn % 10;
    d9 = numsLeft;


    d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

    System.out.printLn("The ISBN-10 number is " + d1 + d2 + d3 + d4 + d5 + d6 + d6 + d7 + d8 + d9);
    
    if(d10 == 10)
    {
    System.out.printLn("X");  
    }
    else{
      System.out.printLn(d10);
    }
  
  }
}