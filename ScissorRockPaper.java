
import java.util.Scanner;

public class ScissorRockPaper {
    public static void main(String[] args) {

        int computerWin = 0;
        int userWin = 0;

        while (!(computerWin == 2 || userWin == 2)) {

            Scanner input = new Scanner(System.in);
            System.out.println("#####################################################################");
            System.out.println("You win " + userWin + " times, Computer win " + computerWin + " times");
            System.out.print("Please wirte 0, 1, or 2 number. scissor(0), rock(1), paper(2): ");
            int enterNumber = input.nextInt();

            int randomNum = (int)(Math.random() * 3); 
            switch (enterNumber) {
                case 0:
                    if (randomNum == 1) {
                        System.out.println("The computer is rock. You lose");
                        computerWin++;
                        break;
                    } else if (randomNum == 2) {
                        System.out.println("The computer is paper. You win");
                        userWin++;
                        break;
                    } else {
                        System.out.println("The computer is scissor. You are scissor too. It is draw");
                        break;
                    }
                case 1:
                    if (randomNum == 0) {
                        System.out.println("The computer is scissor. You win");
                        userWin++;
                        break;
                    } else if (randomNum == 2) {
                        System.out.println("The computer is paper. You lose");
                        computerWin++;
                        break;
                    } else {
                        System.out.println("The computer is rock. You are rock too. It is draw");
                        break;
                    }
                case 2:
                    if (randomNum == 0) {
                        System.out.println("The computer is scissor. You lose");
                        computerWin++;
                        break;
                    } else if (randomNum == 1) {
                        System.out.println("The computer is rock. You win");
                        userWin++;
                        break;
                    } else {
                        System.out.println("The computer is paper. You are paper too. It is draw");
                        break;
                    }
                default:
                    System.out.println("Error");
            }
        }
        if (userWin > computerWin) {
            System.out.println("You win " + userWin + " times");
        } else {
            System.out.println("Computer win " + computerWin + " times");
        }
    }
}