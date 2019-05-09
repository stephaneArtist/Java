package esgi;

import java.util.Random;

public class Dice {

    private int value;


    public Dice(){
        this.value = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void launch(){
        Random random = new Random();
        setValue(random.nextInt(6));
    }
}