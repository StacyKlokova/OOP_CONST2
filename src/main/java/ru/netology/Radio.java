package ru.netology;


public class Radio {
    //текущая громкость
    private int currentVolume;

    //максимальная громкость
    private int maxCurrentVolume = 100;


    //минимальная громкость
    private int minCurrentVolume = 0;


    //максимальная радиостанция
    private int maxCurrentRadioStation = 9;


    //минимальная радиостанция
    private int minCurrentRadioStation = 0;


    //создаем конструктор по умолчанию
    public Radio() {
    }


    //создаем конструктор с параметрами
    public Radio(int numberStation) {
        this.maxCurrentRadioStation = numberStation - 1;
    }


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
        if(newCurrentVolume > maxCurrentVolume) {
            newCurrentVolume = maxCurrentVolume;
        }
        if(newCurrentVolume < minCurrentVolume) {
            newCurrentVolume = minCurrentVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if(newCurrentRadioStation > maxCurrentRadioStation) {
            newCurrentRadioStation = maxCurrentRadioStation;
        }
        if(newCurrentRadioStation < minCurrentRadioStation) {
            newCurrentRadioStation = minCurrentRadioStation;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void volumeUp() {
        if(currentVolume < maxCurrentVolume) {
            currentVolume = currentVolume + 1;
        }
    }
    public void volumeDown() {
        if(currentVolume > minCurrentVolume) {
            currentVolume = currentVolume - 1;
        }
    }
    public void nextRadioStation() {
        if(currentRadioStation < maxCurrentRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minCurrentRadioStation;
        }
    }
    public void prevRadioStation() {
        if(currentRadioStation > minCurrentRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxCurrentRadioStation;
        }
    }
}