package spil;

public class Dice {
    private int faceValue;
    private final int MAX=6;

    public Dice()
    {
        faceValue = 1;
    }

    //Math.random creates random integers from 1 - 6
    public void roll()
    {
        faceValue = (int)(Math.random() * MAX) +1;
    }

    //Sets the face value
    public void setFaceValue(int value)
    {
        faceValue=value;
    }

    //Gets the face value using the setFaceValue method
    public int getFaceValue()
    {
        return faceValue;
    }
}
