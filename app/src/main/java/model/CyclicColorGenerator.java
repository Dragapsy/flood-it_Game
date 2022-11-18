package model;

import javafx.scene.paint.Color;

import java.util.List;

public class CyclicColorGenerator implements ColorGenerator{

    private List<Color> colors;

    public CyclicColorGenerator(List<Color> colors){
        this.colors = colors;
    }
    @Override
    public Color nextColor(Cell cell) {
        return null;
    }
}
