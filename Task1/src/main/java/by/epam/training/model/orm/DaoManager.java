package by.epam.training.model.orm;

import by.epam.training.model.orm.dao.AttributeDao;
import by.epam.training.model.orm.dao.Impl.AttributeDaoImpl;
import by.epam.training.model.orm.dao.Impl.ProductDaoImpl;
import by.epam.training.model.orm.dao.ProductDao;

public class DaoManager {

    private static volatile AttributeDao attributeDao = new AttributeDaoImpl();
    private static volatile ProductDao productDao = new ProductDaoImpl();

    private DaoManager(){}

    public static AttributeDao getAttributeDao() {
        return attributeDao;
    }

    public static void setAttributeDao(AttributeDao attributeDao) {
        DaoManager.attributeDao = attributeDao;
    }

    public static ProductDao getProductDao() {
        return productDao;
    }

    public static void setProductDao(ProductDao productDao) {
        DaoManager.productDao = productDao;
    }
}
