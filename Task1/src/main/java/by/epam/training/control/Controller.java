package by.epam.training.control;

import by.epam.training.control.action.factory.ActionFactory;
import by.epam.training.model.exception.action.ActionNotFoundException;
import by.epam.training.view.View;
import by.epam.training.view.View_I;

import static by.epam.training.model.Messages.ERROR_MESSAGE;
import static by.epam.training.model.Messages.WELCOME_MESSAGE;


public class Controller {



    public void start() {
        boolean next = true;
        View_I view = View.getInstance();
        while (next) {
            view.print(WELCOME_MESSAGE);
            String answer = view.getString();
            try {
                next = ActionFactory.getAction(answer).execute(view);
            } catch (ActionNotFoundException e) {
                view.print(ERROR_MESSAGE);
            }
        }
    }
}
