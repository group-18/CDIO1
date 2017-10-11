package spil;
import java.util.Scanner;
public class Game {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        int totalscore = 40;

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

        while (p1.getScore() < totalscore && p2.getScore() < totalscore)
        {
            if (p1orp2 == true) {
                System.out.println(p1.getName() + "'s tur, tast" + " \"roll\" " + "for at kaste terningen");
            }
            else {
                System.out.println(p2.getName() + "'s tur, tast" + " \"roll\" " + "for at kaste terningen");
            }
            String svar = scanner.next();

            if (svar.equalsIgnoreCase("roll")) {
                d1.roll();
                d2.roll();

                System.out.println("Du slog " + d1.getFaceValue() + " og " + d2.getFaceValue());

                if (d1.getFaceValue()==d2.getFaceValue() && d1.getFaceValue()==1 && p1orp2==true) {
                    p1.resetScore();
                }
                else if (d1.getFaceValue()==d2.getFaceValue() && d1.getFaceValue()==1 && p1orp2==false){
                    p2.resetScore();
                }
                else {

                    int sum1 = d1.getFaceValue() + d2.getFaceValue();

                    System.out.println("Summen af dit slag er " + sum1);

                    if (sum1 == 12 && p1.getLastRoll() == 12 || sum1==12 && p2.getLastRoll()==12) {
                        break;
                    } else {

                        if (p1orp2 == true && d1.getFaceValue() != d2.getFaceValue()) {
                            // Gem i player 1
                            p1.addScore(sum1);
                            p1orp2 = false;
                        } else if (p1orp2 == true && d1.getFaceValue() == d2.getFaceValue()) {
                            p1.addScore(sum1);
                            p1.setLastRoll(sum1);
                            p1orp2 = true;
                        } else if (p1orp2 == false && d1.getFaceValue() != d2.getFaceValue()) {
                            // Gem i player 2
                            p2.addScore(sum1);
                            p1orp2 = true;
                        } else if (p1orp2 == false && d1.getFaceValue() == d2.getFaceValue()) {

                            p2.addScore(sum1);
                            p2.setLastRoll(sum1);
                            p1orp2 = false;
                        }
                    }
                }
                System.out.println ("Stillingen er nu:");
                System.out.println (p1.getName() + " totalscore er: " + p1.getScore());
                System.out.println (p2.getName() + " totalscore er: " + p2.getScore());
            }
        }
        int sum1= d1.getFaceValue()+d2.getFaceValue();
        if (sum1 == 12 && p1.getLastRoll() == 12 || sum1==12 && p2.getLastRoll()==12) {
            System.out.println("Du har slået par 6 to gange i træk og har dermed vundet!");
        }
        else {
            if (p1.getScore() > p2.getScore()) {
                System.out.println(p1.getName() + " har vundet spillet med: " + p1.getScore() + " point");
            } else {
                System.out.println(p2.getName() + " har vundet spillet med: " + p2.getScore() + " point");
            }
        }
    }
}
