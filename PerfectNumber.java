package com.bridgelabz.logicalprogram;
import java.util.*;
public class PerfectNumber {
	public static void main(String[] args) {

        int num, sum = 0;
        
        System.out.println("Enter a number");
            
        Scanner scanner = new Scanner(System.in);
        num =scanner.nextInt();
        if (num > 0) {

          for (int i = 1; i < num; i++) {
            if ( num % i == 0) {
                sum = sum + i;
            }
        }
    
          if ( sum == num) {
              System.out.println(num + " is a perfect number ");

          } else  {
              System.out.println (num + " is not a perfect number ");
          }
            
       }   else {
                
            System.out.println (" Please enter positive number ");
       }
   }
    
}
