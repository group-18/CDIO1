package spil;
import java.util.Scanner;
public class Game {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        int totalscore = 40;
        int p1Totalscore = 0;
        int p2Totalscore = 0;
        boolean p1orp2 = true;

        System.out.println("Indtast spiller 1 navn");
        String a = scanner.nextLine();

        System.out.println("Indtast spiller 2 navn");
        String b = scanner.nextLine();

        Player p1 = new Player(a);
        Player p2 = new Player(b);

        System.out.println("Spiller 1: " + p1.getName());
        System.out.println("Spiller 2: " + p2.getName());

        Dice d1 = new Dice();
        Dice d2 = new Dice();

        while (p1Totalscore < totalscore && p2Totalscore < totalscore)
        {
            if (p1orp2 == true) {
                System.out.println(p1.getName() + "'s tur, tast" + " \"roll\" " + "for at kaste terningen");
            }
            else {
                System.out.println(p2.getName() + "'s tur, tast" + " \"roll\" " + "for at kaste terningen");
            }
            String svar = scanner.next();

            if (svar.equalsIgnoreCase("roll"))
            {
                d1.roll(); d2.roll();

                System.out.println("Du slog " + d1.getFaceValue() + " og " + d2.getFaceValue());

                int sum1 = d1.getFaceValue() + d2.getFaceValue();

                System.out.println ("Summen af dit slag er " + sum1);

                if (p1orp2 == true) {
                    // Gem i player 1
                    p1Totalscore = p1Totalscore + sum1;
                    p1orp2 = false;
                } else {
                    // Gem i player 2
                    p2Totalscore = p2Totalscore + sum1;
                    p1orp2 = true;
                }

                System.out.println ("Stillingen er nu:");
                System.out.println (p1.getName() + " totalscore er: " + p1Totalscore);
                System.out.println (p2.getName() + " totalscore er: " + p2Totalscore);
            }
        }
        if (p1Totalscore> p2Totalscore)
        {
            System.out.println("Player 1 har vundet spillet og har: " + p1Totalscore + " point");
        }
        else
        {
            System.out.println("Player 2 har vundet spillet og har: " + p2Totalscore + " point");
        }

    }
}
