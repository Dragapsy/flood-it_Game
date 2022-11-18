package model;

import javafx.scene.paint.Color;

import java.util.List;

public class DistinctColorGenerator implements ColorGenerator {
    private List<Color> colors;
    private Color defaultColor;

    public DistinctColorGenerator(List<Color> colors, Color defaultColor) {

        this.colors = colors;
        this.defaultColor = defaultColor;
    }
    @Override
    public Color nextColor(Cell cell) {
        return null;
    }
}
