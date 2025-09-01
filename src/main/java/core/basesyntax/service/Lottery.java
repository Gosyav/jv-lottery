package core.basesyntax.service;

import core.basesyntax.model.Ball;
import core.basesyntax.model.Color;
import java.util.Random;

public class Lottery {
    private static final int MAX_NUMBER = 100;
    private Color color = new ColorSupplier().getRandomColor();
    private int number = new Random().nextInt(MAX_NUMBER);

    public Ball getRandomBall() {
        return new Ball(color, number);
    }
}
