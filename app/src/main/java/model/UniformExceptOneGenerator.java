package model;

import javafx.scene.paint.Color;

public class UniformExceptOneGenerator implements ColorGenerator{
    private Color uniColor;
    private Color excepColor;

    private int counter=0;



    public UniformExceptOneGenerator(Color uniformColor, Color exceptionColor){
        this.uniColor=uniformColor;
        this.excepColor=exceptionColor;
    }
    @Override
    public Color nextColor(Cell cell) {
        counter++;
        if(counter==2){
            return this.uniColor;
        }
        return this.excepColor;    }
}
