
package guessing.games;

import java.util.Scanner;


public class GuessingGames {

    
    public static void main(String[] args) {
               Scanner sc = new Scanner(System.in);
   
      System.out.println("Input number: ");
      int x = sc.nextInt();
      
      System.out.println("Input desired number between 1 - 1000: ");
      int k = sc.nextInt();
      
      System.out.println("Hint: ");
      
if (x % 2 == 0){
    System.out.println("The number is even");
}
else {
    System.out.println("The number is odd");
}

do{ 
    if (k < x){
        System.out.println("Higher Value!:");
        k = sc.nextInt();
    }
    else if (k > x){
        System.out.println("Lower Value:");
        k = sc.nextInt();
    }
}
    
     while (k != x);
  System.out.println("you got it");
}
}
      
    
    

