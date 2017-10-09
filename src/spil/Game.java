package spil;
import java.util.Scanner;
public class Game {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();
        String b = scanner.nextLine();

        Player p1 = new Player(a);
        Player p2 = new Player(b);

        System.out.println(p1.getName());
        System.out.println(p2.getName());
    }
}
