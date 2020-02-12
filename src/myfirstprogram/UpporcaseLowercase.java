
package myfirstprogram;

import java.util.Scanner;


public class UpporcaseLowercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char ch = 0;
        System.out.println("Enter Any character  :");
        ch = input.next().charAt(0);
        
        if(ch == 'a'){
            System.out.print("The Chanracter is Vaoul");
        }
        else if(ch=='e'){
            System.out.print("The Character is Vaoul");
        }
        else if(ch=='i'){
            System.out.print("The Character is Vaoul");
        }
        else if(ch=='o'){
            System.out.print("The Character is Vaoul");
        }
        else if(ch=='u'){
            System.out.print("The Character is Vaoul");
        }
        else{
        System.out.println("The Character Is Consonent");
        }
    }
}
