package model;

import javafx.scene.paint.Color;

public interface Strategy {

    Color play(Cell startCell);
//à partir de certte interface, je devais créer des classes qui l'impelemente, dont chacune s'agit d'une strategie, auquel je vais redefinir la methode play
}
