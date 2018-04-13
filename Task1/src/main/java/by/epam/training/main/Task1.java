package by.epam.training.main;

import by.epam.training.util.FileReading;
import by.epam.training.util.ParsingLine;
import by.epam.training.util.Searching;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        FileReading fileReading = new FileReading();
        fileReading.readFile();
        ParsingLine parsingLine = fileReading.getParsingLine();
        Searching searching = new Searching(parsingLine.getOvens(), parsingLine.getLaptops(),
                parsingLine.getRefrigerators());

        System.out.println("Hi user!");
        System.out.println("Please select what would you like to search: ");
        System.out.println("Enter '1' for Oven");
        System.out.println("Enter '2' for Laptop");
        System.out.println("Enter '3' for Refrigerator");
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        switch (input) {
            case 1:
                searching.searchOven();
                break;
            case 2:
                searching.searchLaptop();
                break;
            case 3:
                searching.searchRefrigirator();
                break;
            default:
                System.out.println("Invalid number is entered!");
                break;
        }
    }
}
