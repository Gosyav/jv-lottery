package core.basesyntax.service;

import core.basesyntax.model.Ball;
import core.basesyntax.model.Color;
import java.util.Random;

public class Lottery {
    public Ball getRandomBall() {
        Color color = new ColorSupplier().getRandomColor();
        int number = new Random().nextInt(100);

        return new Ball(color, number);
    }
}
