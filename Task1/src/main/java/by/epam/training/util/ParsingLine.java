package by.epam.training.util;

import by.epam.training.model.Laptop;
import by.epam.training.model.Oven;
import by.epam.training.model.Refrigerator;

import java.util.ArrayList;
import java.util.List;

public class ParsingLine {

    private List<Laptop> laptops = new ArrayList<>();
    private List<Oven> ovens = new ArrayList<>();
    private List<Refrigerator> refrigerators = new ArrayList<>();

    public void parseAll(String line) {
        String[] strResult;
        strResult = line.trim().split("[,:;=\\s]+");

        if (strResult[0].equalsIgnoreCase("oven")) {
            addOven(strResult);

        } else if (strResult[0].equalsIgnoreCase("laptop")) {
            addLaptop(strResult);
        } else if (strResult[0].equalsIgnoreCase("by.epam.training.model.Refrigerator")) {
            addRefrigirator(strResult);
        }
    }

    private void addLaptop(String[] arr) {
        Laptop laptop = new Laptop();
        try {
            laptop.setBatteryCapacity(Float.valueOf(arr[2]));
            laptop.setOs(arr[4]);
            laptop.setMemmoryRom(Integer.valueOf(arr[6]));
            laptop.setSystemMemory(Integer.valueOf(arr[8]));
            laptop.setCpu(Float.valueOf(arr[10]));
            laptop.setDisplayInchs(Integer.valueOf(arr[12]));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format!");
        }
        laptops.add(laptop);
    }

    private void addOven(String[] arr) {
        Oven oven = new Oven();
        try {
            oven.setPowerConsumption(Integer.valueOf(arr[2]));
            oven.setWeight(Integer.valueOf(arr[4]));
            oven.setCapacity(Integer.valueOf(arr[6]));
            oven.setDepth(Integer.valueOf(arr[8]));
            oven.setHeight(Float.valueOf(arr[10]));
            oven.setWidth(Float.valueOf(arr[12]));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format!");
        }
        ovens.add(oven);
    }

    private void addRefrigirator(String[] arr) {
        Refrigerator refrigerator = new Refrigerator();
        try {
            refrigerator.setPowerConsumption(Integer.parseInt(arr[2]));
            refrigerator.setWeight(Integer.parseInt(arr[4]));
            refrigerator.setFreezerCapacity(Integer.parseInt(arr[6]));
            refrigerator.setOverallCapacity(Float.valueOf(arr[8]));
            refrigerator.setHeight(Integer.parseInt(arr[10]));
            refrigerator.setWidth(Integer.parseInt(arr[12]));
        } catch (NumberFormatException e) {
            System.err.println("Incorrect format!");
        }
        refrigerators.add(refrigerator);
    }

    public List<Laptop> getLaptops() {
        return laptops;
    }

    public List<Oven> getOvens() {
        return ovens;
    }

    public List<Refrigerator> getRefrigerators() {
        return refrigerators;
    }
}
