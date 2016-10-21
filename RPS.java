import java.util.Random;
import java.util.Scanner;

public class RPS {

  private String[] choiceArray = {"rock", "paper", "scissor"};
  private String computerChoice;
  private String playerChoice;

  public void getComputerChoice() {
    System.out.println(choiceArray[0]);
  }

  public void getRandomComputerChoice() {
    int randomChoice = new Random().nextInt(choiceArray.length);
    computerChoice = choiceArray[randomChoice];
  }

  public void getPlayerChoice() {
    Scanner keyboard = new Scanner(System.in);
    playerChoice = keyboard.nextLine();
  }

  public void game () {
    System.out.println("The computer chose " + computerChoice + ". You chose " + playerChoice + ".");
    
    if (computerChoice.equals(playerChoice)) {
      System.out.println("You have tied with the computer");
    }

    else if (computerChoice.equals("rock") && playerChoice.equals("paper")) {
      System.out.println("You have won");
    }
    else if (computerChoice.equals("rock") && playerChoice.equals("scissor")) {
      System.out.println("You have lost");
    }

    else if (computerChoice.equals("paper") && playerChoice.equals("scissor")) {
      System.out.println("You have won");
    }
    else if (computerChoice.equals("paper") && playerChoice.equals("rock")) {
      System.out.println("You have lost");
    }

    else if (computerChoice.equals("scissor") && playerChoice.equals("rock")) {
      System.out.println("You have won");
    }
    else if (computerChoice.equals("scissor") && playerChoice.equals("paper")) {
      System.out.println("You have lost");
    }

  }

}