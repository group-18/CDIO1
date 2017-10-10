package spil;

public class Player {
    private String name;
    private int score;
    int faceValue;
    int lastRoll;

    public Player(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void addScore(int faceValue) {
        this.score = this.score + faceValue;
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

    public void setLastRoll() {
        this.lastRoll = faceValue;
    }

}
