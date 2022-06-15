package pt.paterns.structural.bridge.jbdc;

import org.apache.derby.jdbc.EmbeddedDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BridgeEverydayDemo {

    public static void main(String[] args) {

        String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";

        try (
                Connection connection = DriverManager.getConnection(dbUrl);
                Statement statement = connection.createStatement();
        ) {
            // JDBC is an API
            DriverManager.registerDriver(new EmbeddedDriver());  // <- Driver

            // This client is an abstraction and can work with any database that has a driver
            statement.executeUpdate("""
                    CREATE TABLE Address (ID INT, StreetName VARCHAR(20), City VARCHAR(20))
                    """);

            System.out.println("Table created");

            System.out.println(statement.executeQuery("Select * from Address").findColumn("StreetName"));

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
