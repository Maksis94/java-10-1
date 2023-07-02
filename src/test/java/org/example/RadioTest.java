package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class RadioTest {
    @Test
    void shouldIncreaseStation() {
        Radio radio = new Radio();
        radio.station = 2;
        radio.next();
        Assertions.assertEquals(3, radio.station);
    }

    @Test
    void shouldIncreaseStationWrap() {
        Radio radio = new Radio();
        radio.station = 9;
        radio.next();
        Assertions.assertEquals(0, radio.station);
    }

    @Test
    void shouldDecreaseStation() {
        Radio radio = new Radio();
        radio.station = 2;
        radio.prev();
        Assertions.assertEquals(1, radio.station);
    }

    @Test
    void shouldDecreaseStationWrap() {
        Radio radio = new Radio();
        radio.station = 0;
        radio.prev();
        Assertions.assertEquals(9, radio.station);
    }

    @Test
    void shouldSetValidStation() {
        Radio radio = new Radio();
        radio.station = 1;
        radio.setStation(5);
        Assertions.assertEquals(5, radio.station);
    }

    @Test
    void shouldSetInvalidStation() {
        Radio radio = new Radio();
        radio.station = 5;
        radio.setStation(100);
        Assertions.assertEquals(5, radio.station);
    }

    @Test
    void shouldSetInvalidStationNegative() {
        Radio radio = new Radio();
        radio.station = 5;
        radio.setStation(-100);
        Assertions.assertEquals(5, radio.station);
    }




    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.volume = 30;
        radio.increaseVolume();
        Assertions.assertEquals(31, radio.volume);
    }

    @Test
    void shouldIncreaseVolumeOutOfBounds() {
        Radio radio = new Radio();
        radio.volume = 100;
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.volume);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.volume = 30;
        radio.decreaseVolume();
        Assertions.assertEquals(29, radio.volume);
    }

    @Test
    void shouldDecreaseVolumeOutOfBounds() {
        Radio radio = new Radio();
        radio.volume = 0;
        radio.decreaseVolume();
        Assertions.assertEquals(0, radio.volume);
    }

    @Test
    void shouldSetValidVolume() {
        Radio radio = new Radio();
        radio.volume = 1;
        radio.setVolume(60);
        Assertions.assertEquals(60, radio.volume);
    }

    @Test
    void shouldSetInvalidVolume() {
        Radio radio = new Radio();
        radio.volume = 80;
        radio.setVolume(200);
        Assertions.assertEquals(80, radio.volume);
    }

    @Test
    void shouldSetInvalidVolumeNegative() {
        Radio radio = new Radio();
        radio.volume = 80;
        radio.setVolume(-200);
        Assertions.assertEquals(80, radio.volume);
    }
}
