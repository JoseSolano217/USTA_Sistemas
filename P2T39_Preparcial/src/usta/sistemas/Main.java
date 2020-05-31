package usta.sistemas;

public class Main {
public static int[][] votes = new int[8][123];
public static String[] parties = {"liberal", "Conservador", "Alianza verde", "La U", "cambio radical", "Centro democrático", "MIRA", "Polo"};
public static int winner_X;
public static int loser_X;
    public static void main(String[] args) {
        // José Solano
        // 21/05/2020
        // This is yet another vote thing
        menu();
        int[] total = ran_n_total();
        for (int i = 0; i < votes.length; i++) {
            System.out.print("\nThe \"" + parties[i] + "\" party got " + total[i] + " votes");
        }
        winner_X = winnah(total);
        System.out.println("\nThe winner party is " + parties[winner_X]);
    }
    public static void menu() {
        // We're doomed
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║            Combia            ║");
        System.out.println("║             v3.0             ║");
        System.out.println("║          José Solano         ║");
        System.out.println("╚══════════════════════════════╝");
        System.out.println("\"THOSE ASSHOLES STOLE THE MONEY OF THE COUNTRY\"");
    }
    public static int[] ran_n_total() {
        int[] ret = new int[votes.length];
        for (int i = 0; i < votes.length; i++) {
            for (int f = 0; f < votes[i].length; f++) {
                votes[i][f] = (int) Math.floor(Math.random()*(1000)+1);
                ret[i] += votes[i][f];
            }
        }
        return ret;
    }
    public static int winnah(int[] a) {
        int ret = 0;
        for (int i = 0; i < votes.length; i++) {
                if (ret < a[i]) {
                    ret = i;
                }
        }
        return ret;
    }

}
