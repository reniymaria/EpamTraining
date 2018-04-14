package by.epam.training.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private List<Attribute> attributes = new ArrayList<>();
    private String name;

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    public Product(String name, List<Attribute> attributes) {
        this.attributes = attributes;
        this.name = name;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
