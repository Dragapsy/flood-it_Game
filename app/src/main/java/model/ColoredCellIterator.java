package model;

import javafx.scene.paint.Color;

import java.awt.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ColoredCellIterator implements Iterator<Cell> {
    private Color color;
    private Set<Cell> visitedCells;
    private Set<Cell> pendingCells;
    private Cell startCell;


    public ColoredCellIterator(Cell startCell){
        this.startCell=startCell;
        visitedCells=new HashSet<>();
        this.pendingCells=new HashSet<>();
        this.pendingCells.add(startCell);
        this.color = startCell.getColor();

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Cell next() {
        return null;
    }
}
