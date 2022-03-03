import java.util.Scanner;
import java.lang.Math;
public class CoinFlipProject {

	
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int max = 2;
        int min = 1;
        int range = max - min + 1;
		int tailsCounter = 0;
		int headsCounter = 0;
		int correctCount = 0;
		int numberOfFlips = 0;
		

		System.out.println("Guess which will have more - heads or tails?:");
		String headsOrTailsGuess = scnr.nextLine();
		
		
		
		System.out.println("How many times shall we flip the coin?");
		System.out.println("Input answer as a whole number only:");
		
		int loop = scnr.nextInt();
		
		for (int i = 0; i < loop; i++) {
            int rand = (int)(Math.random() * range) + min; 
            
            if (rand <= 1) {
            	tailsCounter++;
            	numberOfFlips++;
            	System.out.println("tails");
            } else { 
            	headsCounter++;
            	numberOfFlips++;
            System.out.println("heads");
            }
            if (headsOrTailsGuess.equals("heads")) {
            	correctCount = headsCounter;
            	
            } else  {
            	correctCount = tailsCounter;
            } 

		
            scnr.close();
		
	}
		
			
		System.out.println("Your guess, " + headsOrTailsGuess + ", came up " + correctCount + " times.");
		System.out.println("Thats " + correctCount * 100 / numberOfFlips + "%");

		
}}
