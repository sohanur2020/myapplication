
package myfirstprogram;

public class SwitchMethord {
    
    public static void main(String[] args) {
        
       int x = 6;
       switch (x){
           case 3:
               System.out.print("Three");
               break;
           case 4:
               System.out.print("Four");
               break;
           case 6:
               System.out.println(""+x);
               break;
           default:
               System.out.println("Nothing");
           break;
       }
    }
    
}
