import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3Test {

    private MP3 mp3;

    @Before
    public void before(){
        mp3 = new MP3("Ipod");
    }

    @Test
    public void hasName(){
        assertEquals("Ipod", mp3.getName());
    }

    @Test
    public void canConnect(){
        assertEquals("I am connected to Ipod", mp3.connect());
    }
}
