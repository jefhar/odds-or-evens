import java.util.Random;
import java.util.Scanner;

class Game {

  private final String playerName;
  private final Scanner sc = new Scanner(System.in);
  private String player;
  private String computer;
  private int playerFingers;
  private int computerFingers;
  private boolean playerWins;
  private int maxFingers = 5;

  Game(String playerName) {
    this.playerName = playerName;
    if (playerName.equals("Uncle Fester")) {
      maxFingers = 6;
    }
    getPlayerChoice();
    getPlayerFingers();
    gameResult();
  }

  boolean isPlayerWinner() {
    return playerWins;
  }

  private void getPlayerChoice() {
    boolean validChoice = false;
    do {
      System.out.print("\nHi " + playerName + ", which do you choose? (O)dds or (E)vens? ");

      String choice = sc.next();
      choice = choice.charAt(0) + "";
      if (choice.equalsIgnoreCase("e")) {
        validChoice = true;
        player = "evens";
        computer = "odds";
      }
      if (choice.equalsIgnoreCase("o")) {
        validChoice = true;
        player = "odds";
        computer = "evens";
      }
      if (!validChoice) {
        System.out.println("Sorry, I did not get your request. Please select 'O' or 'E'");
      }
    } while (!validChoice);
    System.out
        .println(playerName + " has picked " + player + "! The computer will be " + computer + ".");

  }

  private void getPlayerFingers() {
    do {
      System.out.print("\nHow many \"Fingers\" do you put out? ");
      playerFingers = sc.nextInt();
      if (playerFingers < 1 || playerFingers > maxFingers) {
        System.out.println("You may only play from 1 to " + maxFingers + " fingers.");
      }
    } while (playerFingers < 1 || playerFingers > maxFingers);
    Random rand = new Random();
    computerFingers = rand.nextInt(maxFingers - 1);
    System.out.println("The computer plays " + computerFingers + " \"fingers\".");
  }

  private void gameResult() {
    playerWins = false;
    int sum = playerFingers + computerFingers;
    System.out.print(playerFingers + " + " + computerFingers + " = " + sum + ", which is ");
    boolean isEven = sum % 2 == 0;
    if (isEven) {
      System.out.println("even!");
    } else {
      System.out.println("odd!");
    }
    playerWins = (isEven && player.equalsIgnoreCase("evens") || (!isEven && player
        .equalsIgnoreCase("odds")));
    printWinner(playerWins);
  }

  private void printWinner(boolean playerIsWinner) {
    if (playerIsWinner) {
      System.out.println("That means that " + playerName + " wins! :)");
    } else {
      System.out.println("That means that computer wins! :)");
    }
  }
}