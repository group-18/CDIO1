package spil;

public class Player {
    private String navn;
    private int score;

    public Player(String navn){
        this.navn=navn;
    }

    public String getName(){
        return this.navn;
    }

    public int addScore(int faceValue) {
        this.score = this.score + faceValue;
    }

    public int getScore(){
        return this.score;
    }

    public int resetScore() {
        this.score = 0;
        return this.score;
    }
}
