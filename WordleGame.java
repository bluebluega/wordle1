import java.util.*;

public class WordleGame {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Puzzle puzzle = new Puzzle ("party");
        instructions();
        
        
        while(puzzle.isUnsolved() && puzzle.gameNotOver()){
            System.out.print("\nMake a guess: " + puzzle.getGuess());
            System.out.print(puzzle.getWord());
            String guess = scanner.nextLine().toUpperCase();
            puzzle.evaluate(guess);
        }
        
        if(puzzle.gameNotOver()){
            System.out.println("You win!");
        } else {
            System.out.println("You lose! The word was " + puzzle.getWord());
        }
    }

    public static void instructions(){
        System.out.println("WELCOME TO THE GAME OF WORDLE! \n");
        System.out.println("Instructions:");
        System.out.println("You have 6 chances to guess a 5 letter word. \nEach guess must be an existing 5 letter word");
        System.out.println("\"?\" = the letter is NOT part of the word.");
        System.out.println("\"*\" = the letter is part of the word but is in the wrong location.");
        System.out.println("\"!\" = the letter is part of the word AND is in the correct location. \n");
    }
}
