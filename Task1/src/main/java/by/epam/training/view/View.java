package by.epam.training.view;

import by.epam.training.model.entity.Attribute;
import by.epam.training.model.entity.Product;

import java.util.Scanner;

public class View {
    //Давайте представим, что пользователь будет все правильно вводить)))

    private View(){}

    private static Scanner scanner = new Scanner(System.in);

    public static void print(String message){
        System.out.println(message);
    }

    public static void print(Product product){
        String attributes = ":";
        for (Attribute attribute : product.getAttributes()) {
            attributes += attribute.getName() + " " + attribute.getValue();
        }
        System.out.println(product.getName() + " " + attributes);
    }

    public static void print(Attribute attribute){
        System.out.println(attribute.getName() + " " + attribute.getValue());
    }

    public static Integer getInt(){
        return scanner.nextInt();
    }

    public static Double getDouble(){
        return scanner.nextDouble();
    }

    public static String getString(){
        return scanner.nextLine();
    }
}
