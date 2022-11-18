package model;

import javafx.scene.paint.Color;

public class Flooder {

    public static void flood(Cell startCell, Color floodingColor){
        ColoredCellIterator myCell = new ColoredCellIterator(startCell);

        while (myCell.hasNext()) {
            myCell.next().setColor(floodingColor);
        }
    }

    public static int coloredArea(Cell startCell){
        ColoredCellIterator cell = new ColoredCellIterator(startCell);

        int numberOfCellColored = 0;
        while (cell.hasNext()) {
            cell.next();
            numberOfCellColored++;
        }

        return numberOfCellColored;
    }










}
