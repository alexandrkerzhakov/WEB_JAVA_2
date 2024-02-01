package ru.gb.jcore.tictactoe;

public abstract class Gamer {
    char dot;

    protected Gamer() {

    }
    protected Gamer(char ch) {
        this.dot = ch;
    }

    public void turn(Field field) {

    }

    public void turn(int x, int y, Field field) {

    }

    public void turn(int x, int y, Field field, AI ai) {

    }

}
