import java.util.Scanner;
import java.lang.Math;
import java.lang.Thread;
import java.lang.InterruptedException; 

class BarkPark {
  public static void main(String[] args) {
    System.out.println("How many levels in your parking deck?");
    Scanner scan = new Scanner(System.in);
    int numLevels = scan.nextInt();
    
    System.out.println("How many rows?");
    int numRows = scan.nextInt();
    
    System.out.println("How many columns?");
    int numCols = scan.nextInt();
    // prompts user 
    
    int [][][] parkingDeck = new int[numLevels][numRows][numCols];
    // function for printing 
    
      
    for (int l = 0; l < numLevels; l++) {
      for (int r = 0; r < numRows; r++) {
        for (int c = 0; c < numCols; c++) {
            parkingDeck[l][r][c] = 0;
            System.out.print("[" + parkingDeck[l][r][c] + "] ");
        } // for
        System.out.print("\n");
     } // for
    System.out.print("\n");
    } // for
    
    System.out.println("Enter Data Set."); 
    
    for (int l = 0; l < numLevels; l++) {
      int numSpotsLeft = 0;
      for (int r = 0; r < numRows; r++) {
        for (int c = 0; c < numCols; c++) {
            parkingDeck[l][r][c] = (int)Math.round(Math.random());
            if (parkingDeck[l][r][c] == 0) {
              numSpotsLeft++;
            } // if 
            System.out.print("[" + parkingDeck[l][r][c] + "] ");
        } // for
        System.out.print("\n");
      } // for
      System.out.println("Spots Left in Level " + (l + 1) + ": " + numSpotsLeft);
    System.out.print("\n");
    } // for
    // Would communicate with sensors
    // Is randomized for demonstration 

    try {
      int x = 0;
      while(x < 6) {
        System.out.println("TEXT CASE NUMBER - " + x);
        for (int l = 0; l < numLevels; l++) {
          int numSpotsLeft = 0;
          for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                parkingDeck[l][r][c] = (int)Math.round(Math.random());
                if (parkingDeck[l][r][c] == 0) {
                  numSpotsLeft++;
                } // if 
                System.out.print("[" + parkingDeck[l][r][c] + "] ");
            } // for
            System.out.print("\n");
          } // for
          System.out.println("Spots Left in Level " + (l + 1) + ": " + numSpotsLeft);
        System.out.print("\n");
        } // for    
        System.out.println();
        System.out.println();
        System.out.println();
        Thread.sleep(5000);        
        x++; 
      } // while
    } catch (InterruptedException ex) {
         ex.printStackTrace();
    } // try 
    // Added 5 second delay to replicate changing vacancies as time passes  
  }
} 
