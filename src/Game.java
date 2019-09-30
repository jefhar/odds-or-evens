import java.util.Random;
import java.util.Scanner;

class Game {

  private Scanner sc;
  private String playerName;
  private String player;
  private String computer;
  private int playerFingers;
  private int computerFingers;

  Game() {
    sc = new Scanner(System.in);
    // sc.useDelimiter(System.lineSeparator());
  }

  void introduction() {
    System.out.println("Let's play a game called \"Odds and Evens\"");
    getPlayerName();

    getPlayerChoice();
    System.out
        .println(playerName + " has picked " + player + "! The computer will be " + computer + ".");
  }

  private void getPlayerName() {
    System.out.print("What is your name? ");
    playerName = sc.next();
    System.out.println(playerName);
  }

  private void getPlayerChoice() {
    boolean validChoice = false;
    do {
      System.out.print("Hi " + playerName + ", which do you choose? (O)dds or (E)vens? ");
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
    } while (!validChoice);
  }

  void part2() {
    System.out.print("How many \"Fingers\" do you put out? ");
    playerFingers = sc.nextInt();
    Random rand = new Random();
    computerFingers = rand.nextInt(6);
    System.out.println("The computer plays " + computerFingers + " \"fingers\".");
  }

  void part2a() {
    int sum = playerFingers + computerFingers;
    System.out.println(playerFingers + " + " + computerFingers + " = " + sum);
    boolean isEven = sum % 2 == 0;
    System.out.print(sum + " is ...");
    if (isEven) {
      System.out.println("even!");
      if (player.equalsIgnoreCase("evens")) {
        System.out.println("That means that " + playerName + " wins! :)");
      } else {
        System.out.println("That means that computer wins! :)");
      }
    } else {
      System.out.println("odd!");
      if (player.equalsIgnoreCase("odds")) {
        System.out.println("That means that " + playerName + " wins! :)");
      } else {
        System.out.println("That means that computer wins! :)");
      }
    }
  }
}