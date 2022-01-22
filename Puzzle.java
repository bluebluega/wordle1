import java.util.*;

public class Puzzle{

    private String word;
    private String guess;
    private int numGuesses=0;
    private int numCorrectGuesses=0;

    public Puzzle(String w){
        word = w.toUpperCase();
        guess = "";
    }

    public boolean gameNotOver(){
        return numGuesses<6;
    }

    public boolean isUnsolved(){
        return numCorrectGuesses<5;
    }

    public void evaluate(String g){
        numCorrectGuesses=0;
        if(g.length()!=5){
            System.out.println("Guess must be 5 letters. Try again");
        } else{
            numGuesses++;
            System.out.println("\nGuess #" + numGuesses);
            for(int i=0; i<g.length(); i++){
                String wLetter = word.substring(i, i+1);
                String gLetter = g.substring(i, i+1);

                if(wLetter.equals(gLetter)){
                    numCorrectGuesses++;
                    System.out.print(gLetter + "! ");
                } else if(!wLetter.equals(gLetter) && word.contains(gLetter)){
                    System.out.print(gLetter + "* ");                
                } else {
                    System.out.print(gLetter + "? "); 
                }
            } 
        }

        System.out.println();
    }

    public String getWord(){
        return word;
    }

    public String getGuess(){
        return guess;
    }

}