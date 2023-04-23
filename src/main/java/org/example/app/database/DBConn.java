package org.example.app.database;

import org.example.app.utils.Constants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConn {

    private static final Logger LOGGER =
            Logger.getLogger(DBConn.class.getName());

    /** @ Намагається встановити з’єднання з указаною URL-адресою бази даних
     *  вибравши відповідний драйвер із набору зареєстрованих драйверів JDBC.
     */
    public static Connection connect() {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection(Constants.DB_DRIVER +
                    Constants.DB_BASE_URL + Constants.DB_NAME);
        } catch (SQLException e) {
//            System.out.println(e.getMessage());
            LOGGER.log(Level.WARNING, Constants.DB_DRIVER_ABSENT_MSG);
        }
        return conn;
    }
}
