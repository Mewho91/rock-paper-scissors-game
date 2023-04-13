import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Functions fc = new Functions();

        fc.welcome();
        while (true) {
            if (!fc.isGameFinished()) {
                fc.checkScore(fc.gameUserTurn(), fc.gameComputerTurn());
            } else {
                break;
            }

        }
    }
}
