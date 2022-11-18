package model;

import javafx.scene.paint.Color;

public class UniformExceptOneGenerator implements ColorGenerator{
    private Color uniColor;
    private Color excepColor;


    public UniformExceptOneGenerator(Color uniformColor, Color exceptionColor){
        this.uniColor=uniformColor;
        this.excepColor=exceptionColor;
    }
    @Override
    public Color nextColor(Cell cell) {
        return null;
    }
}
