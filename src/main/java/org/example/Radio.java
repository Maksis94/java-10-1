package org.example;

public class Radio {
    private int station;
    private int volume;
    private int maxStations = 10;

    public Radio(int maxStations) {
        this.maxStations = maxStations;
    }

    public Radio() {}

    public int getStation() {
        return station;
    }

    public int getVolume() {
        return volume;
    }

    public void next() {
        if (station == maxStations - 1) {
            station = 0;
        } else {
            station++;
        }
    }

    public void prev() {
        if (station == 0) {
            station = maxStations - 1;
        } else {
            station--;
        }
    }

    public void setStation(int st) {
        if (st >= 0 && st <= maxStations - 1) {
            station = st;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume--;
        }
    }

    public void setVolume(int v) {
        if (v >= 0 && v <= 100) {
            volume = v;
        }
    }
}
