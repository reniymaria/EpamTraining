package by.epam.training.model;

public class Refrigerator {

    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private float overallCapacity;
    private int height;
    private int width;

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public float getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(float overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "by.epam.training.model.Refrigerator " +
                "power consumption = " + powerConsumption +
                ", weight = " + weight +
                ", freezer capacity = " + freezerCapacity +
                ", overall capacity = " + overallCapacity +
                ", height = " + height +
                ", width = " + width;
    }
}
