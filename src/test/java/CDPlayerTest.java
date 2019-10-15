import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    private CDPlayer cdPlayer;

    @Before
    public void before(){
        cdPlayer = new CDPlayer("Roksan", "Anthracite");
    }

    @Test
    public void hasMake(){
        assertEquals("Roksan", cdPlayer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Anthracite", cdPlayer.getModel());
    }
}
