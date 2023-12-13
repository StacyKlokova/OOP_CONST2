package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    //прибавить громкость
    @Test
    public void volumeUpTest() {
        radio.setCurrentVolume(50);
        radio.volumeUp();

        int expected = 51;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //прибавить громкость больше максимального значения
    @Test
    public void volumeUpNextTest() {
        radio.setCurrentVolume(101);
        radio.volumeUp();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //убавить громкость
    @Test
    public void volumeDownTest() {
        radio.setCurrentVolume(50);
        radio.volumeDown();

        int expected = 49;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    //убавить громкость меньше минимального значения
    @Test
    public void volumeDownMinTest() {
        radio.setCurrentVolume(0);
        radio.volumeDown();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    //выбор станции
    @Test
    public void setCurrentRadioStationTest() {
        radio.setCurrentRadioStation(5);

        int expected = 5;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    //выбор станции со значением больше максимального
    @Test
    public void radioStationMaxTest() {
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    //выбор станции со значением меньше минимального
    @Test
    public void radioStationMinTest() {
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    //следующая станция
    @Test
    public void nextRadioStationTest() {
        radio.setCurrentRadioStation(7);
        radio.nextRadioStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    //следующая станция после максимального
    @Test
    public void nextRadioStationMaxTest() {
        radio.setCurrentRadioStation(9);
        radio.nextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


    //предыдущая станция
    @Test
    public void prevRadioStationTest() {
        radio.setCurrentRadioStation(7);
        radio.prevRadioStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }



    //предыдущая станция после минимального
    @Test
    public void prevRadioStationMaxTest() {
        radio.setCurrentRadioStation(0);
        radio.prevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}