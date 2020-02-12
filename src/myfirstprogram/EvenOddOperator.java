
package myfirstprogram;

import java.util.Scanner;

public class EvenOddOperator {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        System.out.print("Enter Any Number :");
        number = input.nextInt();
        
        if (number%2==0){
            
            System.out.println("Number is Even");

        }
        
        else{
            System.out.println("Number is Odd ");
         }
    }
}
