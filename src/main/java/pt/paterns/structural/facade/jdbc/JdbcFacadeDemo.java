package pt.paterns.structural.facade.jdbc;

import java.util.List;

public class JdbcFacadeDemo {

    public static void main(String[] args) {

        JdbcFacade jdbcFacade = new JdbcFacade();

        jdbcFacade.createTable();

        System.out.println("Table created.");

        jdbcFacade.insertIntoTable();

        System.out.println("Record inserted.");

        List<Address> addresses = jdbcFacade.getAddress();

        for (Address address : addresses) {
            System.out.println(address.getId() + " "
                    + address.getStreetName() + " "
                    + address.getCity());
        }

        jdbcFacade.closeConnection();

    }

}
