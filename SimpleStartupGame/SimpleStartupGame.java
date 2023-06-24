package SimpleStartupGame;

import java.util.Random;
import java.util.Scanner;

class SimpleStartupGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        SimpleStartup game = new SimpleStartup();

        // int[] locations = {4,5,6};
        
        Random rand = new Random();
        int startLoc = rand.nextInt(5);

        int[] locations = new int[3];
        int count = 0;

        for (int i = startLoc; i < startLoc + 3; i++){
            locations[count] = i;
            count++;
            // System.out.println(i);
        }

        game.setLocationsCells(locations);
        
        int hitcount = 0;
        Scanner scanner = new Scanner(System.in);

        while (hitcount != 3) {
            System.out.println("Enter a number: ");
            int guess = scanner.nextInt();

            
            

        }
        scanner.close();
        
        
    }

}
