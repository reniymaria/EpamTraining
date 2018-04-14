package by.epam.training.model.orm.dao.Impl;

import by.epam.training.model.entity.Attribute;
import by.epam.training.model.entity.Product;
import by.epam.training.model.entity.factory.EntityFactory;
import by.epam.training.model.exception.product.DbException;
import by.epam.training.model.exception.product.ProductNotFoundException;
import by.epam.training.model.orm.dao.ProductDao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductDaoImpl implements ProductDao {

    private static final String FILENAME = "C:\\Users\\Mikle\\IdeaProjects\\EpamTraining\\Task1\\src\\main\\resources\\appliances_db.txt";

    private Scanner initScanner() throws FileNotFoundException {
        return new Scanner(new FileReader(FILENAME));
    }

    @Override
    public List<String> getNames() throws DbException {
        List<Product> products = getAllProducts();
        List<String> names = new ArrayList<>();
        for (Product product : products) {
            names.add(product.getName());
        }
        return names;
    }

    @Override
    public List<Product> findProducts(List<Attribute> criterion) throws DbException, ProductNotFoundException {
        List<Product> products = getAllProducts();
        List<Product> foundProducts = new ArrayList<>();
        for (Product product : products) {
            boolean foundAttr = true;
            for (Attribute attribute : criterion) {
                boolean foundAttrProd = false;
                for (Attribute attributeProd : product.getAttributes()) {
                    if(attribute.equals(attributeProd)){
                        foundAttrProd = true;
                        break;
                    }
                }
                if (!foundAttrProd){
                    foundAttr = false;
                    break;
                }
            }
            if (foundAttr)
                foundProducts.add(product);
        }
        if (foundProducts.isEmpty())
            throw new ProductNotFoundException();
        return foundProducts;
    }

    @Override
    public List<Product> getAllProducts() throws DbException {
        Scanner scanner = null;
        List<Product> products = new ArrayList<>();
        try {
            scanner = initScanner();
            String line = null;
            while (scanner.hasNextLine() && !(line = scanner.nextLine()).isEmpty()) {
                String[] name_and_attrs = line.split(":");
                name_and_attrs[1] = name_and_attrs[1].replaceAll(";", "");
                name_and_attrs[1] = name_and_attrs[1].trim();
                String[] attrs_and_values = name_and_attrs[1].split(", ");
                ArrayList<Attribute> attributes = new ArrayList<>();
                for (String attrs_and_value : attrs_and_values) {
                    String[] attr_and_value = attrs_and_value.split("=");
                    Attribute attribute = EntityFactory.getAttribute(attr_and_value[0], attr_and_value[1]);
                    attributes.add(attribute);
                }
                products.add(EntityFactory.getProduct(name_and_attrs[0].trim(), attributes));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new DbException(e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return products;
    }

    @Override
    public List<Product> getProducts(String name) throws DbException, ProductNotFoundException {
        List<Product> products = getAllProducts();
        List<Product> foundProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equals(name))
                foundProducts.add(product);
        }
        if (foundProducts.isEmpty())
            throw new ProductNotFoundException();
        return foundProducts;
    }

    @Override
    public List<Product> getProducts(Product criterion) throws DbException, ProductNotFoundException {
        List<Product> products = findProducts(criterion.getAttributes());
        List<Product> foundProducts = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equals(criterion.getName()))
                foundProducts.add(product);
        }
        return foundProducts;
    }
}
