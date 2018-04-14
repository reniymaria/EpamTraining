package by.epam.training.view;

import by.epam.training.model.entity.Attribute;
import by.epam.training.model.entity.Product;

import java.util.Scanner;

public interface View_I {
    void print(String message);
    void print(Product product);
    void print(Attribute attribute);
    String getString();
}
