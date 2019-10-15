import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CassettePlayerTest {


    private CassettePlayer cassettePlayer;

    @Before
    public void before(){
        cassettePlayer = new CassettePlayer("Roksan", "Anthracite");
    }

    @Test
    public void hasMake(){
        assertEquals("Roksan", cassettePlayer.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Anthracite", cassettePlayer.getModel());
    }
}
