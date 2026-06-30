import java.util.Scanner;
import java.util.Random;
public class rockPaperScissors {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to rock, paper, scissors!\n\n");
        String choices[] = {"rock","paper","scissors"};
        // Setting up the game(s)
        boolean firstWin;
        boolean secondWin;
        boolean thirdWin;
        boolean win;
        Scanner inp=new Scanner(System.in);
        Random rand=new Random();
        int randomIndex=rand.nextInt(3);
        String systemChoice=choices[randomIndex];
        // Preparing the first round
        System.out.println("Round 1:\n");
        // User input
        System.out.print("You choose: ");
        String userChoice = inp.nextLine();
        // Done with user input
        
        // Now to do condition checking:
        // Rock first
        if(userChoice.equals(systemChoice)) {
            firstWin=false;
            System.out.println("It\'s a draw!");
        }
        else if(userChoice.equals("rock") && systemChoice.equals("paper")) {
            firstWin=false;
            System.out.println("You lost! The computer chose "+systemChoice+" and you chose "+userChoice);
            
        }
        else if(userChoice.equals("rock") && systemChoice.equals("scissors")) {
            firstWin=false;
            System.out.println("You lost! The computer chose "+systemChoice+" and you chose "+userChoice);
        }
        // Now paper
        else if(userChoice.equals("paper") && systemChoice.equals("rock")) {
            firstWin=true;
            System.out.println("You won! The computer chose "+systemChoice+" and you chose "+userChoice);
        }
        else if(userChoice.equals("paper") && systemChoice.equals("scissors")) {
            firstWin = false;
            System.out.println("You lost! The computer chose "+ systemChoice+" and you chose "+userChoice);
        }
        //now scissors
        else if(userChoice.equals("scissors") && systemChoice.equals("paper")) {
            firstWin=true;
            System.out.println("You won! The computer chose "+systemChoice+" and you chose "+userChoice);
        }
        else if(userChoice.equals("scissors") && systemChoice.equals("rock")) {
            firstWin=false;
            System.out.println("You lost! The computer chose "+systemChoice+" and you chose "+userChoice);
        }
        else {
            for(int i=0; i<15;i++) {
                try {
                    Thread.sleep(500);
                }
                catch(InterruptedException e) {
                    System.exit(1);
                }
                System.out.println("ERROR: unable to identify char[50] \'"+userChoice+"\' OS sends: \'Segmentation Fault\'\n\n");
            }
            System.out.println("Shutting down and returning NULL to OS...");
            try {
                Thread.sleep(2500);
            }
            catch(InterruptedException e) {
                System.exit(1);
            }
            System.exit(1);
        }
        //now round 2
        
        //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\
        
        randomIndex=rand.nextInt(3);
        String SystemChoice=choices[randomIndex];   
        // Preparing the second round
        System.out.println("Round 2:\n");
        // User input
        System.out.print("You choose: ");   
        String UserChoice = inp.nextLine();
        // Done with user input
        
        // Now to do condition checking:
        // Rock first
        if(UserChoice.equals(SystemChoice)) {
            secondWin=false;
            System.out.println("It\'s a draw!");
        }
        else if(UserChoice.equals("rock") && SystemChoice.equals("paper")) {
            secondWin=false;
            System.out.println("You lost! The computer chose "+SystemChoice+" and you chose "+UserChoice);
            
        }
        else if(UserChoice.equals("rock") && SystemChoice.equals("scissors")) {
            secondWin=false;
            System.out.println("You lost! The computer chose "+SystemChoice+" and you chose "+UserChoice);
        }
        // Now paper
        else if(UserChoice.equals("paper") && SystemChoice.equals("rock")) {
            secondWin=true;
            System.out.println("You won! The computer chose "+SystemChoice+" and you chose "+UserChoice);
        }
        else if(UserChoice.equals("paper") && SystemChoice.equals("scissors")) {
            secondWin = false;
            System.out.println("You lost! You chose "+UserChoice+" and the computer chose "+SystemChoice);
        }
        //now scissors
        else if(UserChoice.equals("scissors") && SystemChoice.equals("paper")) {
            secondWin=true;
            System.out.println("You won! The computer chose "+SystemChoice+" and you chose "+UserChoice);
        }
        else if(UserChoice.equals("scissors") && SystemChoice.equals("rock")) {
            secondWin=false;
            System.out.println("You lost! The computer chose "+SystemChoice+" and you chose "+UserChoice);
        }
        else {
            for(int i=0; i<15;i++) {
                try {
                    Thread.sleep(500);
                }
                catch(InterruptedException e) {
                    System.exit(1);
                }
                System.out.println("ERROR: unable to identify char[50] \'"+UserChoice+"\' OS sends: \'Segmentation Fault\'\n\n");
            }
            System.out.println("Shutting down and returning NULL to OS...");
            try {
                Thread.sleep(2500);
            }
            catch(InterruptedException e) {
                System.exit(1);
            }
            System.exit(1);
        }
        //Done with the second round
        
        //\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\//\\/\/
        
        // THIRD ROUND
        randomIndex=rand.nextInt(3);
        String systemchoice=choices[randomIndex];
        // Preparing the third round
        System.out.println("Round 3:\n");
        // User input
        System.out.print("You choose: ");
        String userchoice = inp.nextLine();
        // Done with user input
        
        // Now to do condition checking:
        // Rock first
        if(userchoice.equals(systemchoice)) {
            thirdWin=false;
            System.out.println("It\'s a draw!");
        }
        else if(userchoice.equals("rock") && systemchoice.equals("paper")) {
            thirdWin=false;
            System.out.println("You lost! The computer chose "+systemchoice+" and you chose "+userchoice);
            
        }
        else if(userchoice.equals("rock") && systemchoice.equals("scissors")) {
            thirdWin=false;
            System.out.println("You lost! The computer chose "+systemchoice+" and you chose "+userchoice);
        }
        // Now paper
        else if(userchoice.equals("paper") && systemchoice.equals("rock")) {
            thirdWin=true;
            System.out.println("You won! The computer chose "+systemchoice+" and you chose "+userchoice);
        }
        else if(userchoice.equals("paper") && systemchoice.equals("scissors")) {
            thirdWin = false;
            System.out.println("You lost! You chose "+userchoice+" and the computer chose "+systemchoice);
        }
        //now scissors
        else if(userchoice.equals("scissors") && systemchoice.equals("paper")) {
            secondWin=true;
            System.out.println("You won! The computer chose "+systemchoice+" and you chose "+userchoice);
        }
        else if(userchoice.equals("scissors") && systemchoice.equals("rock")) {
            thirdWin=false;
            System.out.println("You lost! The computer chose "+systemchoice+" and you chose "+userchoice);
        }
        else {
            for(int i=0; i<15;i++) {
                try {
                    Thread.sleep(500);
                }
                catch(InterruptedException e) {
                    System.exit(1);
                }
                System.out.println("ERROR: unable to identify char[50] \'"+userchoice+"\' OS sends: \'Segmentation Fault\'\n\n");
            }
            System.out.println("Shutting down and returning NULL to OS...");
            try {
                Thread.sleep(2500);
            }
            catch(InterruptedException e) {
                System.exit(1);
            }
            System.exit(1);
        }
    }
}
