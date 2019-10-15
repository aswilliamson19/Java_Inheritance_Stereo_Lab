import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    private Stereo stereo;
    private Radio radio;
    private CassettePlayer cassettePlayer;
    private CDPlayer cdPlayer;

    @Before
    public void before(){
        radio = new Radio("Roksan", "Anthracite");
        cassettePlayer = new CassettePlayer("Sony", "V3");
        cdPlayer = new CDPlayer("Phillips", "XPTO");
        stereo = new Stereo(radio, cassettePlayer, cdPlayer);
    }

    @Test
    public void canPlayARadio(){
        assertEquals("You are tuning into Radio One", stereo.playComponent(radio, "Radio One"));
    }
}
