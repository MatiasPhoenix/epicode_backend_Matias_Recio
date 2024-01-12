package it.epicode.week1.day5;

public interface ElementoAudio {

    final int volume = 0;

    default int abbassaVolume() {
        if (volume > 0) {
            return volume - 1;
        }
        return volume;
    }

    default int alzaVolume() {
        return volume + 1;
    }

}
