public class OddsAndEvens {

    public static void main(String[] args) {
        Game game = new Game();
        game.part1();
        border(40);
        game.part2();
        border(40);
        game.part2a();
        border(40);
    }

    private static void border(int border) {
        for (int i = 0; i < border; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}