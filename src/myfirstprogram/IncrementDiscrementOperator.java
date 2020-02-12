
package myfirstprogram;




public class IncrementDiscrementOperator {
    public static void main(String[] args) {
        
        int x = 55;
        int y;
        
        y = --x;    //54
        System.out.println("Number is :"+y);
        y =--x;    //53
        System.out.println("Number is :"+y);
        y = --x;    //52
        System.out.println("Number is :"+y);
        y = x++;    //52
        System.out.println("Number is :"+y);
        y = x++;    //53
        System.out.println("Number is :"+y);
        y = --x;    //53
        System.out.println("Number is :"+y);
        y = x++;    //53
        System.out.println("Number is :"+y);
        y = x--;    //54
        System.out.println("Number is :"+y);
        y = x++;    //53
        System.out.println("Number is :"+y);
        y = ++x;    //55
        System.out.println("Number is :"+y);
        
    }
    
    
}
