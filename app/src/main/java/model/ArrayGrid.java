package model;

import java.util.ArrayList;
import java.util.List;


public class ArrayGrid implements Grid{

    private Cell [][] cells;
    private int numberOfRows;
    private int numberOfColumns;


    public ArrayGrid(int numberOfRows, int numberOfColumns) throws Exception{
            if(numberOfRows <= 0 || numberOfColumns <= 0){ throw new IllegalArgumentException("taille nulle ou négative");}
            this.numberOfRows = numberOfRows;
            this.numberOfColumns = numberOfColumns;
            this.cells = new Cell[numberOfRows][numberOfColumns];
            for (int i = 0; i < numberOfRows; i++){
                for (int j = 0; j < numberOfColumns; j++){
                    cells[i][j] = new SquareCell();
                }
            }

            for (int i = 0; i < numberOfRows; i++) {
                for (int j = 0; j < numberOfColumns; j++) {
                    calculateNeighbours(i,j);
                }
            }

        }
    public void calculateNeighbours( int rowIndex, int columnIndex){
        List<Cell> neighbours = new ArrayList<>();
        if (rowIndex==0){ neighbours.add(getCell(rowIndex+1,columnIndex));}
        else if (rowIndex<this.getNumberOfRows()-1) {
            neighbours.add(getCell(rowIndex-1,columnIndex));
            neighbours.add(getCell(rowIndex+1,columnIndex));
        }

        if (rowIndex==this.getNumberOfRows()-1){  neighbours.add(getCell(rowIndex-1,columnIndex)); }


        if (columnIndex==0){ neighbours.add(getCell(rowIndex,columnIndex+1));}
        else if (columnIndex<this.getNumberOfColumns()-1 ) {
            neighbours.add(getCell(rowIndex,columnIndex-1));
            neighbours.add(getCell(rowIndex,columnIndex+1));
        }
        if (columnIndex==this.getNumberOfColumns()-1){ neighbours.add(getCell(rowIndex,columnIndex-1));}


        getCell(rowIndex,columnIndex).setNeighbours(neighbours);

    }




    @Override
    public Cell getCell(int row, int column) {
        return this.cells[row][column];
    }

    @Override
    public int getNumberOfRows() {
        return this.numberOfRows;
    }

    @Override
    public int getNumberOfColumns() {
        return this.numberOfColumns;
    }

    @Override
    public void color(ColorGenerator colorGenerator) {
        for (int i=0; i<this.numberOfRows;i++){
            for(int j=0; j<this.numberOfColumns;j++){
                colorGenerator.nextColor(cells[i][j]);
            }
        }
    }


=======
>>>>>>> origin/main
}
