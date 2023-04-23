package org.example.app.controllers;

import org.example.app.services.UserCreateService;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.views.UserCreateView;

public class UserCreateController {

    UserCreateView view;
    UserCreateService service;

    public UserCreateController(UserCreateService service, UserCreateView view) {
        this.service = service;
        this.view = view;
    }

    public void createUser() {
        String str = service.createUser(view.getData());
        view.getOutput(str);
        if (str.equals(Constants.DB_ABSENT_MSG)) {
            System.exit(0);
        } else {
            AppStarter.startApp();
        }
    }
}
