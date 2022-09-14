public class Radio
{
    public int numberRadioStation;

    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public void setNumberRadioStation(int newNumberRadioStation) {
        if(newNumberRadioStation < 0 || newNumberRadioStation > 9) {
            return;
        }
        else {
            newNumberRadioStation += 1;
        }
        numberRadioStation = newNumberRadioStation;
        //return;
    }

    public int soundVolume;
}
