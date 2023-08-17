import java.util.Scanner;
import java.util.Random;

public class Rock_Paper_Sc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String play = "YES";
        while (play.equals("YES")) {
            Random r = new Random();
            int rnd_num = r.nextInt(3);
            int ch = -1;
            while (ch != rnd_num) {
                System.out.println("Enter your choice \n0 for Rock \n1 for Paper \n2 for Scissor");
                ch = scan.nextInt();
                if (ch == 0 && rnd_num == 1) {
                    System.out.println("You Lost \nYour choice = Rock \nDevice's choice = Paper");
                } else if (ch == 0 && rnd_num == 2) {
                    System.out.println("You Won \nYour choice = Rock \nDevice's choice = Scissor");
                    break;
                } else if (ch == 1 && rnd_num == 2) {
                    System.out.println("You Lost \nYour choice = Paper \nDevice's choice = Scissor");
                } else if (ch == 1 && rnd_num == 0) {
                    System.out.println("You Won \nYour choice = Paper \nDevice's choice = Rock");
                    break;
                } else if (ch == 2 && rnd_num == 0) {
                    System.out.println("You Lost \nYour choice = Scissor \nDevice's choice = Rock");
                } else if (ch == 2 && rnd_num == 1) {
                    System.out.println("You Won \nYour choice = Scissor \nDevice's choice = Paper");
                    break;
                } else if (ch == 0 && rnd_num == 0) {
                    System.out.println("Tie \nChoice = Rock");
                } else if (ch == 1 && rnd_num == 1) {
                    System.out.println("Tie \nChoice = Paper");
                } else if (ch == 2 && rnd_num == 2) {
                    System.out.println("Tie \nChoice = Scissor");
                } else {
                    System.out.println("Enter valid choice");
                }
            }
            System.out.println("Play Again? -- Yes/No");
            play = scan.next().toUpperCase();
        }
    }
}
