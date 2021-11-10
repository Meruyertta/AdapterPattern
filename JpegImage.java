package com.company;

public class JpegImage {
    private int quality=1000;

    public JpegImage(int quality) {
        this.quality = quality;
    }

    public JpegImage() {
    }

    public int getQuality() {
        return quality;
    }
}
