package com.company;

public class Main {

    public static void main(String[] args) {
        Retouch edit=new Retouch(1200);
        PngImage png=new PngImage(900);

        if(edit.fits(png)){
            System.out.println("Retouch can be made to this png");
        }
        else {
            System.out.println("Retouch cannot be made to this png, because it has a low quality");
        }

        JpegImage jpegLow=new JpegImage(1000);
        JpegImage jpegHigh=new JpegImage(1300);

        Adapter jpegLowAdapter=new Adapter(jpegLow);
        Adapter jpegHighAdapter=new Adapter(jpegHigh);

        if(edit.fits(jpegHighAdapter)){
            System.out.println("high quality jpeg photo can be retouched");
        }
        if(!edit.fits(jpegLowAdapter)){
            System.out.println("jpeg cannot be retouched as it has low quality");
        }



    }
}
