package model;

import javafx.scene.paint.Color;
import util.RandomUtil;

import java.util.List;
import java.util.Random;

public class RandomColorGenerator implements ColorGenerator{

    List<Color> colorList;
    Random random;
    private RandomUtil randomUtil;


    public RandomColorGenerator(List<Color> colors , Random randomGenerator) {
        colorList = colors;
        random = randomGenerator;
    }
    @Override
    public Color nextColor(Cell cell) {
        return randomUtil.randomElement(colorList,random);
    }
}
