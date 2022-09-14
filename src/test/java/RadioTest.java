import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldInstallChannel() {
        Radio rad = new Radio();
        rad.setNumberRadioStation(5);

        int expected = 5;
        int actual = rad.getNumberRadioStation();
        Assertions.assertEquals(expected, actual);
    }

}
