package model;

import javafx.scene.paint.Color;

import java.util.Random;

public class UniformColorGenerator implements ColorGenerator{

    private Color color;


    @Override
   public Color nextColor(Cell cells) {

        return this.color;

    }
   
}
