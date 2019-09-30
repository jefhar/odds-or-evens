public class OddsAndEvens {

  public static void main(String[] args) {
    Game Game = new Game();
    Game.introduction();
    border(40);
    Game.part2();
    border(40);
    Game.part2a();
    border(40);
  }

  private static void border(int border) {
    System.out.println();
    for (int i = 0; i < border; i++) {
      System.out.print("-");
    }
    System.out.println();
  }
}