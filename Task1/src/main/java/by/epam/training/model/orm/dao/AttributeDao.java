package by.epam.training.model.orm.dao;

import by.epam.training.model.entity.Attribute;
import by.epam.training.model.exception.product.DbException;

import java.util.List;

public interface AttributeDao {
    List<Attribute> getAllAttributes() throws DbException;
    List<String> getAllAttributeNames() throws DbException;
}
