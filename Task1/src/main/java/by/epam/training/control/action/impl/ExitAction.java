package by.epam.training.control.action.impl;

import by.epam.training.control.action.UserAction;
import by.epam.training.view.View_I;

public class ExitAction implements UserAction {
    @Override
    public boolean execute(View_I view){
        return false;
    }
}
