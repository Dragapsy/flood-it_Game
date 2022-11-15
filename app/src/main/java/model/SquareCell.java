package model;

import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SquareCell extends AbstractCell{

    List<Cell> neighbours;

    public SquareCell(){
        setColor(AbstractCell.DEFAULT_CELL_COLOR);
        setNeighbours(null);

    }
    public SquareCell( Color color){
        setColor(color);
        setNeighbours(null);

    }
    public SquareCell(Color color,List<Cell>neighbours){
        SquareCell Cell=new SquareCell(color);
        setNeighbours( neighbours);
    }


    /**
     * A cell is placed somewhere on a grid. Its neighbours thus depend on the underlying grid.
     *
     * @return the list of cell that are neighbours of this{@code Cell}.
     */
    @Override
    public List<Cell> getNeighbours() {
        return neighbours;
    }

    /**
     * Update the list of neighbours of this {@code Cell}.
     *
     * @param cells a list of cells that are the neighbours of this {@code cell}
     *              int the underlying grid.
     */
    @Override
    public void setNeighbours(List<Cell> cells) {
        if (cells==null){
            neighbours=new ArrayList<>();
        }
        else {

            neighbours=new ArrayList<>();
            for (Cell value:cells)
            {
                neighbours.add(value);
            }
        }

    }


}