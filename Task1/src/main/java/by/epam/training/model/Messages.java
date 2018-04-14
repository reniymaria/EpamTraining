package by.epam.training.model;

public interface Messages {
    String WELCOME_MESSAGE = "Choose action: 'find_by_name', 'exit', 'find_by_attributes'";
    String ERROR_MESSAGE = "Invalid action";
    String DB_ERROR_MESSAGE = "Servers are under maintenance, try later";
    String SELECT_ATTRIBUTE_MESSAGE = "Select attribute pls";
    String SELECT_PRODUCT_MESSAGE = "Select product pls";
    String SELECT_ATTRIBUTE_VALUE_MESSAGE = "Select attribute value pls";
    String CONTINUE_MESSAGE = "Continue? y/n";
    String PRODUCT_NOT_FOUND_MESSAGE = "Sorry, your product was not found";
}
