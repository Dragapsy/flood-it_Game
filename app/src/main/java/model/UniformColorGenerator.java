package model;

import javafx.scene.paint.Color;

import java.util.Random;

public class UniformColorGenerator implements ColorGenerator{

    private Color color;

    //code of color generator found on stackOverFlow;
    // link : https://stackoverflow.com/questions/4246351/creating-random-colour-in-java
    // but the color constructor with 3 parameter is not public, so I checked in the documentation of Color, and
    // I found that there is a constructor with 4 parameter that is public since java 8;
    // Link of the doc : https://docs.oracle.com/javase/8/javafx/api/javafx/scene/paint/Color.html
    @Override
   public Color nextColor(Cell cell) {
//        Random rand = new Random();
//        double red = rand.nextFloat();
//        double green = rand.nextFloat();
//        double blue = rand.nextFloat();
//        double opacity=rand.nextFloat();
//        Color randomColor = new Color(red, green, blue,opacity);
//        cell.setColor(randomColor);
//        return randomColor;
        return this.color;
    }
   
}
