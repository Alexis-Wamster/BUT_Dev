import static org.junit.Assert.assertTrue; // import static : une facilité offerte depuis java5 (pas besoin de mettre le préfixe)
import static org.junit.Assert.assertFalse; //
import static org.junit.Assert.assertEquals; // 
import org.junit.Test;

import java.lang.StringBuilder;


/**
 * Une classe pour faire des tests sur la classe MaMemoire avec JUnit
 */
public class TestsFournisDirection {


    /**
     * Test quart de tour depuis nord donne l'est.
     */
    @Test
    public void NordQuartDeTour(){
        Direction d = Direction.NORD;
        assertEquals(Direction.EST,d.quartDeTour());
    }

    /**
     * Test huit de tour depuis nord donne le nord-est.
     */
    @Test
    public void NordHuiDeTour(){
        Direction d = Direction.NORD;
        assertEquals(Direction.NE,d.huitDeTour());
    }

    /**
     * Test deux demi-tours depuis nord.
     */
    @Test
    public void NordDeuxDemiTour(){
        Direction d = Direction.NORD;
        assertEquals(d,d.demiTour().demiTour());
    }

    /**
     * Test 4 quart-tours depuis nord.
     */
    @Test
    public void NordQuatreQuartTour(){
        Direction d = Direction.NORD;
        assertEquals(d,d.quartDeTour().quartDeTour().quartDeTour().quartDeTour());
    }

    /**
     * Test 1 huit-tour depuis nord suivi d'un huit tour anti.
     */
    @Test
    public void NordAntiHuitHuit(){
        Direction d = Direction.NORD;
        assertEquals(d,d.huitDeTour().huitDeTourAnti());
    }

    /**
     * Test 1 huit-tour anti depuis nord suivi d'un huit tour.
     */
    @Test
    public void NordHuitAntiHuit(){
        Direction d = Direction.NORD;
        assertEquals(d,d.huitDeTourAnti().huitDeTour());
    }

    /**
     * Test 1 quart-tour depuis nord suivi d'un quart tour anti.
     */
    @Test
    public void NordAntiQuartQuart(){
        Direction d = Direction.NORD;
        assertEquals(d,d.quartDeTour().quartDeTourAnti());
    }

    /**
     * Test 1 quart-tour anti depuis nord suivi d'un quart tour.
     */
    @Test
    public void NordQuartAntiQuart(){
        Direction d = Direction.NORD;
        assertEquals(d,d.quartDeTourAnti().quartDeTour());
    }

    /**
     * Test 1 huit-tour anti depuis nord donne le Nord Ouest.
     */
    @Test
    public void NordAntiHuitTour(){
        Direction d = Direction.NORD;
        assertEquals(Direction.NE,d.huitDeTourAnti()); // parce qu'il faut bien un test pas très juste
    }

    
}
