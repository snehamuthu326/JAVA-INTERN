
import java.util.*;

class game 
{

    public static void main(String[] args) 
    {
	System.out.println("**********************************************");
        System.out.println("Welcome to Number Game");
	System.out.println("**********************************************");

        int g;
        int tries = 0;
        char play = ' ';
        int score;
        int total = 0;
        Scanner in = new Scanner(System.in);
        do {
            double b = Math.random() * 101;
            int a = (int) (b);
            System.out.println("Guess the number between 1 to 100 within 10 tries");
            do {
                System.out.print("Enter the number guess: ");
                g = in.nextInt();
                if (g < a) {
                    System.out.println("Too low !!");
                } else if (g > a) {
                    System.out.println("Too high !!");
                }
                ++tries;
            } while (g != a && tries <= 10);

            if (g == a) {
                System.out.println("Congratulations !! you found it");
            } else {
                System.out.println("Random Number is " + a);
            }
            score = (10 - tries) * 10;
	    System.out.println("**********************************************");
            System.out.println("Your Score is " + score);
	    System.out.println("**********************************************");
            System.out.print("Do you want to playAgain(y/n): ");
            play = in.next().charAt(0);
            tries = 0;
            total += score;
        } while (play == 'y');

        System.out.println("Your Total Score is " + total);
    }
}
