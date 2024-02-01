package ru.gb.jcore.tictactoe;

import java.io.Serializable;

public class Human extends Gamer implements Serializable {
    public Human(char ch) {
        super(ch);
    }

    @Override
    public void turn(int x, int y, Field field) {
        if (field.isCellValid(x, y) && !field.isGameOver()) {
            field.setDot(x, y, dot);
        }
    }

}
