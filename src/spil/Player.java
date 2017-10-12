package spil;

public class Player {
    private String name;
    private int score;
    private int lastRoll;

    public Player(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void addScore(int sum) {
        this.score = this.score + sum;
    }

    public void setScore(int points)
    {
        score=points;
    }

    public int getScore(){
        return this.score;
    }

    public int resetScore() {
        this.score = 0;
        return this.score;
    }

    public int getLastRoll() {
        return lastRoll;
    }

    public void setLastRoll(int faceValue) {
        this.lastRoll = faceValue;
    }

    public String youWin(){
        String win;
        win = getName() + " har vundet spillet med " + getScore() +" point.";
        return win;
    }

}
