import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100);

        int right = 0;
        int guesss;

        while (right < 5){
            System.out.print("Guess the number: ");
            guesss = scanner.nextInt();

            if(guesss < 0 || guesss > 99){
                System.out.println("Please enter an integer between 0 and 100.");
                continue;
            }else if(guesss == number){
                System.out.println("Congratrs! You guessed the number correctly. The number was " + number + ".");
                break;
            }else if(guesss > number){
                System.out.println(guesss + " is bigger than the number.");
            } else{
                System.out.println(guesss + " is less than the number.");
            }
            right++;
        }
    }
}
