package by.epam.training.model.orm.dao;

import by.epam.training.model.entity.Attribute;
import by.epam.training.model.entity.Product;
import by.epam.training.model.exception.product.DbException;
import by.epam.training.model.exception.product.ProductNotFoundException;

import java.util.List;

public interface ProductDao {
    List<String> getNames() throws DbException;
    List<Product> findProducts(List<Attribute> criterion) throws DbException, ProductNotFoundException;
    List<Product> getAllProducts() throws DbException;
    List<Product> getProducts(String name) throws DbException, ProductNotFoundException;
    List<Product> getProducts(Product criterion) throws DbException, ProductNotFoundException;
}
