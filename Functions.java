import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class Functions {
    AsciArt graphics = new AsciArt();
    Scanner scanner = new Scanner(System.in);

    int playerScore;
    int computerScore;
    int scoreToWin;

    public void welcome() {

        System.out.println("Welcome to rock-paper-scissors game!");
        System.out.println("Please select how much points need to reach to win");
        this.scoreToWin = scanner.nextInt();
        System.out.println("You chosen " + scoreToWin + "points to win");
        System.out.println("Prepare !");

    }

    public char gameUserTurn() {
        System.out.println("Your turn! chose r for rock, p for paper or s for scissors!");
        char userChose = scanner.next().toLowerCase().charAt(0);
        if (userChose == 'r') {
            System.out.println("Player use ROCK");
            System.out.println(graphics.rock);
        } else if (userChose == 'p') {
            System.out.println("Player use PAPER");
            System.out.println(graphics.paper);
        } else if (userChose == 's') {
            System.out.println("Player use SCISSORS");
            System.out.println(graphics.scissors);
        } else {
            System.out.println("please type r for rock, p for paper or s for scissors!");
            return 0;
        }
        return userChose;

    }

    public int gameComputerTurn() {
        int computerChose = (int) (Math.random() * 3);
        if (computerChose == 0) {
            System.out.println("Computer use  ROCK");
            System.out.println(graphics.rock);
        } else if (computerChose == 1) {
            System.out.println("Computer use PAPER ");
            System.out.println(graphics.paper);
        } else {
            System.out.println("Computer use SCISSORS");
            System.out.println(graphics.scissors);
        }

        return computerChose;
    }

    public void checkScore(char u, int c) {

        if (u == 'r' && c == 0) {
            System.out.println("draw");
            System.out.println("Player score : " + " " + playerScore + " computer score " + computerScore);

        } else if (u == 'r' && c == 1) {
            System.out.println("player lose");
            computerScore += 1;
            System.out.println("Player score : " + " " + playerScore + " computer score " + computerScore);

        } else if (u == 'r' && c == 2) {
            System.out.println("player win");
            playerScore += 1;
            System.out.println("Player score : " + " " + playerScore + " computer score " + computerScore);

        } else if ((u == 'p' && c == 0)) {
            System.out.println("player win");
            playerScore += 1;
            System.out.println("Player score : " + playerScore + " computer score " + computerScore);

        } else if ((u == 'p' && c == 1)) {
            System.out.println("draw");
            System.out.println("Player score : " + playerScore + " computer score " + computerScore);

        } else if (u == 'p' && c == 2) {
            System.out.println("player lose");
            computerScore += 1;
            System.out.println("Player score : " + playerScore + " computer score " + computerScore);

        } else if (u == 's' && c == 0) {
            System.out.println("player lose");
            computerScore += 1;
            System.out.println("Player score : " + playerScore + " computer score " + computerScore);

        } else if (u == 's' && c == 1) {
            System.out.println("player win");
            playerScore += 1;
            System.out.println("Player score : " + playerScore + " computer score " + computerScore);

        } else {
            System.out.println("draw");
            System.out.println("Player score : " + playerScore + " computer score " + computerScore);
        }
    }

    public boolean isGameFinished() {
        if (playerScore >= scoreToWin) {
            System.out.println("Game Over PLAYER WIN!");
            return true;
        } else if (computerScore >= scoreToWin) {
            System.out.println("Game Over COMPUTER WIN!");
            return true;
        }

        return false;
    }
}
