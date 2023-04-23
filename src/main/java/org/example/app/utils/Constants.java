package org.example.app.utils;

public final class Constants {

    public final static String DB_DRIVER = "jdbc:sqlite:";
    public final static String DB_BASE_URL = "src/main/resources/database/";
    public final static String DB_NAME = "users.db";
    public final static String TABLE_USERS = "users";
    public final static String DB_DRIVER_ABSENT_MSG = "No suitable driver found!";
    public final static String DB_ABSENT_MSG = "\n>> No database!";
    public final static String DATA_ABSENT_MSG = "\n>> No data!";
    public final static String DATA_INSERT_MSG = "\n>> Created.";
    public final static String DATA_UPDATE_MSG = "\n>> Updated.";
    public final static String DATA_DELETE_MSG = "\n>> Deleted.";
    public final static String APP_CLOSE_MSG = "\n>> App closed.";
//    public final static String INPUT_REQ_MSG = "Input required.";
    public final static String INCORRECT_VALUE_MSG = ">> Incorrect value! Try again...";

    // Regexes для name
    public final static String NAME_RGX = "^[A-Z]{1}[a-z]{2,31}";
    public final static String WRONG_NAME_MSG = "Wrong name.";

    // Regexes для номера телефона формата xxx xxx-xxxx
    public final static String PHONE_RGX = "[0-9]{3}[\\ ][0-9]{3}-[0-9]{4}";
    public final static String WRONG_PHONE_MSG = "Wrong phone format.";

    // Regexes для email
    public final static String EMAIL_RGX = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
    public final static String WRONG_EMAIL_MSG = "Wrong email.";

    // Regexes для id
    public final static String ID_RGX = "[0-9]";
    public final static String WRONG_ID_MSG = "Wrong id value.";
    public final static String ID_NO_EXISTS_MSG = "There is no such ID.";

    // Log messages
    public final static String LOG_DB_ABSENT_MSG = "Database is absent!";
    public final static String LOG_DATA_INPTS_WRONG_MSG = "Data inputs incorrect.";
    public final static String LOG_DATA_ABSENT_MSG = "Data are absent!";
    public final static String LOG_DB_ERROR_MSG = "DB manipulations error.";
}
