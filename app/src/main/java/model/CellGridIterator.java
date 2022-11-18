package model;

import java.util.Iterator;
public class CellGridIterator implements Iterator<Cell> {

    ArrayGrid arrayGrid;
    private int rowIndex,columnIndex;

    private Cell [][]cells;
    public CellGridIterator(ArrayGrid grid) {
        arrayGrid=grid;
        cells=grid.cells;
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
