package org.launchcode.studio7;

public abstract class BaseDisc {
    protected String name;
    protected int capacity;
    protected String diskType;
    protected int spaceLeft;
    protected int spaceUsed;

    public BaseDisc(String name, int capacity, String diskType, int spaceLeft, int spaceUsed) {
        this.name = name;
        this.capacity = capacity;
        this.diskType = diskType;
        this.spaceLeft = spaceLeft;
        this.spaceUsed = spaceUsed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }

    public int getSpaceLeft() {
        spaceLeft = capacity - spaceUsed;
        return spaceLeft;
    }

    public void setSpaceLeft(int spaceLeft) {
        this.spaceLeft = spaceLeft;
    }

    public int getSpaceUsed() {
        return spaceUsed;
    }

    public void setSpaceUsed(int spaceUsed) {
        this.spaceUsed = spaceUsed;
    }



    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Capacity: " + capacity + "\n" +
                "Disc Type " + diskType + "\n" +
                "Space Left: " + spaceLeft;

    }
}
