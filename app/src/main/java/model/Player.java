package model;

public interface Player {
    boolean isHuman();
    void setName(String name);
    String getName();
    Cell getStartCell();


}
