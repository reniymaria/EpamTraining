package by.epam.training.util;

import by.epam.training.model.Laptop;
import by.epam.training.model.Oven;
import by.epam.training.model.Refrigerator;

import java.util.List;
import java.util.Scanner;

public class Searching {
    private List<Oven> ovens;
    private List<Laptop> laptops;
    private List<Refrigerator> frigers;

    public Searching(List<Oven> oven, List<Laptop> laptop, List<Refrigerator> refrig) {
        ovens = oven;
        laptops = laptop;
        frigers = refrig;
    }

    public void searchOven() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter parameter for Oven or enter 0 if you don't need the parameter");
        System.out.println("Power Consumption: ");
        int input1 = in.nextInt();

        System.out.println("WEIGHT: ");
        int input2 = in.nextInt();

        System.out.println("CAPACITY: ");
        int input3 = in.nextInt();

        System.out.println("DEPTH: ");
        int input4 = in.nextInt();

        System.out.println("HEIGHT: ");
        float input5 = in.nextFloat();

        System.out.println("WIDTH: ");
        float input6 = in.nextFloat();
        System.out.println("Result of search: ");
        for (int i = 0; i < ovens.size(); i++) {
            if (ovens.get(i).getPowerConsumption() == input1 || ovens.get(i).getWeight() == input2
                    || ovens.get(i).getCapacity() == input3 || ovens.get(i).getDepth() == input4
                    || ovens.get(i).getHeight() == input5 || ovens.get(i).getWidth() == input6) {

                System.out.println(ovens.get(i).toString());
            }
            if (input1 == 0 && input2 == 0
                    && input3 == 0 && input4 == 0 && input5 == 0
                    && input6 == 0) {

                System.out.println(ovens.get(i).toString());
            }
        }

    }

    public void searchLaptop() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter parameter for Laptop or enter 0 if you don't need the parameter");
        System.out.println("BATTERY_CAPACITY: ");
        float input1 = in.nextFloat();

        System.out.println("OS: ");
        String input2 = in.next();

        System.out.println("MEMORY_ROM: ");
        int input3 = in.nextInt();

        System.out.println("SYSTEM_MEMORY: ");
        int input4 = in.nextInt();

        System.out.println("CPU: ");
        float input5 = in.nextFloat();

        System.out.println("DISPLAY_INCHES: ");
        int input6 = in.nextInt();
        System.out.println("Result of search: ");
        for (int i = 0; i < laptops.size(); i++) {
            if (laptops.get(i).getBatteryCapacity() == input1 || laptops.get(i).getOs().equalsIgnoreCase(input2)
                    || laptops.get(i).getMemmoryRom() == input3 || laptops.get(i).getSystemMemory() == input4
                    || laptops.get(i).getCpu() == input5 || laptops.get(i).getDisplayInchs() == input6) {

                System.out.println(laptops.get(i).toString());
            }
            if (input1 == 0 && input2.equalsIgnoreCase("0")
                    && input3 == 0 && input4 == 0
                    && input5 == 0 && input6 == 0) {

                System.out.println(laptops.get(i).toString());
            }
        }
    }

    public void searchRefrigirator() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter parameter for Refrigerator or enter 0 if you don't need the parameter");
        System.out.println("POWER_CONSUMPTION: ");
        int input1 = in.nextInt();

        System.out.println("WEIGHT: ");
        int input2 = in.nextInt();

        System.out.println("FREEZER_CAPACITY: ");
        int input3 = in.nextInt();

        System.out.println("OVERALL_CAPACITY: ");
        int input4 = in.nextInt();

        System.out.println("HEIGHT: ");
        int input5 = in.nextInt();

        System.out.println("WIDTH: ");
        int input6 = in.nextInt();
        System.out.println("Result of search: ");
        for (int i = 0; i < frigers.size(); i++) {
            if (frigers.get(i).getPowerConsumption() == input1 || frigers.get(i).getWeight() == input2
                    || frigers.get(i).getFreezerCapacity() == input3 || frigers.get(i).getOverallCapacity() == input4
                    || frigers.get(i).getHeight() == input5 || frigers.get(i).getWidth() == input6) {

                System.out.println(frigers.get(i).toString());
            }
            if (input1 == 0 && input2 == 0
                    && input3 == 0 && input4 == 0
                    && input5 == 0 && input6 == 0) {

                System.out.println(frigers.get(i).toString());
            }
        }

    }

}