
package myfirstprogram;

import java.util.Scanner;


public class MyFirstProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    double selcious,far;
    
    System.out.print("Enter selcious :");
    selcious = input.nextDouble();
    far = 1.8 *selcious + 32;
        System.out.println("fathenight = "+far);
        
     
    }
    
}
