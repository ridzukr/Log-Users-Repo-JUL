package org.example.app.controllers;

import org.example.app.services.UserUpdateService;
import org.example.app.utils.AppStarter;
import org.example.app.utils.Constants;
import org.example.app.views.UserUpdateView;

public class UserUpdateController {

    UserUpdateService service;
    UserUpdateView view;

    public UserUpdateController(UserUpdateService service, UserUpdateView view) {
        this.service = service;
        this.view = view;
    }

    public void updateUser() {

        String str = service.updateUser(view.getData());

        view.getOutput(str);

        if (str.equals(Constants.DB_ABSENT_MSG)) {
            System.exit(0);
        } else {
            AppStarter.startApp();
        }
    }
}
