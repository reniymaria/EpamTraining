package by.epam.training.model.exception.product;

import by.epam.training.model.exception.MyProjectException;

public class DbException extends MyProjectException {
    public DbException() {
        super();
    }
    public DbException(String message) {
        super(message);
    }
}
