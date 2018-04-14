package by.epam.training.control.action.impl;

import by.epam.training.model.Messages;
import by.epam.training.control.action.UserAction;
import by.epam.training.model.entity.Attribute;
import by.epam.training.model.entity.Product;
import by.epam.training.model.entity.factory.EntityFactory;
import by.epam.training.model.exception.product.DbException;
import by.epam.training.model.exception.product.ProductNotFoundException;
import by.epam.training.model.orm.DaoManager;
import by.epam.training.view.View_I;

import java.util.ArrayList;
import java.util.List;

public class FindByAttributeAction implements UserAction {


    @Override
    public boolean execute(View_I view) {
        List<String> attributeNames;
        try {
            attributeNames = DaoManager.getAttributeDao().getAllAttributeNames();
            for (String attribute : attributeNames) {
                view.print(attribute);
            }
            List<Attribute> attributes = getUserInput(view);
            List<Product> products = DaoManager.getProductDao().findProducts(attributes);
            for (Product product : products) {
                view.print(product);
            }
        } catch (DbException e) {
            view.print(Messages.DB_ERROR_MESSAGE);
        } catch (ProductNotFoundException e) {
            view.print(Messages.PRODUCT_NOT_FOUND_MESSAGE);
        }
        return true;
    }

    private List<Attribute> getUserInput(View_I view){
        String contin;
        List<Attribute> attributes = new ArrayList<>();
        do {
            view.print(Messages.SELECT_ATTRIBUTE_MESSAGE);
            String name = view.getString();
            view.print(Messages.SELECT_ATTRIBUTE_VALUE_MESSAGE);
            String value = view.getString();
            view.print(Messages.CONTINUE_MESSAGE);
            attributes.add(EntityFactory.getAttribute(name, value));
            contin = view.getString();
        }while (contin.toLowerCase().equals("y"));
        return attributes;
    }
}
