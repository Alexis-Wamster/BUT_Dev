import static org.junit.Assert.assertTrue; // import static : une facilité offerte depuis java5 (pas besoin de mettre le préfixe)
import static org.junit.Assert.assertFalse; //
import static org.junit.Assert.assertEquals; // 
import org.junit.Test;

import java.lang.StringBuilder;



/**
 * Une classe pour faire des tests sur la classe MaMemoire avec JUnit
 */
public class TestsACompleterDirection {


    /**
     * Test nord x vaut 0
     */
    @Test
    public void Nordx(){
        Direction d = Direction.NORD;
        assertEquals(0,d.getDecalageX());

    }

    /**
     * Test nord y vaut -1
     */
    @Test
    public void Nordy(){
      Direction d = Direction.NORD;
      assertEquals(-1,d.getDecalageY()); //on constate que dans le fichier Direction.java, les
    }

    /**
     * Test que reset retourne une NullPointerException
     */
    @Test(expected = NullPointerException.class)
    public void ResetNPE(){
		Direction.reset();
    }


    /**
     * Test que l'on peut faire 64 fois un huitième de tour dans le sens trigonométrique et être au même endroit quand on part du Sud Est
     */
    @Test
    public void whenIGetOlder(){
		Direction d1 = Direction.SE;
		Direction d2 = Direction.SE;
		for (int i=0; i<64; i++){
			d2 = d2.huitDeTour();
		}
		assertEquals(d1,d2);
    }


    /**
     * Test que l'on peut faire 65 fois un huitième detour dans le sens antitrigonométrique et être au même endroit que si on faisait un anti huitième de tour quand on part du Sud Est
     */
    @Test
    public void losingMyHair(){
		Direction d1 = Direction.SE;
		Direction d2 = Direction.SE;
		for (int i=0; i<65; i++){
			d2 = d2.huitDeTourAnti();
		}
		assertEquals(d1.huitDeTourAnti(),d2);
    }

    
    

    
}
