package SmartRadio;

import SmartRadio.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio rad = new Radio();


    @Test
            public void shouldCountRadioStation() {
        Radio rad = new Radio(10);
        rad.setNumberRadioStation(9);
        int expected = 9;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldNotExistChannel() {
        rad.setNumberRadioStation(10);
        int expected = 0;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

@Test
    public void shouldLastChannelSet() {
        rad.setNumberRadioStation(9);
        rad.next();
        int expected = 0;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
}
    @Test
    public void shouldInstallNegativeChannel () {
        rad.setNumberRadioStation(-1);
        rad.next();
        int expected = 1;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPreviousStation(){
        rad.setNumberRadioStation(5);
        rad.prev();
        int expected = 4;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void previousStationFromFirst(){
        rad.setNumberRadioStation(-1);
        rad.prev();
        int expected = 9;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maximumVolume() {
        rad.setSoundVolume(100);
        rad.increaseVolume();
        int expected = 100;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lowerNegativeValue() {
        rad.setSoundVolume(101);
        rad.increaseVolume();
        int expected = 1;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldVolumeLessZero() {
        rad.setSoundVolume(-1);
        rad.downVolume();
        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void volumeHigherMaximum() {
        rad.setSoundVolume(100);
        rad.downVolume();
        int expected = rad.getSoundVolume();
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldVolumeReduction() {
        rad.setSoundVolume(99);
        rad.downVolume();
        int expected = 98;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }
}
