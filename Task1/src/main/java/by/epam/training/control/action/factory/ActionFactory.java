package by.epam.training.control.action.factory;

import by.epam.training.control.action.ActionEnum;
import by.epam.training.control.action.UserAction;
import by.epam.training.model.exception.action.ActionNotFoundException;

public class ActionFactory {

    private ActionFactory(){}

    public static UserAction getAction(String action) throws ActionNotFoundException {
        UserAction command = null;
        action = action.toUpperCase();
        command = ActionEnum.valueOf(action).getAction();
        if (command == null){
            throw new ActionNotFoundException();
        }
        return command;
    }
}
