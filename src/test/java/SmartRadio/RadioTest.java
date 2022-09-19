package SmartRadio;

import SmartRadio.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldNotExistChannel() {
        Radio rad = new Radio();
        rad.setNumberRadioStation(10);


        int expected = 0;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
@Test
    public void shouldLastChannelSet() {
    Radio rad = new Radio();
    rad.setNumberRadioStation(9);
    rad.next();

    int expected = 0;
    int actual = rad.getNumberRadioStation();
    Assertions.assertEquals(expected, actual);
}
    @Test
    public void shouldInstallNegativeChannel () {
        Radio rad = new Radio();
        rad.setNumberRadioStation(-1);
        rad.next();

        int expected = 1;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPreviousStation(){
        Radio rad = new Radio();
        rad.setNumberRadioStation(5);
        rad.prev();

        int expected = 4;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void previousStationFromFirst(){
        Radio rad = new Radio();
        rad.setNumberRadioStation(-1);
        rad.prev();

        int expected = 9;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maximumVolume() {
        Radio rad = new Radio();
        rad.setSoundVolume(10);
        rad.increaseVolume();

        int expected = 10;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void lowerNegativeValue() {
        Radio rad = new Radio();
        rad.setSoundVolume(11);
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }
    //@Test
    //public void lowerNegativeValue() {
    //    Radio rad = new Radio();
    //    rad.setSoundVolume(10);
    //    rad.increaseVolume();
//
    //    int expected = 0;
    //    int actual = rad.getSoundVolume();
    //    Assertions.assertEquals(expected, actual);
//
    //}

    @Test
    public void shouldVolumeLessZero() {
        Radio rad = new Radio();
        rad.setSoundVolume(-1);
        rad.downVolume();

        int expected = 0;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void volumeHigherMaximum() {
        Radio rad = new Radio();
        rad.setSoundVolume(10);
        rad.downVolume();

        int expected = rad.getSoundVolume();
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldVolumeReduction() {
        Radio rad = new Radio();
        rad.setSoundVolume(9);
        rad.downVolume();

        int expected = 8;
        int actual = rad.getSoundVolume();
        Assertions.assertEquals(expected, actual);

    }
}
