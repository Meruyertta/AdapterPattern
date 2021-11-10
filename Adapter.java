package com.company;

public class Adapter extends PngImage{
    private JpegImage jpeg;

    public Adapter(JpegImage jpeg) {
        this.jpeg = jpeg;
    }
    @Override
    public int getQuality() {
        int result;
        result= jpeg.getQuality();
        return result;
    }
}
