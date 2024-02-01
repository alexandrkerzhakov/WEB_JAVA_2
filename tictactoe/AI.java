package ru.gb.jcore.tictactoe;

import java.io.Serializable;
import java.util.Random;

public class AI extends Gamer implements Serializable {
    private final Random random;
    public AI(char ch) {
        super(ch);
        random = new Random();
    }

    @Override
    public void turn(Field field) {
        if (field.isGameOver()) {
            return;
        }
        while (true) {
            int x = random.nextInt(field.getSize());
            int y = random.nextInt(field.getSize());
            if (field.isCellValid(x, y)) {
                field.setDot(x, y, dot);
                break;
            }
        }
    }
}
