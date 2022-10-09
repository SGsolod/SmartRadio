package SmartRadio;

public class Radio {
    private int numberRadioStation;
    private int soundVolume;
    private final int maxRadioStation;
    private final int minRadioStation = 0;
    private final int maxVolume = 100;
    private final int minVolume = 0;

    public Radio() {
        maxRadioStation = 9;
    }

    public Radio(int countRadioStation) {
        maxRadioStation = countRadioStation - 1;
    }



    public void setNumberRadioStation(int newNumberRadioStation) {
        if (newNumberRadioStation < minRadioStation || newNumberRadioStation > maxRadioStation) {
            return;
        }
        this.numberRadioStation = newNumberRadioStation;
    }

    public int getNumberRadioStation() {
        return numberRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minVolume || newSoundVolume > maxVolume) {
            return;
        }
        this.soundVolume = newSoundVolume;
    }

    public void next() {
        if (numberRadioStation < maxRadioStation) {
            numberRadioStation++;
        } else {
            numberRadioStation = minRadioStation;
        }
    }

    public void prev() {
        if (numberRadioStation > minRadioStation) {
            numberRadioStation--;
        } else {
            numberRadioStation = maxRadioStation;
        }
    }

    public void increaseVolume() {
        if (soundVolume < maxVolume) {
            soundVolume++;
        }
    }

    public void downVolume() {
        if (soundVolume > minVolume) {
            soundVolume--;
        }
    }
}



