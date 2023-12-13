package ru.netology;

public class Radio {
    //текущая громкость
    private int currentVolume;

    //текущая радиостанция
    private int currentRadioStation;

    //метод get получает значение
    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    //метод set устанавливает значение
    public void setCurrentVolume(int newCurrentVolume) {
        if(newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        if(newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if(newCurrentRadioStation > 9) {
            newCurrentRadioStation = 0;
        }
        if(newCurrentRadioStation < 0) {
            newCurrentRadioStation = 9;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void volumeUp() {
        if(currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void volumeDown() {
        if(currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
    public void nextRadioStation() {
        if(currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }
    public void prevRadioStation() {
        if(currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = 9;
        }
    }
}