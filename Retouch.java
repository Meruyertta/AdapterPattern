package com.company;



//retouche can be applied to only png images
//adapter allows to use it with jpegs

public class Retouch {
private int requiredQualityPx=1000;
    public Retouch(int requiredQuality) {
        this.requiredQualityPx = requiredQuality;
    }
    public boolean fits(PngImage png) {
        boolean result;
        //retouch can be made to jpeg when this condition is met
        result = ((this.getRequiredQualityPx()-(png.getQuality()))==100);
        return result;
    }
    public int getRequiredQualityPx() {
        return requiredQualityPx;
    }

    public void setRequiredQualityPx(int requiredQuality) {
        this.requiredQualityPx = requiredQuality;
    }

}
