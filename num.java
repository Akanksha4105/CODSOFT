import java.util.Random;
import java.util.Scanner;

public class num{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int totalscore = 0;
        boolean playagain = true;
        System.out.println("!!!Welcome to the NUMBER GUESSING GAME!!!");
        while(playagain){
            int numberguess = rand.nextInt(100)+ 1;
            int attempts=0;
            int maxattempts=7;
            boolean correctguess=false;
            System.out.println("I have choosen a number between 1 and 100");
            System.out.println("you have " + maxattempts +  " attempts to guess it");
            System.out.println("!!LET'S START THE GAME!!");
            while (attempts< maxattempts) {
                System.out.println("Enter your guess:");
                int userguess=sc.nextInt();
                attempts++;
                if (userguess==numberguess){
                    System.out.println("CORRECT! You guessed the number in " +attempts+ " attempts");
                    correctguess =true;
                    totalscore +=(maxattempts-attempts+1);
                    break;
                }
                else if (userguess > numberguess){
                    System.out.println("Too High! try again...");
                }
                else{
                    System.out.println("Too Low! try again...");
                }
            }
            if (!correctguess){
                System.out.println("OUT OF ATTEMPTS.. The correct number was: "+ numberguess);
            }
            System.out.println("Your current score is " + totalscore);
            System.out.println("Do you want to play again?(yes/no)");
            String choice= sc.next().toLowerCase();
            playagain = choice.equals("yes");
        }
        System.out.println("Game over! your final score is " + totalscore);
        sc.close();
    }
}