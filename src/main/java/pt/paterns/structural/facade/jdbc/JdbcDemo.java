package pt.paterns.structural.facade.jdbc;

import pt.paterns.creational.singleton.DbSingleton;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

    public static void main(String[] args) {
        DbSingleton instance = DbSingleton.getInstance();
        try {
            Connection connection = instance.getConnection();
            Statement statement = connection.createStatement();

            int count = statement.executeUpdate("""
                    CREATE TABLE Address (
                                    ID INTEGER,
                                    StreetName VARCHAR(20),
                                    City VARCHAR(20)
                    )""");

            System.out.println("Table created.");

            statement.close();

            statement = connection.createStatement();

            count = statement.executeUpdate("""
                    INSERT INTO Address(ID, StreetName, City)
                    values (1, '1234 Some street', 'Layton')""");

            System.out.println(count + " record(s) created.");
            statement.close();

            statement = connection.createStatement();

            ResultSet rs = statement.executeQuery("SELECT * FROM Address");

            while (rs.next()) {
                System.out.println(rs.getString(1) + " "
                        + rs.getString(2) + " "
                        + rs.getString(3));
            }

            rs.close();
            statement.close();
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
