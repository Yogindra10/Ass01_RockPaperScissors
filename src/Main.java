import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        //Variables
        String playerA = "";
        String playerB = "";
        boolean checkA = false;
        boolean checkB = false;
        String playAgain ="";
        boolean cont2 = false;

        Scanner scan = new Scanner(System.in);

        //Inputs
        do {
            do {
                System.out.println("Player A, Pick A Move (R, P, or S)");

                if (scan.hasNextLine()) {
                    playerA = scan.nextLine();

                    if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                        checkA = true;
                    } else {
                        System.out.println("Error.");
                    }
                } else {
                    System.out.println("Error");
                }
            } while (!checkA);

            do {
                System.out.println("Player B, Pick A Move (R, P, or S)");

                if (scan.hasNextLine()) {
                    playerB = scan.nextLine();

                    if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                        checkB = true;
                    } else {
                        System.out.println("Error.");
                    }
                } else {
                    System.out.println("Error");
                }
            } while (!checkB);

            //outputs
            if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Tie");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Paper Covers Rock, Player B Wins!");
                } else {
                    System.out.println("Rock breaks Scissors, Player A Wins!");
                }

            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper Covers Rock, Player A Wins!");
                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Tie");
                } else {
                    System.out.println("Scissors Cuts Paper, Player B Wins!");
                }
            } else {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Rock breaks Scissors, Player B Wins!");

                } else if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissor Cuts Paper, Player A Wins!");

                } else {
                    System.out.println("Tie");
                }
            }



            do {
                System.out.println("Do you want to Play Again? [Y/N]");
                if (scan.hasNextLine()) {
                    playAgain = scan.nextLine();

                    if (playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")) {
                        cont2 = true;
                    } else {
                        System.out.println("Error");
                    }
                }
            }while (!cont2);
        }while(playAgain.equalsIgnoreCase("Y"));

        System.out.println("Game Over");
    }
}