package model;

import javafx.scene.paint.Color;

import java.util.List;
import java.util.Random;

public class RandomColorGenerator implements ColorGenerator{

    List<Color> colorList;
    Random random;

    public RandomColorGenerator(List<Color> colors , Random randomGenerator) {
        colorList = colors;
        random = randomGenerator;
    }
    @Override
    public Color nextColor(Cell cell) {
        return null;
    }
}
