package core.basesyntax.service;

import core.basesyntax.model.Color;
import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        int index = new Random().nextInt(Color.values().length);
        Color color = Color.values()[index];

        return color;
    }
}
