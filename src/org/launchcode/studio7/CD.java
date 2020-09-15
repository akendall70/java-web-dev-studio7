package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc{
    private int bitrate;

    public CD(String name, int capacity, String diskType, int spaceLeft, int spaceUsed, int bitrate) {
        super(name, capacity, diskType, spaceLeft, spaceUsed);
        this.bitrate = bitrate;
    }

    public int getBitrate() {
        return bitrate;
    }

    public void setBitrate(int bitrate) {
        this.bitrate = bitrate;
    }

    @Override
    public void spinDisc() {
        System.out.println("CD is starting.");
    }

    @Override
    public void playDisc() {
        System.out.println("Playing CD.");
    }

    @Override
    public void skip() {
        System.out.println("Skipping track.");
    }

    @Override
    public void previous() {
        System.out.println("Previous track.");
    }

    @Override
    public void storeData() {

    }

    @Override
    public void writeData() {

    }

    @Override
    public void readData() {

    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Capacity: " + capacity + "\n" +
                "Disc Type " + diskType + "\n" +
                "Space Left: " + spaceLeft + "\n" +
                "Bitrate: " + bitrate + "\n";

    }


    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
