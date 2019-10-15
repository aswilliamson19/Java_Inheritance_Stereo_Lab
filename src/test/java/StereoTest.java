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

    @Test
    public void canPlayCassette(){
        assertEquals("The cassette is playing The Rolling Stones", stereo.playComponent(cassettePlayer, "The Rolling Stones"));
    }

    @Test
    public void canPlayCD(){
        assertEquals("The CD is playing The Rolling Stones", stereo.playComponent(cdPlayer, "The Rolling Stones"));
    }

    @Test
    public void canRaiseVolume(){
        stereo.raiseVolume(10);
        assertEquals(20, stereo.getVolume());
    }

    @Test
    public void canLowerVolume(){
        stereo.lowerVolume(5);
        assertEquals(5, stereo.getVolume());
    }
}
