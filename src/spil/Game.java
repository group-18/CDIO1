package spil;
import java.util.Scanner;
public class Game {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        int totalscore = 40;

        //Bruges til at afgøre om det er spiller 1 eller spiller 2's tur, spiller1=true og spiller2=false
        boolean p1orp2 = true;

        System.out.println("Indtast spiller 1 navn");
        String a = scanner.nextLine();

        System.out.println("Indtast spiller 2 navn");
        String b = scanner.nextLine();

        //Opretter to spillere med navne efter brugerens indtastning.
        Player p1 = new Player(a);
        Player p2 = new Player(b);

        System.out.println("Spiller 1: " + p1.getName());
        System.out.println("Spiller 2: " + p2.getName());

        //Laver to objekter af klassen Dice
        Dice d1 = new Dice();
        Dice d2 = new Dice();

        while (p1.getScore() <= totalscore && p2.getScore() <= totalscore )
        {
            if (p1orp2 == true) {
                System.out.println(p1.getName() + "'s tur, tast" + " \"roll\" " + "for at kaste terningen");
            }
            else {
                System.out.println(p2.getName() + "'s tur, tast" + " \"roll\" " + "for at kaste terningen");
            }
            String svar = scanner.next();

            //Brugeren skal taste roll for at programmet fortsætter
            if (svar.equalsIgnoreCase("roll")) {
                d1.roll();
                d2.roll();

                //Tager summen af de to terninger
                int sum1= d1.getFaceValue()+d2.getFaceValue();

                System.out.println("Du slog " + d1.getFaceValue() + " og " + d2.getFaceValue());

                //Sørger for kravet med at par 1 skal nulstille spillerens score
                if (d1.getFaceValue()==d2.getFaceValue() && d1.getFaceValue()==1 && p1orp2==true) {
                    p1.resetScore();
                }
                else if (d1.getFaceValue()==d2.getFaceValue() && d1.getFaceValue()==1 && p1orp2==false){
                    p2.resetScore();
                }
                else {
                    System.out.println("Summen af dit slag er " + sum1);

                    //Breaker while løkken hvis dette slag er par 6 og sidste slag var par 6
                    if (sum1 == 12 && p1.getLastRoll() == 12 || sum1==12 && p2.getLastRoll()==12) {
                        break;
                    } else {

                        if (p1orp2 == true && d1.getFaceValue() != d2.getFaceValue()) {
                            // Gem i player 1
                            p1.addScore(sum1);
                            p1orp2 = false;
                        } else if (p1orp2 == true && d1.getFaceValue() == d2.getFaceValue()) {
                            //Giver player1 ekstra tur hvis han slog et par
                            p1.addScore(sum1);
                            p1.setLastRoll(sum1);
                            p1orp2 = true;
                        } else if (p1orp2 == false && d1.getFaceValue() != d2.getFaceValue()) {
                            // Gem i player 2
                            p2.addScore(sum1);
                            p1orp2 = true;
                        } else if (p1orp2 == false && d1.getFaceValue() == d2.getFaceValue()) {
                            //Giver player2 ekstra tur hvis han slog et par
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
            //Holder spilleren i while løkken så længe han ikke laver et par
            if (p1.getScore()>totalscore && d1.getFaceValue()!=d2.getFaceValue()) {
                p1.setScore(40);
                System.out.println ("Du har nået over 40 point, slå et par for at vinde!");
            }
                else if (p2.getScore()>totalscore && d1.getFaceValue()!=d2.getFaceValue()){
                    p2.setScore(40);
                System.out.println ("Du har nået over 40 point, slå et par for at vinde!");
                }
            }

            //Giver forskellig vinder besked alt efter om man har vundet ved at slå par 6 to gange i træk
            //eller om man har vundet ved at slå et par og have over 40 point.
        if (p1.getScore() >= totalscore && d1.getFaceValue() == d2.getFaceValue() && p1orp2==true) {
            System.out.println(p1.getName() + " har vundet ved at slå par " + d1.getFaceValue());
        }
        else if (p2.getScore() >= totalscore && d1.getFaceValue() == d2.getFaceValue() && p1orp2==false){
            System.out.println(p2.getName() + " har vundet ved at slå par " + d1.getFaceValue());
        }
        else if (d1.getFaceValue()+d2.getFaceValue() == 12 && p1.getLastRoll() == 12) {
            System.out.println(p1.getName() + " har slået par 6 to gange i træk og har dermed vundet!");
        }
        else if (d1.getFaceValue()+d2.getFaceValue()==12 && p2.getLastRoll()==12){
            System.out.println(p2.getName() + " har slået par 6 to gange i træk og har dermed vundet!");
        }
        }
    }

