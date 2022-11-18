package model;

public class HumanPlayer implements Player{

    private Cell startCell;
    private String name;


    public HumanPlayer(String name, Cell startCell){
        this.name=name;
        this.startCell=startCell;
    }

    public HumanPlayer(Cell startCell){
        this.startCell=startCell;
        this.name="player";
    }



    @Override
    public boolean isHuman() {
        return true;
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
        return this.startCell;
    }
}
