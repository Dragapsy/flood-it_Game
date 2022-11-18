package model;

import javafx.scene.paint.Color;

public class ComputerPlayer implements Player{
    private String name;
    private Cell StartCell;
    private SquareCell cell;

    public Color play(){

        return cell.getColor();
    }
    @Override
    public boolean isHuman() {
        return false;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Cell getStartCell() {
        return this.StartCell;
    }
}
