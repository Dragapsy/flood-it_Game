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
        List<Cell> neighbours = cell.getNeighbours();
        for (Color color : this.colors) {
            boolean cellNotUsed = true;
            for (Cell newCell : neighbours) {
                if (color==newCell.getColor())
                { cellNotUsed = false; }
            }
            if (cellNotUsed == true) {
                return color;
            }
        }
        return this.defaultColor;
    }
}

