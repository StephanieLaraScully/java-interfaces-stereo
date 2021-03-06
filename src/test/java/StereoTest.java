import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    CDPlayer cdPlayer;
    Radio radio;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Sony", "CD-100", 4);
        radio = new Radio("Samsung", "RD-200");
        stereo = new Stereo("Ericsson", cdPlayer, radio);
    }

    @Test
    public void stereoHasCDPlayer() {
        assertEquals(cdPlayer, stereo.getCdPlayer());
    }

    @Test
    public void stereoHasRadio() {
        assertEquals(radio, stereo.getRadio());
    }

    @Test
    public void stereoCanPlayCD() {
        assertEquals("CD is playing", stereo.playCD());
    }

    @Test
    public void stereoCanPauseCD() {
        assertEquals("CD is paused", stereo.pauseCD());
    }

    @Test
    public void stereoCanSkipSongCD() {
        assertEquals("Next song playing", stereo.skipSongCD());
    }

    @Test
    public void stereoCanGoBackSongCD() {
        assertEquals("Previous song playing", stereo.goBackSongCD());
    }

    @Test
    public void stereoCanTuneRadio() {
        assertEquals("Radio4", stereo.tuneRadio());
    }

    @Test
    public void canIncreaseVolume() {
        assertEquals("I am LOUDER", stereo.increaseVolume());
    }

    @Test
    public void canDecreaseVolume() {
        assertEquals("I am quieter shhh", stereo.decreaseVolume());
    }
}
