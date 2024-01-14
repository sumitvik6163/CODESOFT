package codesoft.NumberGame;

import java.util.*;

public class NumberGame {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int max = 100;
      int min = 1;
      int range = max-min+1;
      int randomValue = (int)(Math.random()*range)+min;
      
      do {
          int count=0;
          for(int i = 0; i < 3; i++){
            System.out.println("Please Gusse a number between 1 to 100 : ");
        int number = sc.nextInt();
        if(number == randomValue){
          System.out.println("\n Congrates! Your Gusse is Correct\n");
          count++;
        }
        else if(number < randomValue){
          System.out.println("\n Sorry! Your Gusse is To Low\n");
        } 
        else if(number > randomValue){
          System.out.println("\n Sorry! Your Gusse is To High\n");
        } 
      }
      System.out.println("\nYour Score is : "+count);
      System.out.println("\nDo you want to play again press 0 ");
      }while(sc.nextInt() == 0);
      System.out.println("\n********Game Over*********");
  }
}

