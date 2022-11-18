package model;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CellGridIterator implements Iterator<Cell> {

    ArrayGrid arrayGrid;
    private int rowIndex,columnIndex;

    private Cell [][]cells;
    public CellGridIterator(ArrayGrid grid) {
        arrayGrid=grid;
        cells=grid.cells;
        rowIndex =0;
        columnIndex=0;
    }


    @Override
    public boolean hasNext() {
        if(rowIndex+1== cells.length){
            return columnIndex<cells[rowIndex].length;
        }
        return rowIndex< cells.length;
    }

    @Override
    public Cell next() {
        if(columnIndex==cells[rowIndex].length)
        {
            columnIndex=0;
            rowIndex++;
        }
        if(rowIndex== cells.length&& columnIndex==cells[rowIndex].length){
            throw new NoSuchElementException();
        }
        return cells[rowIndex][columnIndex++];
    }
}

