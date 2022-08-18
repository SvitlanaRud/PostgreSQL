package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExecutor {

    public static void main(String... args) {
        DatabaseConnectionManager dbcm = new DatabaseConnectionManager("localhost", "hplussport",
                "postgres", "password2");
        try {
            //get customer
            Connection connection = dbcm.getConnection();
            CustomerDAO customerDAO = new CustomerDAO(connection);
            Customer customer = customerDAO.findById(999);
            System.out.println(customer.getFirstName() + " " + customer.getLastName());

            //delete client
//            Connection connection = dbcm.getConnection();
//            CustomerDAO customerDAO = new CustomerDAO(connection);
//            Customer customer = customerDAO.findById(10009);
//            System.out.println(customer);
//            customerDAO.delete(10009);
//            System.out.println(customer);

            //update customer
//            Connection connection = dbcm.getConnection();
//            CustomerDAO customerDAO = new CustomerDAO(connection);
//            Customer customer = customerDAO.findById(1000);
//            System.out.println(customer.getFirstName() + " " + customer.getLastName());
//            customer.setFirstName("Victor2");
//            customer.setLastName("Victor");
//            customer = customerDAO.update(customer);
//            System.out.println(customer.getFirstName() + " " + customer.getLastName());

            //create new customer
//            Connection connection = dbcm.getConnection();
//            CustomerDAO customerDAO = new CustomerDAO(connection);
//            Customer customer = new Customer();
//            customer.setFirstName("George");
//            customer.setLastName("Washington");
//            customer.setEmail("george.washington@gmail.com");
//            customer.setPhone("(555) 555-6543");
//            customer.setAddress("1234 Main St");
//            customer.setCity("Mount Vernon");
//            customer.setState("VA");
//            customer.setZipCode("22121");
//            customerDAO.create(customer);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
