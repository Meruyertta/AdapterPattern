package com.company;
//compatible with retouch
public class PngImage {
    private int quality=1000;

    public PngImage() {
    }

    public PngImage(int quality) {
        this.quality = quality;
    }

    public int getQuality() {
        return quality;
    }
}
