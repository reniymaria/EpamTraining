package by.epam.training.model;

public class Laptop {

    private float batteryCapacity;
    private String os;
    private int memmoryRom;
    private int systemMemory;
    private float cpu;
    private int displayInchs;

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public int getMemmoryRom() {
        return memmoryRom;
    }

    public void setMemmoryRom(int memmoryRom) {
        this.memmoryRom = memmoryRom;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public float getCpu() {
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(int displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public String toString() {
        return "by.epam.training.model.Laptop " +
                "battery capacity=" + batteryCapacity +
                ", os = '" + os +
                ", memmory rom = " + memmoryRom +
                ", system memory = " + systemMemory +
                ", cpu = " + cpu +
                ", display inchs = " + displayInchs + '\'';
    }
}
