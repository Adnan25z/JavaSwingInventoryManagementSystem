package Database;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionFactory {

    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/inventory";
    private static ConnectionFactory instance;
    private Properties prop;
    private Connection conn;
    private Statement statement;
    private ResultSet resultSet;

    // Private constructor to prevent external instantiation
    private ConnectionFactory() {
        try {
            // Username and Password saved as configurable properties
            prop = new Properties();
            prop.loadFromXML(new FileInputStream("lib/DBCredentials.xml"));
            Class.forName(driver);
            conn = DriverManager.getConnection(url, prop.getProperty("username"), prop.getProperty("password"));
            statement = conn.createStatement();
        } catch (Exception e) {
            throw new RuntimeException("Error initializing connection factory", e);
        }
    }

    // Global access point to get the instance of the ConnectionFactory
    public static ConnectionFactory getInstance() {
        if (instance == null) {
            synchronized (ConnectionFactory.class) {
                if (instance == null) {
                    instance = new ConnectionFactory();
                }
            }
        }
        return instance;
    }

    // Method to get connection
    public Connection getConnection() {
        return conn;
    }

    // Login verification method
    public boolean checkLogin(String username, String password) {
        String query = "SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "' LIMIT 1";
        try {
            resultSet = statement.executeQuery(query);
            return resultSet.next();
        } catch (Exception ex) {
            throw new RuntimeException("Login verification failed", ex);
        }
    }
}
