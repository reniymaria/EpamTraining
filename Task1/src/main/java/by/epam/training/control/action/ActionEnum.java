package by.epam.training.control.action;

import by.epam.training.control.action.impl.ExitAction;
import by.epam.training.control.action.impl.FindByAttributeAction;
import by.epam.training.control.action.impl.FindByNameAction;

public enum ActionEnum {
    EXIT{
        {
            this.action = new ExitAction();
        }
    },
    FIND_BY_NAME{
        {
            this.action = new FindByNameAction();
        }
    },
    FIND_BY_ATTRIBUTES{
        {
            this.action = new FindByAttributeAction();
        }
    };

    public UserAction getAction() {
        return action;
    }

    public UserAction action;
}
