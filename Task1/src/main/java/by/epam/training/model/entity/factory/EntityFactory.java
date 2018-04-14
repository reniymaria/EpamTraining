package by.epam.training.model.entity.factory;

import by.epam.training.model.entity.Attribute;
import by.epam.training.model.entity.Product;

import java.util.List;

public class EntityFactory {

    private EntityFactory(){}

    public static Attribute getAttribute(){
        return new Attribute();
    }

    public static Attribute getAttribute(String name){
        return new Attribute(name);
    }

    public static Attribute getAttribute(String name, String value){
        return new Attribute(name, value);
    }

    public static Product getProduct(){
        return new Product();
    }

    public static Product getProduct(String name){
        return new Product(name);
    }

    public static Product getProduct(String name, List<Attribute> attributes){
        return new Product(name, attributes);
    }
}
