package by.epam.training.view;

import by.epam.training.model.entity.Attribute;
import by.epam.training.model.entity.Product;

import java.util.Scanner;

public class View implements View_I{
    //Давайте представим, что пользователь будет все правильно вводить)))

    private View(){}

    private static View instance = new View();

    public static View getInstance(){
        return instance;
    }

    private Scanner scanner = new Scanner(System.in);

    public void print(String message) {
        System.out.println(message);
    }

    public void print(Product product) {
        String attributes = ":";
        for (Attribute attribute : product.getAttributes()) {
            attributes += attribute.getName() + " " + attribute.getValue() + " ";
        }
        System.out.println(product.getName() + " " + attributes);
    }

    public void print(Attribute attribute) {
        System.out.println(attribute.getName() + " " + attribute.getValue() + " ");
    }

    public Integer getInt() {
        return scanner.nextInt();
    }

    public Double getDouble() {
        return scanner.nextDouble();
    }

    public String getString() {
        return scanner.nextLine();
    }
}
