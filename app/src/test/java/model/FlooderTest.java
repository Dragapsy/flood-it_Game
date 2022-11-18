package model;

import javafx.scene.paint.Color;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class FlooderTest {

    private static ArrayGrid gridThreeThree;

    static {
        try {
            gridThreeThree = new ArrayGrid(3,3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @BeforeAll
    private static void initializeColorsGrid(){
        gridThreeThree.getCell(0,0).setColor(Color.RED);
        gridThreeThree.getCell(0,1).setColor(Color.BLACK);
        gridThreeThree.getCell(0,2).setColor(Color.RED);
        gridThreeThree.getCell(1,0).setColor(Color.RED);
        gridThreeThree.getCell(1,1).setColor(Color.RED);
        gridThreeThree.getCell(1,2).setColor(Color.BLACK);
        gridThreeThree.getCell(2,0).setColor(Color.BLACK);
        gridThreeThree.getCell(2,1).setColor(Color.BLACK);
        gridThreeThree.getCell(2,2).setColor(Color.RED);
    }
    @Test
    public void testFlood() {
        Flooder.flood(gridThreeThree.getCell(0, 0), Color.INDIANRED);
        assertThat(gridThreeThree.getCell(0, 0).getColor()).isEqualTo(Color.INDIANRED);
        assertThat(gridThreeThree.getCell(1, 0).getColor()).isEqualTo(Color.INDIANRED);
        assertThat(gridThreeThree.getCell(1, 1).getColor()).isEqualTo(Color.INDIANRED);

        Flooder.flood(gridThreeThree.getCell(0, 1), Color.INDIANRED);
        assertThat(gridThreeThree.getCell(0, 1).getColor()).isEqualTo(Color.INDIANRED);

        Flooder.flood(gridThreeThree.getCell(1, 2), Color.INDIANRED);
        assertThat(gridThreeThree.getCell(1, 2).getColor()).isEqualTo(Color.INDIANRED);

        Flooder.flood(gridThreeThree.getCell(0, 2), Color.INDIANRED);
        assertThat(gridThreeThree.getCell(0, 2).getColor()).isEqualTo(Color.INDIANRED);

        Flooder.flood(gridThreeThree.getCell(2, 0), Color.INDIANRED);
        assertThat(gridThreeThree.getCell(2, 0).getColor()).isEqualTo(Color.INDIANRED);
        assertThat(gridThreeThree.getCell(2, 1).getColor()).isEqualTo(Color.INDIANRED);

        Flooder.flood(gridThreeThree.getCell(2, 2), Color.INDIANRED);
        assertThat(gridThreeThree.getCell(2, 2).getColor()).isEqualTo(Color.INDIANRED);
    }




    }
