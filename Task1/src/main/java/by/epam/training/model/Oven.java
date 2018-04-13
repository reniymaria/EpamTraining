package by.epam.training.model;

public class Oven {

    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private float height;
    private float width;

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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "by.epam.training.model.Oven " +
                "power_consumption = " + powerConsumption +
                ", weight = " + weight +
                ", capacity = " + capacity +
                ", depth = " + depth +
                ", height = " + height +
                ", width = " + width;
    }
}
