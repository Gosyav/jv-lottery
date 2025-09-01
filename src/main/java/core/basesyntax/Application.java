package core.basesyntax;

import core.basesyntax.model.Ball;
import core.basesyntax.service.Lottery;

public class Application {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();

        for (int i = 0; i < 3; i++) {
            Ball ball = lottery.getRandomBall();
            System.out.println(ball);
        }
    }
}
