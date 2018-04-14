package by.epam.training.control.action.impl;

import by.epam.training.model.Messages;
import by.epam.training.control.action.UserAction;
import by.epam.training.model.entity.Product;
import by.epam.training.model.exception.product.DbException;
import by.epam.training.model.exception.product.ProductNotFoundException;
import by.epam.training.model.orm.DaoManager;
import by.epam.training.view.View_I;

import java.util.List;

public class FindByNameAction implements UserAction {
    @Override
    public boolean execute(View_I view) {
        List<String> productNames;
        try {
            productNames = DaoManager.getProductDao().getNames();
            for (String attribute : productNames) {
                view.print(attribute);
            }
            List<Product> products = DaoManager.getProductDao().getProducts(getUserInput(view));
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

    private String getUserInput(View_I view) throws DbException, ProductNotFoundException {
        String name = "";
        view.print(Messages.SELECT_PRODUCT_MESSAGE);
        name = view.getString();
        return name;
    }
}
