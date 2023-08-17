package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
    @Test
    void shouldIncreaseStation() {
        Radio radio = new Radio();
        radio.setStation(2);
        radio.next();
        Assertions.assertEquals(3, radio.getStation());
    }

    @Test
    void shouldIncreaseStationWrap() {
        Radio radio = new Radio();
        radio.setStation(9);
        radio.next();
        Assertions.assertEquals(0, radio.getStation());
    }

    @Test
    void shouldDecreaseStation() {
        Radio radio = new Radio();
        radio.setStation(2);
        radio.prev();
        Assertions.assertEquals(1, radio.getStation());
    }

    @Test
    void shouldDecreaseStationWrap() {
        Radio radio = new Radio();
        radio.setStation(0);
        radio.prev();
        Assertions.assertEquals(9, radio.getStation());
    }

    @Test
    void shouldSetValidStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        Assertions.assertEquals(5, radio.getStation());
    }

    @Test
    void shouldSetInvalidStation() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.setStation(100);
        Assertions.assertEquals(5, radio.getStation());
    }

    @Test
    void shouldSetInvalidStationNegative() {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.setStation(-100);
        Assertions.assertEquals(5, radio.getStation());
    }




    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(30);
        radio.increaseVolume();
        Assertions.assertEquals(31, radio.getVolume());
    }

    @Test
    void shouldIncreaseVolumeOutOfBounds() {
        Radio radio = new Radio();
        radio.setVolume(100);
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setVolume(30);
        radio.decreaseVolume();
        Assertions.assertEquals(29, radio.getVolume());
    }

    @Test
    void shouldDecreaseVolumeOutOfBounds() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    void shouldSetValidVolume() {
        Radio radio = new Radio();
        radio.setVolume(60);
        Assertions.assertEquals(60, radio.getVolume());
    }

    @Test
    void shouldSetInvalidVolume() {
        Radio radio = new Radio();
        radio.setVolume(80);
        radio.setVolume(200);
        Assertions.assertEquals(80, radio.getVolume());
    }

    @Test
    void shouldSetInvalidVolumeNegative() {
        Radio radio = new Radio();
        radio.setVolume(80);
        radio.setVolume(-200);
        Assertions.assertEquals(80, radio.getVolume());
    }
}
