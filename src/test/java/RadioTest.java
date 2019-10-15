import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    private Radio radio;

    @Before
    public void before(){
        radio = new Radio ("Roksan", "Anthracite");
    }

    @Test
    public void hasMake(){
        assertEquals("Roksan", radio.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Anthracite", radio.getModel());
    }
}
