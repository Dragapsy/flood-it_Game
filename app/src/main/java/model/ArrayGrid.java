package model;

public class ArrayGrid implements Grid{

    private Cell [][] cells;
    private int numberOfRows;
    private int numberOfColumns;


    public ArrayGrid(int numberOfRows,int numberOfColumns){
        this.numberOfColumns=numberOfColumns;
        this.numberOfRows=numberOfRows;
        if(numberOfRows==0 | numberOfRows<0 | numberOfColumns==0 | numberOfRows<0 | numberOfColumns<0)  {
            throw new IllegalArgumentException("numberOfRows or numberOfColumns can't be equal to zero or a negative value");
        }
        else {
            this.cells=new Cell[numberOfRows][numberOfColumns];
            Cell cell=new SquareCell();
            for (int i=0; i<numberOfRows;i++){
                for(int j=0; j<numberOfColumns;j++){
                    cells[i][j]=cell;
                }
            }

        }
    }



    @Override
    public Cell getCell(int row, int column) {
        return null;
    }

    @Override
    public int getNumberOfRows() {
        return 0;
    }

    @Override
    public int getNumberOfColumns() {
        return 0;
    }

    @Override
    public void color(ColorGenerator colorGenerator) {
        for (int i=0; i<this.numberOfRows;i++){
            for(int j=0; j<this.numberOfColumns;j++){
                colorGenerator.nextColor(cells[i][j]);
            }
        }
    }
}
