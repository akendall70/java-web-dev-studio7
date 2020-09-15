package org.launchcode.studio7;

public class DVD extends BaseDisc implements OpticalDisc{
    private int resolution;

    public DVD(String name, int capacity, String diskType, int spaceLeft, int spaceUsed, int resolution) {
        super(name, capacity, diskType, spaceLeft, spaceUsed);
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    @Override
    public void spinDisc() {
        System.out.println("DVD is starting up.");
    }

    @Override
    public void playDisc() {
        System.out.println("Movie is starting.");
    }

    @Override
    public void skip() {
        System.out.println("Next scene.");
    }

    @Override
    public void previous() {
        System.out.println("Previous scene.");
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
                "Resolution: " + resolution + "\n";

    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
