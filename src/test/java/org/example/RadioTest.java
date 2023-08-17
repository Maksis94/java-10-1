package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
    Radio radio = new Radio();
    Radio radio200 = new Radio(200);

    @Test
    void shouldIncreaseStation() {
        radio.setStation(2);
        radio.next();
        Assertions.assertEquals(3, radio.getStation());
    }

    @Test
    void shouldIncreaseStationWrap() {
        radio.setStation(9);
        radio.next();
        Assertions.assertEquals(0, radio.getStation());
    }

    @Test
    void shouldDecreaseStation() {
        radio.setStation(2);
        radio.prev();
        Assertions.assertEquals(1, radio.getStation());
    }

    @Test
    void shouldDecreaseStationWrap() {
        radio.setStation(0);
        radio.prev();
        Assertions.assertEquals(9, radio.getStation());
    }

    @Test
    void shouldSetValidStation() {
        radio.setStation(5);
        Assertions.assertEquals(5, radio.getStation());
    }

    @Test
    void shouldSetInvalidStation() {
        radio.setStation(5);
        radio.setStation(100);
        Assertions.assertEquals(5, radio.getStation());
    }

    @Test
    void shouldSetInvalidStationNegative() {
        radio.setStation(5);
        radio.setStation(-100);
        Assertions.assertEquals(5, radio.getStation());
    }


    @Test
    void shouldIncreaseStationFor200MaxStations() {
        radio200.setStation(150);
        radio200.next();
        Assertions.assertEquals(151, radio200.getStation());
    }

    @Test
    void shouldIncreaseStationWrapFor200MaxStations() {
        radio200.setStation(199);
        radio200.next();
        Assertions.assertEquals(0, radio200.getStation());
    }

    @Test
    void shouldDecreaseStationFor200MaxStations() {
        radio200.setStation(130);
        radio200.prev();
        Assertions.assertEquals(129, radio200.getStation());
    }

    @Test
    void shouldDecreaseStationWrapFor200MaxStations() {
        radio200.setStation(0);
        radio200.prev();
        Assertions.assertEquals(199, radio200.getStation());
    }

    @Test
    void shouldSetValidStationFor200MaxStations() {
        radio200.setStation(115);
        Assertions.assertEquals(115, radio200.getStation());
    }

    @Test
    void shouldSetInvalidStationFor200MaxStations() {
        radio200.setStation(150);
        radio200.setStation(1000);
        Assertions.assertEquals(150, radio200.getStation());
    }

    @Test
    void shouldSetInvalidStationNegativeFor200MaxStations() {
        radio200.setStation(150);
        radio200.setStation(-100);
        Assertions.assertEquals(150, radio200.getStation());
    }




    @Test
    void shouldIncreaseVolume() {
        radio.setVolume(30);
        radio.increaseVolume();
        Assertions.assertEquals(31, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolumeOutOfBounds() {
        radio.setVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        radio.setVolume(30);
        radio.decreaseVolume();
        Assertions.assertEquals(29, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeOutOfBounds() {
        radio.setVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldSetValidVolume() {
        radio.setVolume(60);
        Assertions.assertEquals(60, radio.getVolume());
    }

    @Test
    void shouldSetInvalidVolume() {
        radio.setVolume(80);
        radio.setVolume(200);
        Assertions.assertEquals(80, radio.getVolume());
    }

    @Test
    void shouldSetInvalidVolumeNegative() {
        radio.setVolume(80);
        radio.setVolume(-200);
        Assertions.assertEquals(80, radio.getVolume());
    }
}
