import java.util.Random;
import java.util.Scanner;

public class Game {

  Scanner sc;
  private String playerName;
  private String player;
  private String computer;
  private int playerFingers;
  private int computerFingers;
  private boolean oddOrEven;

  public Game() {
    sc = new Scanner(System.in);
    player = "odds";
    computer = "evens";
  }

  public void part1() {
    System.out.println("Let's play a game called \"Odds and Evens\"");
    System.out.print("What is your name? ");
    playerName = sc.next();
    System.out.print("Hi " + playerName + ", which do you choose? (O)dds or (E)vens? ");
    String choice = sc.next();
    if (choice.equalsIgnoreCase("e")) {
      player = "evens";
      computer = "odds";
    }
    System.out
        .println(playerName + " has picked " + player + "! The computer will be " + computer + ".");
  }

  public void part2() {
    System.out.print("How many \"Fingers\" do you put out? ");
    playerFingers = sc.nextInt();
    Random rand = new Random();
    computerFingers = rand.nextInt(6);
    System.out.println("The computer plays " + computerFingers + " \"fingers\".");
  }

  public void part2a() {
    int sum = playerFingers + computerFingers;
    System.out.println(playerFingers + " + " + computerFingers + " = " + sum);
    oddOrEven = sum % 2 == 0;
    System.out.print(sum + " is ...");
    if (oddOrEven) {
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