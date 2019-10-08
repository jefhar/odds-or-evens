package us.jeffharris.oddsorevens;

import java.util.Scanner;

public class OddsOrEvens {

  private static final Scanner sc = new Scanner(System.in);
  private static int wins = 0;
  private static int losses = 0;

  public static void main(String[] args) {
    String playerName = getPlayerName();
    playGame(playerName);
    System.out.print(
        "Thank you for playing, " + playerName + ". After " + (wins + losses) + " games, you won "
            + wins + " games.");
    System.out.printf("That gives you a record of %.2f%%.", wins * 100 / (float) (wins + losses));
  }

  private static void playGame(String playerName) {
    boolean playAgain;
    do {
      Game game = new Game(playerName);
      boolean isWinner = game.isPlayerWinner();
      addStats(isWinner);
      printStats();
      playAgain = shallWePlayAGame();
    } while (playAgain);
  }

  private static boolean shallWePlayAGame() {
    System.out.println("Shall we play again? [Y] to play again, [N or Q] to quit.");
    String choice = sc.next();
    return choice.equalsIgnoreCase("y");
  }

  private static void printStats() {
    System.out.println("Your record is " + wins + " and " + losses + ".");
  }

  private static void addStats(boolean isWinner) {
    if (isWinner) {
      wins++;
    } else {
      losses++;
    }
  }

  private static String getPlayerName() {
    String playerName;

    System.out.println(
        "Let's play a game called \"Odds Or Evens\". You will choose 'Odds' or 'Evens'. ");
    System.out.println(
        "Then we will both \"throw\" fingers from one hand into the center. If the sum of ");
    System.out.println(
        "the total fingers is odd, the player who chose 'Odds' wins, and if the sum of the ");
    System.out.println("total fingers is even, the player who chose 'Evens' wins.\n");
    do {
      System.out.print("What is your name? ");
      playerName = sc.nextLine();
    } while (playerName.length() == 0);

    return playerName;
  }

}