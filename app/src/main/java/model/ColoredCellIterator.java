package model;

import javafx.scene.paint.Color;
import util.SetUtil;

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
        boolean expression=!(this.pendingCells.isEmpty());
        return expression;
    }

    @Override
    public Cell next() {
        Cell Cell = SetUtil.anyElement(this.pendingCells);
        this.pendingCells.remove(Cell);
        this.visitedCells.add(Cell);
        for (Cell neighbour : Cell.getNeighbours()){
            if (Cell.getColor() == neighbour.getColor() && !(this.visitedCells.contains(neighbour))){
                this.pendingCells.add(neighbour);
            }
        }
        return Cell;    }
}
