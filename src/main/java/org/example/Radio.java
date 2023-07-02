package org.example;

public class Radio {
    public int station;
    public int volume;

    public void next() {
        if (station == 9) {
            station = 0;
        } else {
            station++;
        }
    }

    public void prev() {
        if (station == 0) {
            station = 9;
        } else {
            station--;
        }
    }

    public void setStation(int st) {
        if (st >= 0 && st <= 9) {
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
