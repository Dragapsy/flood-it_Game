package model;

import javafx.scene.paint.Color;

import java.util.List;

public class CyclicColorGenerator implements ColorGenerator{

    private List<Color> colors;
    private int counter=1;

    public CyclicColorGenerator(List<Color> colors){
        this.colors = colors;
    }
    @Override
    public Color nextColor(Cell cell) {
        if(counter >= this.colors.size()){
            counter=0;
        }

        Color newColor = this.colors.get(counter);
        counter++;
        return newColor;
    }
}
